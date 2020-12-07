package com.solvd.citiesProject.dijkstra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

import com.solvd.citiesProject.models.Path;
import com.solvd.citiesProject.models.Point;

public class Dijkstra {

	public static List<Point> calculateShortestPathFromSource(List<Point> list, Point from, Point to) {

		Node source = new Node(from);

		List<Node> nodes = convertPointsToNodes(list);
		source.setDistance((float) 0);

		Set<Node> settledNodes = new HashSet<>();
		Set<Node> unsettledNodes = new HashSet<>();

		unsettledNodes.add(source);

		while (unsettledNodes.size() != 0) {
			Node currentNode = getLowestDistanceNode(unsettledNodes);
			unsettledNodes.remove(currentNode);
			for (Path connection: currentNode.getAdjacentNodes()) {
				
				Node adjacentNode = null;
				if(currentNode.getPoint().equals(connection.getFrom())) {
					adjacentNode = new Node(connection.getTo());
					
				}else {
					adjacentNode = new Node(connection.getFrom());
				}
				Float edgeWeight = connection.getDistance();
				if (!settledNodes.contains(adjacentNode)) {
					calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
					unsettledNodes.add(adjacentNode);
				}
			}
			settledNodes.add(currentNode);
		}
		Optional<Node> node = nodes.stream().filter(n->n.getPoint().equals(to)).findFirst();
		if(node.isPresent()) {
			List<Node> out = node.get().getShortestPath();
			return convertNodesToPoints(out);
		}
		return new ArrayList<Point>();
	}

	private static List<Node> convertPointsToNodes(List<Point> list){
		List<Node> retList = new ArrayList<Node>();
		for (Point p : list) {
			retList.add(new Node(p));
		}
		return retList;
	}

	private static List<Point> convertNodesToPoints(List<Node> nodes){
		List<Point> retList = new ArrayList<Point>();
		for(Node n: nodes) {
			retList.add(n.getPoint());
		}
		return retList;
	}

	private static Node getLowestDistanceNode(Set < Node > unsettledNodes) {
		Node lowestDistanceNode = null;
		float lowestDistance = Float.MAX_VALUE;
		for (Node node: unsettledNodes) {
			float nodeDistance = node.getDistance();
			if (nodeDistance < lowestDistance) {
				lowestDistance = nodeDistance;
				lowestDistanceNode = node;
			}
		}
		return lowestDistanceNode;
	}

	private static void calculateMinimumDistance(Node evaluationNode, Float edgeWeigh, Node sourceNode) {
		float sourceDistance = sourceNode.getDistance();
		System.out.println(sourceNode.getPoint());
		System.out.println(sourceDistance);
		System.out.println(edgeWeigh);
		System.out.println(sourceDistance + edgeWeigh < evaluationNode.getDistance());
		if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
			evaluationNode.setDistance(sourceDistance + edgeWeigh);
			LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
			shortestPath.add(sourceNode);
			evaluationNode.setShortestPath(shortestPath);
		}
	}
}
