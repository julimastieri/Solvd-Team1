package com.solvd.citiesProject.services;

import java.util.*;

import com.solvd.citiesProject.dao.*;
import com.solvd.citiesProject.models.*;

public class PointService {
	private IPathDAO pDAO;
	private IPointDAO pointDAO;

	public PointService() {
		//pDAO = new PathDAO();
		//pointDAO = new pointDAO();
	}
	
	public List<Point> getAll() {
		List<Point> points = pointDAO.getAll();
		List<Path> paths = pDAO.getAll();
		//set points connected with the searched point
		for(Point p: points) {
			for(Path pa: paths) {
				if(pa.getFrom().equals(p) || (pa.getTo().equals(p) && pa.isBidirectional())) {
					p.addConnection(pa);
				}
			}
		}
		return points;
	}
	
}
