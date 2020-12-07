package com.solvd.citiesProject.models;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "trip")
@XmlAccessorType(XmlAccessType.FIELD)
public class Trip {
	
	@XmlElementWrapper(name="paths")
	@XmlElement(name = "path")
	List<Path> paths;
	@XmlElement(name = "client")
	User client;
	
	public List<Path> getPaths() {
		return paths;
	}
	public void setPaths(List<Path> paths) {
		this.paths = paths;
	}
	public User getClient() {
		return client;
	}
	public void setClient(User client) {
		this.client = client;
	}
	
	
}
