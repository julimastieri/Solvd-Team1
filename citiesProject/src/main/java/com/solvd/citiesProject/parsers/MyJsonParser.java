package com.solvd.citiesProject.parsers;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
	
	
	public static void writeJsonFile(List<Path> paths, User client, String fileName) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		mapper.setDateFormat(df);
		String path = "src/main/resources/" + fileName;
		String jsonObj = null;
		Trip trip = new Trip();
		trip.setClient(client);
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
