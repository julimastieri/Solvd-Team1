package com.solvd.citiesProject.parsers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solvd.citiesProject.models.Path;
import com.solvd.citiesProject.models.Point;
import com.solvd.citiesProject.models.Transport;
import com.solvd.citiesProject.models.Trip;
import com.solvd.citiesProject.models.User;


public class MyJsonParser {
	static Logger logger = LogManager.getLogger(MyJsonParser.class);
	static ObjectMapper mapper = new ObjectMapper();
	
	public static void writeTest(String fileName) {
		String path = "src/main/resources/" + fileName;
		String jsonObj = null;
		List<Path> paths = new ArrayList<Path>();
		Path p = new Path(4, new Point(1, null, 5, 326, 431), new Point(2, null, 5, 32, 31), 1, true, new Transport());
		Path p2 = new Path(10, new Point(3, null, 5, 322, 341), new Point(4, null, 2, 3337, 713), 2, true, new Transport());
		p.getFrom().setConnections(null);
		p.getTo().setConnections(null);
		p2.getFrom().setConnections(null);
		p2.getTo().setConnections(null);
		paths.add(p);
		paths.add(p2);
		Trip trip = new Trip();
		trip.setPaths(paths);
		
		try {
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path), trip);
			
		} catch (IOException e) {
			logger.error(e);
		}
		try {
		    jsonObj = FileUtils.readFileToString(new File(path), "UTF-8");
		} catch (IOException e) {
			logger.error(e);
		}
		logger.info("\nGenerated Json: \n" + jsonObj + "\n");
	}
	
	public static void writeJsonFile(List<Path> paths, String fileName) {
		String path = "src/main/resources/" + fileName;
		String jsonObj = null;
		Trip trip = new Trip();
		trip.setClient(new User(1l, "Joshua", "Acciarri", 123, new Date()));
		for(Path p : paths) {
			p.getFrom().removeConnections();
			p.getTo().removeConnections();
		}
		trip.setPaths(paths);
		try {
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path), trip);
			
		} catch (IOException e) {
			logger.error(e);
		}
		try {
		    jsonObj = FileUtils.readFileToString(new File(path), "UTF-8");
		} catch (IOException e) {
			logger.error(e);
		}
		logger.info("\nGenerated Json: \n" + jsonObj + "\n");
		
	}


}
