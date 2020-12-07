package com.solvd.citiesProject.services;

import java.util.*;

import com.solvd.citiesProject.dao.*;
import com.solvd.citiesProject.dao.mysql.PointDAO;
import com.solvd.citiesProject.dao.mysql.PathDAO;
import com.solvd.citiesProject.models.*;

public class PointService {
	private IPathDAO pathDAO;
	private IPointDAO pointDAO;

	public PointService() {
		pathDAO = new PathDAO();
		pointDAO = new PointDAO();
	}
	
	public List<Point> getAll() {
		List<Point> points = pointDAO.getAll();
		List<Path> paths = pathDAO.getAll();
		//set points connected with the searched point
		for(Point p: points) {
			for(Path pa: paths) {
				if(pa.getFrom().getId() == p.getId() || (pa.getTo().getId() == p.getId() && pa.isBidirectional())) {
					p.addConnection(pa);
				}
			}
		}
		return points;
	}
	
}
