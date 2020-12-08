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

import com.solvd.citiesProject.dao.IPathDAO;
import com.solvd.citiesProject.models.City;
import com.solvd.citiesProject.models.Country;
import com.solvd.citiesProject.models.Path;
import com.solvd.citiesProject.models.Point;
import com.solvd.citiesProject.models.Transport;
import com.solvd.citiesProject.models.User;

public class PathDAO extends MySQLAbstractDAO implements IPathDAO {
	private Logger logger = LogManager.getLogger(PointDAO.class);
	private static final String GET_ALL_PATHS = "Select path.*, "
			+ "p_from.id as p_from_id, p_from.street as p_from_street, p_from.number as p_from_number, p_from.city_id as p_from_city_id, p_from.latitude as p_from_latitude, p_from.longitude as p_from_longitude, "
			+ "p_to.id as p_to_id, p_to.street as p_to_street, p_to.number as p_to_number, p_to.city_id as p_to_city_id, p_to.latitude as p_to_latitude, p_to.longitude as p_to_longitude, "
			+ "c_from.id as c_from_city_id, c_from.name as c_from_city_name, c_from.postal_code as c_from_city_postal_code, "
			+ "c_to.id as c_to_city_id, c_to.name as c_to_city_name, c_to.postal_code as c_to_city_postal_code, "
			+ "coun_from.id as coun_from_id, coun_from.name as coun_from_name,coun_from.code as coun_from_code, "
			+ "coun_to.id as coun_to_id, coun_to.name as coun_to_name,coun_to.code as coun_to_code, "
			+ "t.id as t_id, t.description as t_description, "
			+ "u.id as u_id, u.name as u_name, u.last_name as u_last_name, u.identity_number as u_identity_number, u.birthdate as u_birthdate "
			+ "from Paths path LEFT JOIN Points p_from ON path.id_point_from = p_from.id "
			+ "LEFT JOIN Points p_to ON path.id_point_to = p_to.id "
			+ "LEFT JOIN Cities c_from ON p_from.city_id = c_from.id "
			+ "LEFT JOIN Countries coun_from ON coun_from.id = c_from.country_id "
			+ "LEFT JOIN Cities c_to ON p_to.city_id = c_to.id "
			+ "LEFT JOIN Countries coun_to ON coun_to.id = c_to.country_id "
			+ "LEFT JOIN Transports t ON t.id = path.transport_id "
			+ "LEFT JOIN Users u ON u.id = t.driver_id";

	@Override
	public Path save(Path e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Path> getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Path> getAll() {
		List<Path> paths = new ArrayList<Path>();

		try (Connection conn = pool.getConnection();
				PreparedStatement pr = conn.prepareStatement(GET_ALL_PATHS);
				ResultSet rs = pr.executeQuery();) {
			while (rs.next()) {
				paths.add(populatePath(rs));
			}
		} catch (Exception e) {
			logger.error(e);
		}

		return paths;
	}

	private Path populatePath(ResultSet rs) throws SQLException {
		Path path = new Path(rs.getFloat("distance"), rs.getLong("id"), rs.getBoolean("bidirectional"));
		
		//From
		Point from = new Point(rs.getLong("p_from_id"), rs.getString("p_from_street"), rs.getInt("p_from_number"), rs.getDouble("p_from_latitude"), rs.getDouble("p_from_longitude"));
		City cityFrom = new City(rs.getLong("c_from_city_id"), rs.getString("c_from_city_name"), rs.getInt("c_from_city_postal_code"));
		cityFrom.setCountry(new Country(rs.getLong("coun_from_id"), rs.getString("coun_from_name"), rs.getInt("coun_from_code")));
		from.setCity(cityFrom);
		path.setFrom(from);
		
		//To
		Point to = new Point(rs.getLong("p_to_id"), rs.getString("p_to_street"), rs.getInt("p_to_number"), rs.getDouble("p_to_latitude"), rs.getDouble("p_to_longitude"));
		City cityTo = new City(rs.getLong("c_to_city_id"), rs.getString("c_to_city_name"), rs.getInt("c_to_city_postal_code"));
		cityTo.setCountry(new Country(rs.getLong("coun_to_id"), rs.getString("coun_to_name"), rs.getInt("coun_to_code")));
		to.setCity(cityTo);
		path.setTo(to);
		
		//Transport
		Transport trans = new Transport(rs.getLong("t_id"), rs.getString("t_description"));
		trans.setDriver(new User(rs.getLong("u_id"), rs.getString("u_name"), rs.getString("u_last_name"), rs.getInt("u_identity_number"), rs.getDate("u_birthdate")));
		path.setTransport(trans);

		
		return path;
	}

}
