package com.solvd.citiesProject.dijkstra;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import com.solvd.citiesProject.models.Path;
import com.solvd.citiesProject.models.Point;

public class Node {

	private Point point;

	private List<Path> shortestPath = new LinkedList<>();

	private Float distance = Float.MAX_VALUE;
	
	private List<Path> adj;

	public Node (Point p) {
		this.point=p;
		this.adj = new ArrayList<Path>(p.getConnections());
	}
	public Node() {

	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public List<Path> getShortestPath() {
		return shortestPath;
	}

	public void setShortestPath(List<Path> shortestPath) {
		this.shortestPath = shortestPath;
	}

	public Float getDistance() {
		return distance;
	}

	public void setDistance(Float distance) {
		this.distance = distance;
	}

	public List<Path> getAdjacentNodes() {
		return adj;
	}
	public void cleanAdj() {
		adj.clear();
	}
	@Override
	public String toString() {
		return "Node " + getPoint().getId();
	}


}