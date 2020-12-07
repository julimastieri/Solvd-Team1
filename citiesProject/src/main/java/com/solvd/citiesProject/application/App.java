package com.solvd.citiesProject.application;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.citiesProject.dao.IPathDAO;
import com.solvd.citiesProject.dao.IPointDAO;
import com.solvd.citiesProject.dao.IUserDAO;
import com.solvd.citiesProject.dao.mybatis.PathDAO;
import com.solvd.citiesProject.dao.mybatis.PointDAO;
import com.solvd.citiesProject.dao.mybatis.UserDAO;
import com.solvd.citiesProject.dijkstra.Dijkstra;
import com.solvd.citiesProject.models.Path;
import com.solvd.citiesProject.models.Point;
import com.solvd.citiesProject.models.User;
import com.solvd.citiesProject.parsers.MyJsonParser;

public class App {
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		
		//The country of this example is wrong!!!
		IPointDAO pointDao = new PointDAO();
		List<Point> pointList = pointDao.getAll();
		
		LOGGER.info(pointList.get(0).getId());
		LOGGER.info(pointList.get(0).getStreet());
		LOGGER.info(pointList.get(0).getAddressNumber());
		
		LOGGER.info(pointList.get(0).getCity().getId());
		LOGGER.info(pointList.get(0).getCity().getName());
		LOGGER.info(pointList.get(0).getCity().getPostalCode());
		
		LOGGER.info(pointList.get(0).getCity().getCountry().getId());
		LOGGER.info(pointList.get(0).getCity().getCountry().getName());
		
		
		/*
		IPathDAO pathDao = new PathDAO();
		List<Path> pathList = pathDao.getAll();
		
		LOGGER.info(pathList.get(0).getId());
		LOGGER.info(pathList.get(0).getDistance());
		LOGGER.info(pathList.get(0).isBidirectional());
		
		LOGGER.info(pathList.get(0).getFrom().getId());
		LOGGER.info(pathList.get(0).getFrom().getStreet());
		LOGGER.info(pathList.get(0).getFrom().getAddressNumber());
		LOGGER.info(pathList.get(0).getFrom().getCity().getId());
		LOGGER.info(pathList.get(0).getFrom().getCity().getName());
		LOGGER.info(pathList.get(0).getFrom().getCity().getPostalCode());
	
		//LOGGER.info(pointList.get(0).getCity().getCountry().getId());
		//LOGGER.info(pointList.get(0).getCity().getCountry().getName());
		
		LOGGER.info(pathList.get(0).getTo().getId());
		LOGGER.info(pathList.get(0).getTo().getStreet());
		LOGGER.info(pathList.get(0).getTo().getAddressNumber());
		
		LOGGER.info(pathList.size());
		*/
		
		/*
		IUserDAO myBatisDao = new UserDAO();
		Optional<User> user = myBatisDao.getById(1L);
		LOGGER.info(user);
		user.ifPresent(u -> LOGGER.info(u));
		
		Optional<User> user2 = myBatisDao.getById(2L);
		LOGGER.info(user2);
		user2.ifPresent(u2 -> LOGGER.info(u2));
	
		/*
		//FINDING A PATH
		//Creating points
		Point A = new Point();
		Point B = new Point();
		Point C = new Point();
		Point D = new Point();
		Point E = new Point();
		
		//Creating Paths
		//distance, from, to, id
		Path p1 = new Path(1, A, D, 1, true);
		Path p2 = new Path(6, A, B, 2, true);
		Path p3 = new Path(1, B, D, 3, true);
		Path p4 = new Path(5, B, C, 4, true);
		Path p5 = new Path(2, B, E, 5, true);
		Path p6 = new Path(5, C, E, 6, true);
		Path p7 = new Path(1, E, D, 7, true);
		
		
		List<Point> points = new ArrayList<Point>();
		points.add(A);
		points.add(B);
		points.add(C);
		points.add(D);
		points.add(E);
		
		List<Point> path = Dijkstra.calculateShortestPathFromSource(points, A, C);
		if (path.isEmpty()) {
			LOGGER.info("Path list empty");
		}
		else {
			path.stream().forEach(p-> LOGGER.info(p.toString()));
			MyJsonParser.writeJsonFile(path, "result.json");
		}
		x
		*/

	}

}
