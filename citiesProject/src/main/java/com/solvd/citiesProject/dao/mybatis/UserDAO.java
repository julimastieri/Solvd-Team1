package com.solvd.citiesProject.dao.mybatis;

import java.io.IOException;
import java.util.Optional;

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
	public Optional<User> getOneById(long id) {
		User user = null;
		try (SqlSession s = MyBatisUtils.getInstance().getSession().openSession()){
			user = s.selectOne("getOneById", id);
		} catch (IOException e) {
			logger.error(e);
		} 
		return Optional.ofNullable(user);
	}

}
