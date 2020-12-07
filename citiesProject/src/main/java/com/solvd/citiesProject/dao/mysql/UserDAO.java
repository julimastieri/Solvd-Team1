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
	private static final String GET_ONE_USER = ("SELECT * FROM users WHERE id = ?");
	
	@Override
	public Optional<User> getById(long id) {
		User user = null;
		ResultSet rs = null;
		Connection conn = pool.getConnection();
		
		try (PreparedStatement pr = conn.prepareStatement(GET_ONE_USER)) {
			pr.setLong(1, id);
			rs = pr.executeQuery();
			
			if (rs != null && rs.next()) {
				user = populateUser(rs);
			}
		} catch (Exception e) {
			logger.error(e);
		}
		finally {
			try {
				rs.close();
				pool.releaseConnection(conn);
			} catch (Exception e) {
				logger.error(e);
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

	private User populateUser(ResultSet rs) {
		User u = new User();
		try {
			u.setId(rs.getLong("id"));
			u.setName(rs.getString("name"));
			u.setLastName(rs.getString("last_name"));
			u.setIdentityNumber(rs.getInt("identity_number"));
			// u.setBirthday();
		} catch (SQLException e) {
			logger.error(e);
		}
		return u;
	}
	
}
