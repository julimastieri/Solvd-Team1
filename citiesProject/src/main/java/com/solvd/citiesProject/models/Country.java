package com.solvd.citiesProject.models;

public class Country extends AbstractEntity{
	private String name;
	private int code;
	public Country(long id, String name, int code) {
		super(id);
		this.name = name;
		this.code = code;
	}
	public Country() {
		
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
