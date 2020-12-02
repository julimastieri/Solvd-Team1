package com.solvd.citiesProject.dao.mybatis;

public interface IGenericDAO<E> {
	E save(E e, long id);
	boolean removeById(long id);
	E getOneById(long id);
}
