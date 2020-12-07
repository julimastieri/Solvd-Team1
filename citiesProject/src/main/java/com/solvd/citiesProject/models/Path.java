package com.solvd.citiesProject.models;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Path extends AbstractEntity{
	@XmlElement(name="pointFrom")
	private Point from;
	@XmlElement(name="pointTo")
	private Point to;
	@XmlElement(name="bidirectional")
	private boolean bidirectional;
	@XmlElement(name="transport")
	private Transport transport;
	@XmlElement(name="distance")
	private float distance;
	
	

	public Path(float d,Point from, Point to, long id, boolean bidirectional,  Transport trans) {
		super(id);
		this.bidirectional = bidirectional;
		this.from = from;
		this.to = to;
		this.distance=d;
		this.transport = trans;
		from.addConnection(this);
		if (bidirectional) 
			to.addConnection(this);
	}
	
	public Path(float distance, long id, boolean bidirectional) {
		super(id);
		this.bidirectional = bidirectional;
		this.distance = distance;
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
	public Point getFrom() {
		return from;
	}
	public void setFrom(Point from) {
		from.addConnection(this);
		this.from = from;
	}
	public Point getTo() {
		return to;
	}
	public void setTo(Point to) {
		if (bidirectional) 
			to.addConnection(this);
		this.to = to;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	
	public void setDistance(float distance) {
		this.distance = distance;
	}
	
	

}
