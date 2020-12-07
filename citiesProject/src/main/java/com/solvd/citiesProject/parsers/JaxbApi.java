package com.solvd.citiesProject.parsers;


import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.citiesProject.application.App;
import com.solvd.citiesProject.models.Path;
import com.solvd.citiesProject.models.Point;


public class JaxbApi {
	private static Logger logger = LogManager.getLogger(JaxbApi.class);
	
	public static void writeXMLFile(List<Path> paths) {
		try {
			JAXBContext c = JAXBContext.newInstance(App.class);
			Marshaller mar = c.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			// system out will be changed to xml file output
			mar.marshal(paths, System.out);
		} catch (JAXBException e) {
			logger.error(e);
		}
	}
	
}
