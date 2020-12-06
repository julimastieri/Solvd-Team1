package com.solvd.citiesProject.parsers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MyJsonParser {
	static Logger logger = LogManager.getLogger(MyJsonParser.class);
	static ObjectMapper mapper = new ObjectMapper();
	
	public static void writeJsonFile(Object obj, String fileName) {
		String path = "src/main/resources/" + fileName;
		String jsonObj = null;
		try {
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File(path), obj);
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
