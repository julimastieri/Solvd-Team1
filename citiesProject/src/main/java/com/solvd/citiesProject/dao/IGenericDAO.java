package com.solvd.citiesProject.dao;

import java.util.List;
import java.util.Optional;

public interface IGenericDAO<E> {
	E save(E e);
	boolean removeById(long id);
	Optional<E> getOneById(long id);
	List<E> getAll();
}
