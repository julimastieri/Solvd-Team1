package com.solvd.citiesProject.dao.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.citiesProject.dao.IUserDAO;

public class MyBatisUtils {
	private Logger logger = LogManager.getLogger(MyBatisUtils.class);
	private static MyBatisUtils instance;
	private SqlSessionFactory ssf;
	public static MyBatisUtils getInstance() throws IOException {
		if (instance == null) {
			instance = new MyBatisUtils();
		}
		return instance;
	}
	private MyBatisUtils() {
		String path= "mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(path);
		} catch (IOException e) {
			logger.error(e);
		}
		ssf = new SqlSessionFactoryBuilder().build(inputStream);
		
	}
	public SqlSessionFactory getSession() {
		return ssf;
	}
}
