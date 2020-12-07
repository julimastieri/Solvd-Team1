package com.solvd.citiesProject.dao;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.solvd.citiesProject.models.*;

public interface IPathDAO extends IGenericDAO<Path> {

	@Select("Select path.*, "
			+ "p_from.id as p_from_id, p_from.street as p_from_street, p_from.number as p_from_number, p_from.city_id as p_from_city_id, "
			+ "p_to.id as p_to_id, p_to.street as p_to_street, p_to.number as p_to_number, p_to.city_id as p_to_city_id, "
			+ "c_from.id as c_from_city_id, c_from.name as c_from_city_name, c_from.postal_code as c_from_city_postal_code, "
			+ "c_to.id as c_to_city_id, c_to.name as c_to_city_name, c_to.postal_code as c_to_city_postal_code, "
			+ "coun_from.id as coun_from_id, coun_from.name as coun_from_name,coun_from.code as coun_from_code "
			+ "coun_to.id as coun_to_id, coun_to.name as coun_to_name,coun_to.code as coun_to_code "
			+ "t.id as t_id, t.description as t_description, t.driver_id as t_driver_id, "
			+ "u.id as u_id, u.name as u_name, u.last_name as u_last_name, u.identity_number as u_identity_number, u.birthdate as u_birthdate "
			+ "from Paths path LEFT JOIN Points p_from ON path.id_point_from = p_from.id "
			+ "LEFT JOIN Points p_to ON path.id_point_to = p_to.id "
			+ "LEFT JOIN Cities c_from ON p_from.city_id = c_from.id "
			+ "LEFT JOIN Countries coun_from ON coun_from.id = c_from.country_id "
			+ "LEFT JOIN Cities c_to ON p_to.city_id = c_to.id "
			+ "LEFT JOIN Countries coun_to ON coun_to.id = c_to.country_id "
			+ "LEFT JOIN Transports t ON t.id = path.transport_id "
			+ "LEFT JOIN Users u ON u.id = t.driver_id")
	@ResultMap("PathResultMap")
	List<Path> getAll();

}
