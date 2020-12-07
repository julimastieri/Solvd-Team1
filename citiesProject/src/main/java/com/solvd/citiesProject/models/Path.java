package com.solvd.citiesProject.models;

import javax.xml.bind.annotation.XmlElement;

public class Path extends AbstractEntity{
	@XmlElement(name="distance")
	private float distance;
	@XmlElement(name="pointFrom")
	private Point from;
	@XmlElement(name="pointTo")
	private Point to;
	@XmlElement(name="bidirectional")
	private boolean bidirectional;
	@XmlElement(name="transport")
	private Transport transport;
	
	public Path(float distance, long id, boolean bidirectional) {
		super(id);
		this.distance = distance;
		this.bidirectional = bidirectional;
	}
	
	public Path () {
	}
	
	@Override
	public String toString() {
		return "pathId: " + getId() + " distance: " + distance + " isBidirectional: " + bidirectional 
				+ "\n From: " + from 
				+ "\n To: " + to 
				+ "\n Transport: " + transport;
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
