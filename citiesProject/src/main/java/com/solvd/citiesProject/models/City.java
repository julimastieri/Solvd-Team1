package com.solvd.citiesProject.models;

public class City extends AbstractEntity {
	private String name;
	private int postalCode;
	private Country country;
	
	public City(long id, String name, int postalCode) {
		super(id);
		this.name = name;
		this.postalCode = postalCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
}
