package com.solvd.citiesProject.application;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.solvd.citiesProject.models.User;


public class App {
	private static final Logger LOGGER = Logger.getLogger(App.class);
	public static void main(String[] args) {
		try {
			loadDataWithMyBatis();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void loadDataWithMyBatis() throws IOException {	
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		try(SqlSession session = ((SqlSessionFactory) sqlSessionFactory).openSession()) {
			User user = session.selectOne("getOneById", 1l);
			LOGGER.info(user);
			
		}
	}
}
