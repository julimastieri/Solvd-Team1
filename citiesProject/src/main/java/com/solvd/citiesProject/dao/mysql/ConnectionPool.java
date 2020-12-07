package com.solvd.citiesProject.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ConnectionPool {
	private BlockingQueue<Connection> pool;
	private AtomicInteger connectionsCreated;
	private static ConnectionPool singleton;
	private static Logger logger = LogManager.getLogger(ConnectionPool.class);
	private static String user;
	private static String pass;
	private static String url;
	
	private ConnectionPool() {
		pool = new ArrayBlockingQueue<Connection>(5);
		connectionsCreated = new AtomicInteger(0);
		configConnectionPool();
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			logger.error(e);
		}
	}
	
	public static ConnectionPool getInstance() {
		if(singleton == null) {
			singleton = new ConnectionPool();
		}
		return singleton;
	}
	
	private static void configConnectionPool(){
		Properties prop = MySQLAbstractDAO.getConfig();
		url    = prop.getProperty("jdbc.url");
		user   = prop.getProperty("jdbc.username");
		pass   = prop.getProperty("jdbc.password");

		logger.info("Now configured!");
	}
	
	 public Connection getConnection() {
		Connection conn = null;
		 
		if(pool.size() > 0 ) {
			 try {
				return pool.take();
			} catch (InterruptedException e) {
				logger.error(e);
			}
		 }
		 
		 if (connectionsCreated.get() < 5) {
			Connection newConn = realizeConnection().get();
			connectionsCreated.getAndIncrement();
			return newConn;
		 }
		
	 	 while(pool.size() == 0) {
	 		 try {
	 			logger.info("I should wait");
	 			wait();
				conn = pool.take();
			} catch (InterruptedException e) {
				logger.error(e);
			}
	 	 }
	 	
	 	 return conn;
}
		
	public synchronized void releaseConnection(Connection conn) {
		if(!pool.contains(conn)){
			pool.add(conn);
			notifyAll();
			//logger.info("Connection released: " + conn + " now it's available in the pool");
		}
	}
	
	public Optional<Connection> realizeConnection() {
		Optional<Connection> connection = null;
		try {
			connection = Optional.ofNullable(DriverManager.getConnection(
						url + "?serverTimezone=UTC",
						user,
						pass));
		} catch (SQLException e) {
			logger.error(e);
		}
		
		return connection;
	}
	
	public synchronized void closeAll() {
		try {
			logger.info("Waiting maximum 10 seconds until all connections are back in the pool..");
			wait(10000);
		} catch (InterruptedException e) {
			logger.error(e);
		}
		
		pool.stream().forEach(c -> {
			try {
				c.close();
			} catch (SQLException e) {
				logger.error(e);
			}
		});
		pool.clear();
		logger.info("All connections were closed");
	}
}
