package com.solvd.citiesProject.models;

import java.util.Date;
import java.util.List;

public class Trip{
	private Date date;
	private User passeger;
	private float price;
	private List<Point> path;
	public Trip( Date date, User passeger, float price) {
		this.date = date;
		this.passeger = passeger;
		this.price = price;
	}
	public void addPoint(Point p) {
		path.add(p);
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Point> getPath() {
		return path;
	}
	public void setPath(List<Point> path) {
		this.path = path;
	}
	public User getPasseger() {
		return passeger;
	}
	public void setPasseger(User passeger) {
		this.passeger = passeger;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
