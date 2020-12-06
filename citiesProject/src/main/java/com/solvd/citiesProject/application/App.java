package com.solvd.citiesProject.application;



import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.citiesProject.astaralgorithm.AStarSearch;
import com.solvd.citiesProject.dao.IUserDAO;
import com.solvd.citiesProject.dao.mybatis.UserDAO;
import com.solvd.citiesProject.models.Path;
import com.solvd.citiesProject.models.Point;
import com.solvd.citiesProject.models.User;


public class App {
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		/*IUserDAO myBatisDao = new UserDAO();
		Optional<User> user = myBatisDao.getOneById(1L);
		LOGGER.info(user);
		user.ifPresent(u -> LOGGER.info(u));
		
		Optional<User> user2 = myBatisDao.getOneById(2L);
		LOGGER.info(user2);
		user2.ifPresent(u2 -> LOGGER.info(u2));
		*/
		
		//FINDING A PATH
		//Creating points
		Point A = new Point();
		Point B = new Point();
		Point C = new Point();
		Point D = new Point();
		Point E = new Point();
		
		//Creating Paths
		//distance, from, to, id
		Path p1 = new Path(1, A, D, 1);
		Path p2 = new Path(6, A, B, 2);
		Path p3 = new Path(1, B, D, 3);
		Path p4 = new Path(5, B, C, 4);
		Path p5 = new Path(2, B, E, 5);
		Path p6 = new Path(5, C, E, 6);
		Path p7 = new Path(1, E, D, 7);
		
		//INVERTED
		Path p8 = new Path(1, D, A, 8);
		Path p9 = new Path(6, B, A, 9);
		Path p10 = new Path(1, D, B, 10);
		Path p11 = new Path(5, C, B, 11);
		Path p12 = new Path(2, E, B, 12);
		Path p13 = new Path(5, E, C, 13);
		Path p14 = new Path(1, D, E, 14);
		
		AStarSearch as= new AStarSearch();
		as.findPath(A, C);
		
	}

}
