package com.solvd.citiesProject.dijkstra;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.solvd.citiesProject.models.Point;

public class Node {

	private Point point;

	private List<Node> shortestPath = new LinkedList<>();

	private Integer distance = Integer.MAX_VALUE;

	Map<Node, Integer> adjacentNodes = new HashMap<>();

	public void addDestination(Node destination, int distance) {
		adjacentNodes.put(destination, distance);
	}

	public Node (Point p) {
		this.point=p;
	}
	public Node() {

	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public List<Node> getShortestPath() {
		return shortestPath;
	}

	public void setShortestPath(List<Node> shortestPath) {
		this.shortestPath = shortestPath;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Map<Node, Integer> getAdjacentNodes() {
		return adjacentNodes;
	}

	public void setAdjacentNodes(Map<Node, Integer> adjacentNodes) {
		this.adjacentNodes = adjacentNodes;
	}
}
