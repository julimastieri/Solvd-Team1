package com.solvd.citiesProject.dao.mysql;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public abstract class MySQLAbstractDAO {
	private static Logger logger = LogManager.getLogger(MySQLAbstractDAO.class);
	//public static ConnectionPool pool = ...
	
	public static Properties getConfig() {
		Properties properties = new Properties();
		try {
			properties.load(new FileReader("src/main/resources/db.properties"));
		} catch (IOException e) {
			logger.error(e);
		}
		return properties;
	}
	
}
