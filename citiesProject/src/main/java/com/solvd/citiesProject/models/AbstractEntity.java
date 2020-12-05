package com.solvd.citiesProject.models;

public abstract class AbstractEntity {
	private long id;

	protected AbstractEntity(long id) {
		this.id=id;
	}
	public AbstractEntity() {
		
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
