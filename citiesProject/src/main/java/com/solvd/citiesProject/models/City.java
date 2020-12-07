package com.solvd.citiesProject.models;

import javax.xml.bind.annotation.XmlElement;

public class City extends AbstractEntity {
	@XmlElement(name="name")
	private String name;
	@XmlElement(name="postalCode")
	private int postalCode;
	@XmlElement(name="country")
	private Country country;
	
	public City(long id, String name, int postalCode) {
		super(id);
		this.name = name;
		this.postalCode = postalCode;
	}
	public City() {
		
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
