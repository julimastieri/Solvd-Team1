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
	private static final String GET_ALL_POINTS = ("Select p.*, c.id as city_id, c.name as city_name, c.postal_code as city_postal_code, "
			+ "	coun.id as coun_id, coun.name as coun_name, coun.code as coun_code "
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

		try (Connection conn = pool.getConnection();
				PreparedStatement pr = conn.prepareStatement(GET_ALL_POINTS);
				ResultSet rs = pr.executeQuery();) {
			while (rs.next()) {
				points.add(populatePoint(rs));
			}
		} catch (Exception e) {
			logger.error(e);
		}

		return points;
	}

	private Point populatePoint(ResultSet rs) throws SQLException {
		Point p = new Point(rs.getLong("id"), rs.getString("street"), rs.getInt("number"), rs.getDouble("latitude"), rs.getDouble("longitude"));
		City city = new City(rs.getLong("city_id"), rs.getString("city_name"), rs.getInt("city_postal_code"));
		city.setCountry(new Country(rs.getLong("coun_id"), rs.getString("coun_name"), rs.getInt("coun_code")));
		p.setCity(city);
		return p;
	}

}
