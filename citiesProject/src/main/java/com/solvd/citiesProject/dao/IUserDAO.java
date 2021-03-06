package com.solvd.citiesProject.dao;

import java.util.Optional;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.solvd.citiesProject.models.User;

public interface IUserDAO extends IGenericDAO<User> {
	
	@Select("Select * from Users u where u.id = #{id}")
	@ResultMap("UserResultMap")
	public Optional<User> getById(long id);
}
