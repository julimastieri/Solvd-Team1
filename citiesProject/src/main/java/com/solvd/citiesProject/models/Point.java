package com.solvd.citiesProject.models;

import java.util.List;

public class Point extends AbstractEntity {
	private String street;
	private int addressNumber;
	private City city;
	private List<Transport> transports;
	
	public Point(long id, String street, int addressNumber, City city, List<Transport> transports) {
		super(id);
		this.street = street;
		this.addressNumber = addressNumber;
		this.city = city;
		this.transports = transports;
	}

	public List<Transport> getTransports() {
		return transports;
	}
	public void setTransports(List<Transport> transports) {
		this.transports = transports;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getAddressNumber() {
		return addressNumber;
	}
	public void setAddressNumber(int addressNumber) {
		this.addressNumber = addressNumber;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
}
