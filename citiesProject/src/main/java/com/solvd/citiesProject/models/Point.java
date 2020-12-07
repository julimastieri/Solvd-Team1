package com.solvd.citiesProject.models;

import java.util.*;

import javax.xml.bind.annotation.XmlElement;
public class Point extends AbstractEntity {
	@XmlElement(name="street")
	private String street;
	@XmlElement(name="addressNumber")
	private int addressNumber;
	@XmlElement(name="city")
	private City city;
	private List<Path> connections;
	
	public Point(long id, String street, int addressNumber) {
		super(id);
		this.street = street;
		this.addressNumber = addressNumber;
		this.connections = new ArrayList<Path>();
	}
	public Point() {
		this.connections = new ArrayList<Path>();
	}

	public String getStreet() {
		return street;
	}

	public List<Path> getConnections() {
		return connections;
	}

	public void setConnections(List<Path> connections) {
		this.connections = connections;
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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + addressNumber;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((connections == null) ? 0 : connections.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		Point other = (Point) obj;
		if (addressNumber != other.addressNumber)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (connections == null) {
			if (other.connections != null)
				return false;
		} else if (!connections.equals(other.connections))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}

	//get the distance from a point to other
	public float getDistance(Point p) {
		float out = 0;
		for(Path path : connections) {
			if(path.getTo().equals(p)||path.getFrom().equals(p))
				return path.getDistance();
		}
		return out;
	}

	public void addConnection(Path path) {
		this.connections.add(path);
	}

}
