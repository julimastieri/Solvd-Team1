package com.solvd.citiesProject.models;

public class Path extends AbstractEntity{

	private float distance;
	private Point from;
	private Point to;
	private boolean bidirectional;
	private Transport transport;
	
	public Path(float distance, Point from, Point to, long id, boolean bidirectional, Transport transport) {
		super(id);
		this.distance = distance;
		this.from = from;
		this.to = to;
		this.bidirectional = bidirectional;
		this.from.addConnection(this);
		this.transport = transport;
	}
	
	public Path () {
	}
	
	public boolean isBidirectional() {
		return bidirectional;
	}
	public void setBidirectional(boolean bidirectional) {
		this.bidirectional = bidirectional;
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

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	
	 
	
}
