package com.solvd.citiesProject.models;

public class Path extends AbstractEntity{

	private float distance;
	private Point from;
	private Point to;
	
	public Path(float distance, Point from, Point to, long id) {
		super(id);
		this.distance = distance;
		this.from = from;
		this.to = to;
		this.from.addConnection(to,distance);
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public Point getFrom() {
		return from;
	}
	public void setFrom(Point from) {
		this.from = from;
	}
	public Point getTo() {
		return to;
	}
	public void setTo(Point to) {
		this.to = to;
	}
	
	 
	
}
