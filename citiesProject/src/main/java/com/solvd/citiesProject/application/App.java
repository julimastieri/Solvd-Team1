package com.solvd.citiesProject.application;



import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.citiesProject.dao.mybatis.UserDAO;
import com.solvd.citiesProject.models.User;


public class App {
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		UserDAO myBatisDao = new UserDAO();
		Optional<User> user = myBatisDao.getOneById(1l);
		user.ifPresent(u -> LOGGER.info(u));
	}

}
