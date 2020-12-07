package com.solvd.citiesProject.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Transport extends AbstractEntity{
	@XmlElement(name="description")
	private String description;
	@XmlElement(name="driver")
	private User driver;
	public Transport(long id, String description) {
		super(id);
		this.description = description;
	}
	public Transport() {
		
	}
	@Override
	public String toString() {
		return "transportId: " + getId() + " descrtiption: " + description 
				+ "\n driver: " + driver;
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
