package com.solvd.citiesProject.dao;

import java.util.Optional;

public interface IGenericDAO<E> {
	E save(E e, long id);
	boolean removeById(long id);
	Optional<E> getOneById(long id);
}
