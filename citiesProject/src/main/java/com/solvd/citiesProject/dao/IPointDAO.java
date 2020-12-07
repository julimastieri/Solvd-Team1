package com.solvd.citiesProject.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.solvd.citiesProject.models.Point;

public interface IPointDAO extends IGenericDAO<Point>{
	
	@Select("Select p.*, "
			+ "c.id as city_id, c.name as city_name, c.postal_code as city_postal_code, "
			+ "coun.id as coun_id, coun.name as coun_name "
			+ "from Points p LEFT JOIN Cities c ON p.city_id = c.id "
			+ "LEFT JOIN Countries coun ON coun.id = c.country_id")
	@ResultMap("PointResultMap")
	public List<Point> getAll();
}
