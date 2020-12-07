package com.solvd.citiesProject.parsers;


import java.io.File;

import java.util.List;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.solvd.citiesProject.models.Path;

import com.solvd.citiesProject.models.Trip;
import com.solvd.citiesProject.models.User;


public class JaxbApi {
	private static Logger logger = LogManager.getLogger(JaxbApi.class);
	
	public static void writeXMLFile(List<Path> paths, User client, String fileName) {
		//static method for App to call
		JAXBContext c;
		String path = "src/main/resources/" + fileName;
		try {
			c = JAXBContext.newInstance(Trip.class);
			Marshaller mar = c.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			paths.forEach(p -> {
				p.getFrom().removeConnections();
				p.getTo().removeConnections();
			});
			Trip trip = new Trip();
			trip.setClient(client);
			trip.setPaths(paths);
			mar.marshal(trip, System.out);
			mar.marshal(trip, new File(path));
			
		} catch (JAXBException e) {
			logger.error(e);
		}
	}
	
}
