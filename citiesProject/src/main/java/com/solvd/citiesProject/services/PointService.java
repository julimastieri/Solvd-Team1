package com.solvd.citiesProject.services;

import java.util.HashSet;
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
	
	public Optional<Point> getById(long id) {
		Optional<Point> out = pointDAO.getOneById(id);
		Set<MyPair> connections = new HashSet();
		//set points connected with the searched point
		for(Path p : pDAO.getPathsByOrigin(out.get()).get()) {
			connections.add(new MyPair(p.getTo(),p.getDistance()));
		}
			
		out.get().setConnections(connections);
		return out;
	}
	
	//TODO save a point
}
