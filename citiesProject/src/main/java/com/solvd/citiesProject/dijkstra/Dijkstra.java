package com.solvd.citiesProject.dijkstra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;
import java.util.Set;

import com.solvd.citiesProject.models.Path;
import com.solvd.citiesProject.models.Point;

public class Dijkstra {
	private static final Logger LOGGER = LogManager.getLogger(Dijkstra.class);
	public static List<Path> calculateShortestPathFromSource(List<Point> list, Point from, Point to) {


		List<Node> nodes = convertPointsToNodes(list);
		Node source = searchNodeByPoint(nodes,from).get();
		source.setDistance((float) 0);

		Set<Node> settledNodes = new HashSet<>();
		Set<Node> unsettledNodes = new HashSet<>();

		Node result=new Node();
		unsettledNodes.add(source);

		while (unsettledNodes.size() != 0) {
			
			Node currentNode = getLowestDistanceNode(unsettledNodes);
			LOGGER.info("Current node:  "+currentNode.getPoint().getId());
			LOGGER.info("Adyac: :  "+currentNode.getAdjacentNodes());
			unsettledNodes.remove(currentNode);
			
			if(currentNode.getPoint().equals(to))
				result = currentNode;
			
			for (Path connection: currentNode.getAdjacentNodes()) {
			
				Node adjacentNode = null;
				if(currentNode.getPoint().equals(connection.getFrom())) {
					adjacentNode =searchNodeByPoint(nodes,connection.getTo()).get();
					
				}else {
					adjacentNode=searchNodeByPoint(nodes,connection.getFrom()).get();
				}
				Float edgeWeight = connection.getDistance();
				if (!settledNodes.contains(adjacentNode)) {
					calculateMinimumDistance(adjacentNode, edgeWeight, currentNode, connection);
					unsettledNodes.add(adjacentNode);
				}
				settledNodes.add(currentNode);
				LOGGER.info("UNSET: "+ unsettledNodes.toString());
				LOGGER.info("SET: "+settledNodes.toString());
			}

			
			currentNode.cleanAdj();
				
		}
			

	
		return result.getShortestPath();
	
	}

	
	private static Optional<Node> searchNodeByPoint(List<Node> nodes, Point point) {
		for(Node n: nodes) {
			if(n.getPoint().equals(point)) {
				return Optional.of(n);
			}
		}
		return Optional.empty();
	}
	
	private static List<Node> convertPointsToNodes(List<Point> list){
		List<Node> retList = new ArrayList<Node>();
		for (Point p : list) {
			retList.add(new Node(p));
		}
		return retList;
	}

	
	private static Node getLowestDistanceNode(Set <Node> unsettledNodes) {
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

	private static void calculateMinimumDistance(Node evaluationNode, Float edgeWeigh, Node sourceNode, Path connection) {
		float sourceDistance = sourceNode.getDistance();

		if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
			
			evaluationNode.setDistance(sourceDistance + edgeWeigh);
			LinkedList<Path> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
			shortestPath.add(connection);
			evaluationNode.setShortestPath(shortestPath);
			shortestPath.stream().forEach(p-> LOGGER.info(p));
			
		}
	}
}