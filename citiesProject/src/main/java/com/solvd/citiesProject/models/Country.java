package com.solvd.citiesProject.models;

import javax.xml.bind.annotation.XmlElement;

public class Country extends AbstractEntity{
	@XmlElement(name="name")
	private String name;
	@XmlElement(name="code")
	private int code;
	public Country(long id, String name, int code) {
		super(id);
		this.name = name;
		this.code = code;
	}
	public Country() {
		
	}
	@Override
	public String toString() {
		return "countryId: " + getId() + " name: " + name + " code: " + code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
}
