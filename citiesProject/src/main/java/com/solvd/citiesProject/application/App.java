package com.solvd.citiesProject.application;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.citiesProject.dao.IPathDAO;
import com.solvd.citiesProject.dao.IPointDAO;
import com.solvd.citiesProject.dao.IUserDAO;
import com.solvd.citiesProject.dao.mysql.PathDAO;
import com.solvd.citiesProject.dao.mysql.PointDAO;
import com.solvd.citiesProject.dao.mysql.UserDAO;
import com.solvd.citiesProject.dijkstra.Dijkstra;
import com.solvd.citiesProject.models.Path;
import com.solvd.citiesProject.models.Point;
import com.solvd.citiesProject.models.User;
import com.solvd.citiesProject.parsers.JaxbApi;
import com.solvd.citiesProject.parsers.MyJsonParser;

import com.solvd.citiesProject.services.*;


@XmlRootElement(name="trip")
@XmlAccessorType(XmlAccessType.FIELD)
public class App {
	
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	@XmlElement(name="path")
	private static List<Path> pathListXML;
	
	public static void main(String[] args) {
		
		PointService pointServ = new PointService();
		List<Point> pointList = pointServ.getAll();	
		
		LOGGER.info(pointList.size());
		
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
