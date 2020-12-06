package com.solvd.citiesProject.services;

import java.util.*;
import java.util.Optional;
import java.util.Set;

import com.solvd.citiesProject.dao.*;
import com.solvd.citiesProject.models.*;

public class PointService {
	private IPathDAO pDAO;
	private IPointDAO pointDAO;

	public PointService() {
		//pDAO = new PathDAO();
		//pointDAO = new pointDAO();
	}
	
	public List<Point> getAllPoints() {
		List<Point> out = pointDAO.getAll();
		List<Path> connections = new ArrayList<Path>();
		//set points connected with the searched point
		for(Path p : pDAO.getPathsByPointId(out.get()).get()) {
			connections.add(new Path(p.getTo(),p.getDistance()));
		}
			
		out.get().setConnections(connections);
		return out;
	}
	
	//TODO save a point
}
