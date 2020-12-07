package com.solvd.citiesProject.dao.mysql;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public abstract class MySQLAbstractDAO {
	private final static int POOL_SIZE = 10;
	private static Logger logger = LogManager.getLogger(MySQLAbstractDAO.class);
	public static ConnectionPool pool = ConnectionPool.getInstance(POOL_SIZE);
	
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
