package com.solvd.citiesProject.dao.mybatis;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.citiesProject.dao.IUserDAO;
import com.solvd.citiesProject.models.User;

public class UserDAO implements IUserDAO {
	private static Logger logger = LogManager.getLogger(UserDAO.class);
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
	public Optional<User> getById(long id) {
	Optional<User> user = Optional.empty();
	try {
		user = MyBatisUtils.getInstance().getSession().openSession().getMapper(IUserDAO.class).getById(id);
	} catch (IOException e) {
		logger.error(e);
	}
	return user;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
