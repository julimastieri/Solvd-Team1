package com.solvd.citiesProject.dao.mysql;

import java.util.Optional;

import com.solvd.citiesProject.dao.IUserDAO;
import com.solvd.citiesProject.models.User;

public class UserDAO extends MySQLAbstractDAO implements IUserDAO {

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<User> getOneById(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
