package com.solvd.citiesProject.models;

import java.awt.geom.Point2D;
import java.util.*;

import javax.xml.bind.annotation.XmlElement;

public class Point extends AbstractEntity {

	@XmlElement(name = "street")

	private String street;
	@XmlElement(name = "addressNumber")
	private int addressNumber;
	@XmlElement(name = "city")
	private double latitude;
	private double longitude;

	private City city;
	private List<Path> connections;

	public Point(long id, String street, int addressNumber, double latitude, double longitude) {
		super(id);
		this.street = street;
		this.addressNumber = addressNumber;
		this.connections = new ArrayList<Path>();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Point() {
		this.connections = new ArrayList<Path>();
	}

	@Override
	public String toString() {
		return "pointId: " + getId() + " street: " + street + " addressNumber: " + addressNumber + " latitude: " + latitude + " longitude: " + longitude 
				+ "\n City: " + city;
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
		result = (int) (prime * result + getId());
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
		if (this.hashCode() != obj.hashCode())
			return false;

		Point other = (Point) obj;
		if (getId() != other.getId())
			return false;

		return true;
	}

	public float getDistance(Point p) {
		float out = 0;
		for (Path path : connections) {
			if (path.getTo().equals(p) || path.getFrom().equals(p))
				return path.getDistance();
		}
		return out;
	}

	public void addConnection(Path path) {
		this.connections.add(path);
	}
	
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	 public double getStraightDistance(Point to) {
		 return Point2D.distance(this.getLatitude(), this.getLongitude(), to.getLatitude(), to.getLongitude());
	 }
	

}
