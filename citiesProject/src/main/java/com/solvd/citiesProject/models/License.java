package com.solvd.citiesProject.models;

import java.util.Date;

public class License extends AbstractEntity {
	private Date expirationDate;
	private User driver;
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
