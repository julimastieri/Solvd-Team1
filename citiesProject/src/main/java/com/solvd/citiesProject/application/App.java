package com.solvd.citiesProject.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
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
import com.solvd.citiesProject.models.Transport;
import com.solvd.citiesProject.models.User;
import com.solvd.citiesProject.parsers.JaxbApi;
import com.solvd.citiesProject.parsers.MyJsonParser;

import com.solvd.citiesProject.services.*;


public class App {

	private static final Logger LOGGER = LogManager.getLogger(App.class);
	@XmlElement(name = "path")
	private static List<Path> pathListXML;
	
	public static void main(String[] args) {
		
		//Call to service
		PointService pointServ = new PointService();
		UserDAO uDAO = new UserDAO();
		User client = uDAO.getById(1).get();
		List<Point> pointList = pointServ.getAll();

	/*
		LOGGER.info(pointList.size());
		LOGGER.info(pointList.get(0));
		LOGGER.info(pointList.get(0).getConnections());
		LOGGER.info(pointList.get(1));
		LOGGER.info(pointList.get(1).getConnections());
		LOGGER.info(pointList.get(2));
		LOGGER.info(pointList.get(2).getConnections());
		LOGGER.info(pointList.get(3));
		LOGGER.info(pointList.get(3).getConnections());		
		*/
		
		// FINDING A PATH
		// Creating points
		/*
		Point a = new Point(1, null, 1, 20, 20);
		Point b = new Point(2, null, 1, 15, 25);
		Point c = new Point(3, null, 1, 30, 26);
		Point d = new Point(4, null, 1, 12, 3);
		Point e = new Point(5, null, 1, 5, 8);

		// Creating Paths
		// distance, from, to, id
		Path p1 = new Path(1, a, d, 1, true, new Transport());
		Path p2 = new Path(6, a, b, 2, true, new Transport());
		Path p3 = new Path(1, b, d, 3, true, new Transport());
		Path p4 = new Path(5, b, c, 4, true, new Transport());
		Path p5 = new Path(2, b, e, 5, true, new Transport());
		Path p6 = new Path(5, e, c, 6, true, new Transport());
		Path p7 = new Path(1, d, e, 7, true, new Transport());

		List<Point> pointList = new ArrayList<Point>();
		pointList.add(a);
		pointList.add(b);
		pointList.add(c);
		pointList.add(d);
		pointList.add(e);
		*/
		Point destiny = new Point();
		Point origin = new Point();
		
		origin = pointList.get(1);
		destiny = pointList.get(29);
		
		Point destinyOutOfPoints = new Point(6,null, 1, 6, 7);
		
		//to try one point that is in the map but is unaccesible
		//points.add(fakeDestiny); //it is disconnected
		
		String message= "... and you are in your destiny! ";
		
		
		// ASK USER FOR 2 POINTS
		while (!existInMap(origin, pointList)) {
			LOGGER.info("It isn't a valid origin.");
			// read from stream
		}

		// FIND NEAREST DESTINATION
		if (!existInMap(destiny, pointList)) {
			destiny = nearestDestination(destiny, pointList);
			LOGGER.info("The near destiny is: "+destiny.getId());
			message = "From "+ destiny.getStreet() + " "+ destiny.getAddressNumber()+ " to your original destiny you have to go by taxi.";
		}

		// CALCULATING PATH

		List<Path> path = Dijkstra.calculateShortestPathFromSource(pointList, origin, destiny);

		if (path.isEmpty()) {
			LOGGER.info("Path list empty.");
		} else {
			
			path.stream().forEach(p -> LOGGER.info("ORIGIN: " + p.getFrom().getId() + "   DESTINY: " + p.getTo().getId() ));
			LOGGER.info(message);
			JaxbApi.writeXMLFile(path, "result.xml");
			MyJsonParser.writeJsonFile(path, client, "result.json");
		}
		
		LOGGER.info("origin: "+ origin.getId()+" destiny: " +destiny.getId() );

	}
	

	private static Point nearestDestination(Point c, List<Point> points) {
		double distance = Double.MAX_VALUE;
		Point nearestPoint = new Point();
		for (Point p : points) {
			if (c.getStraightDistance(p) < distance) {
				distance = c.getStraightDistance(p);
				nearestPoint = p;
			}
		}
		return nearestPoint;
	}

	public static boolean existInMap(Point point, List<Point> points) {
		for (Point p : points) {
			if (p.equals(point))
				return true;
		}
		return false;
	}

	

}
