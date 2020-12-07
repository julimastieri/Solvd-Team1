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
	@Override
	public String toString() {
		return "cityId: " + getId() + " name: " + name + " postalCode " + postalCode 
				+ " \n country: " + country;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + postalCode;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if(this.hashCode()!=obj.hashCode())
			return false;
		City other = (City) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (postalCode != other.postalCode)
			return false;
		return true;
	}
	
}
