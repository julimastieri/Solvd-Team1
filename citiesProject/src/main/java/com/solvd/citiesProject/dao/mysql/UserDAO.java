package com.solvd.citiesProject.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.citiesProject.dao.IUserDAO;
import com.solvd.citiesProject.models.User;

public class UserDAO extends MySQLAbstractDAO implements IUserDAO {

	private Logger logger = LogManager.getLogger(UserDAO.class);
	private static final String GET_USER = "SELECT * FROM Users WHERE id = ?";
	
	@Override
	public Optional<User> getById(long id) {
		User user = null;
		Connection conn = null;
		try {
			conn = pool.getConnection();
		} catch (InterruptedException | SQLException e1) {
			logger.info(e1);
		} 
		try (PreparedStatement pr = conn.prepareStatement(GET_USER);
				ResultSet rs = pr.executeQuery();
				) {
			pr.setLong(1, id);
			if (rs.next()) {
				user = populateUser(rs);
			}
		} catch (Exception e) {
			logger.error(e);
		} finally {
			try {
				pool.releaseConnection(conn);
			} catch (InterruptedException e) {
				logger.info(e);
			}
		}
		return Optional.ofNullable(user);
	}
	
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
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	private User populateUser(ResultSet rs) throws SQLException {
		return new User(rs.getLong("id"), rs.getString("name"), rs.getString("last_name"), rs.getInt("identity_number"), rs.getDate("birthdate"));
	}
	
}
