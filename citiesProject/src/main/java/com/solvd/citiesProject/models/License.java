package com.solvd.citiesProject.models;

import java.util.Date;

public class License extends AbstractEntity {
	private Date expirationDate;
	private User driver;
	
	public License(long id, Date expirationDate, User driver) {
		super(id);
		this.expirationDate = expirationDate;
		this.driver = driver;
	}
	public License() {
		
	}
	public User getDriver() {
		return driver;
	}
	public void setDriver(User driver) {
		this.driver = driver;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
}
