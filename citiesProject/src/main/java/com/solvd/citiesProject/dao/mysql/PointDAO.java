package com.solvd.citiesProject.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.citiesProject.dao.IPointDAO;
import com.solvd.citiesProject.models.City;
import com.solvd.citiesProject.models.Country;
import com.solvd.citiesProject.models.Point;

public class PointDAO extends MySQLAbstractDAO implements IPointDAO {
	private Logger logger = LogManager.getLogger(PointDAO.class);
	private static final String GET_ALL_POINTS = 
			("Select p.*, c.id as city_id, c.name as city_name, c.postal_code as city_postal_code, "
			+ "	coun.id as coun_id, coun.name as coun_name "
			+ "	FROM Points p LEFT JOIN Cities c ON p.city_id = c.id "
			+ "	LEFT JOIN Countries coun ON coun.id = c.country_id");
	
	@Override
	public Point save(Point e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Point> getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Point> getAll() {
		List<Point> points = new ArrayList<Point>();
		ResultSet rs = null;
		Connection conn = pool.getConnection();
		
		try (PreparedStatement pr = conn.prepareStatement(GET_ALL_POINTS)) {
			rs = pr.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					Point p = populatePoint(rs);
					City city = new City(rs.getLong("city_id"), rs.getString("city_name"), rs.getInt("city_postal_code"));
					city.setCountry(new Country(rs.getLong("coun_id"), rs.getString("coun_name"), 123));
					p.setCity(city);
					points.add(p);
				}
			}
		} catch (Exception e) {
			logger.error(e);
		}
		finally {
			try {
				rs.close();
				pool.releaseConnection(conn);
			} catch (SQLException sqlExc) {
				logger.error(sqlExc);
			} catch (Exception exc) {
				logger.error(exc);
			}
		}
		return points;
	}
	
	private Point populatePoint(ResultSet rs) {
		Point p = new Point();
		try {
			p.setId(rs.getLong("p.id"));
			//p.setAddressNumber
			//p.setStreet
			
		} catch (SQLException e) {
			logger.error(e);
		}
		return p;
		
	}
	
}
