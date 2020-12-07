package com.solvd.citiesProject.parsers;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.ObjectFactory;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.citiesProject.application.App;
import com.solvd.citiesProject.models.Path;
import com.solvd.citiesProject.models.Point;
import com.solvd.citiesProject.models.Transport;
import com.solvd.citiesProject.models.Trip;
import com.solvd.citiesProject.models.User;


public class JaxbApi {
	private static Logger logger = LogManager.getLogger(JaxbApi.class);
	
	
	public static void main(String[] args) {
		JAXBContext c;
		try {
			c = JAXBContext.newInstance(Trip.class);
			List<Path> paths = new ArrayList<Path>();

			Path p = new Path(4, new Point(), new Point(1, null, 5, 32, 31), 1, true, new Transport());
			Path p2 = new Path(4, new Point(), new Point(1, null, 2, 37, 71), 2, true, new Transport());
			paths.add(p);
			paths.add(p2);
			Trip trip = new Trip();
			paths.forEach(paaa -> {
				paaa.getFrom().removeConnections();
				paaa.getTo().removeConnections();
			});
			trip.setPaths(paths);

			Marshaller mar = c.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			mar.marshal(trip, System.out);
			
		} catch (JAXBException e) {
			logger.error(e);
		}
		
		
	}
	
	public static void writeXMLFile(List<Path> paths) {
		//static method for App to call
		JAXBContext c;
		try {
			

			c = JAXBContext.newInstance(Trip.class);
			
			Marshaller mar = c.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			paths.forEach(p -> {
				p.getFrom().removeConnections();
				p.getTo().removeConnections();
			});
			Trip trip = new Trip();
			trip.setClient(new User());
			trip.setPaths(paths);
			mar.marshal(trip, System.out);
			
		} catch (JAXBException e) {
			logger.error(e);
		}
	}
	
}
