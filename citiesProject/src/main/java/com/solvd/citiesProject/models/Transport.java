package com.solvd.citiesProject.models;

import javax.xml.bind.annotation.XmlElement;

public class Transport extends AbstractEntity{
	@XmlElement(name="description")
	private String description;
	@XmlElement(name="driver")
	private User driver;
	public Transport(long id, String description, User driver) {
		super(id);
		this.description = description;
		this.driver = driver;
	}
	public Transport() {
		
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getDriver() {
		return driver;
	}
	public void setDriver(User driver) {
		this.driver = driver;
	}
	
	
}
