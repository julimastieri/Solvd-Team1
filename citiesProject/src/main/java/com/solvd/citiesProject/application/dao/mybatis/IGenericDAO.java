package com.solvd.citiesProject.application.dao.mybatis;

public interface IGenericDAO<E> {
	E save(E e, long id);
	boolean removeById(long id);
}
