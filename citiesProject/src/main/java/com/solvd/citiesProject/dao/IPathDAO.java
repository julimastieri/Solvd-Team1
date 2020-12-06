package com.solvd.citiesProject.dao;

import java.util.List;
import java.util.Optional;

import com.solvd.citiesProject.models.*;

public interface IPathDAO extends IGenericDAO<Path> {

	//this method returns the paths that start in the parameter point
	Optional<List<Path>> getPathsByOrigin(Point p);
	
}
