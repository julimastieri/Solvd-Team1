package com.solvd.citiesProject.models;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

public class User extends AbstractEntity {
	@XmlElement(name="name")
	private String name;
	@XmlElement(name="lastName")
	private String lastName;
	@XmlElement(name="identityNumber")
	private int identityNumber;
	private Date birthdate;
	
	public User(long id, String name, String lastName, int identityNumber, Date birthdate) {
		super(id);
		this.name = name;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthdate = birthdate;
	}
	public User() {
		
	}
	@Override
	public String toString() {
		return "User: " + name + " " + lastName + " with identity number: " + identityNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getIdentityNumber() {
		return identityNumber;
	}
	public void setIdentityNumber(int identityNumber) {
		this.identityNumber = identityNumber;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
}
