package com.solvd.citiesProject.astaralgorithm;
import java.util.*;

import com.solvd.citiesProject.models.MyPair;
import com.solvd.citiesProject.models.Point;


public class AStarSearch {



	public class AStarNode implements Comparable {

		Point p;
		AStarNode pathParent;
		float costFromStart;
		float estimatedCostToGoal;

		
		public AStarNode(Point p) {
			this.p = p;
		}

		public float getCost() {
			return costFromStart + estimatedCostToGoal;
		}

		public int compareTo(Object other) {
			float thisValue = this.getCost();
			float otherValue = ((AStarNode)other).getCost();

			float v = thisValue - otherValue;
			return (v>0)?1:(v<0)?-1:0; // sign function
		}


		public float getCost(AStarNode node) {
			return p.getDistance(node.p);
		}



		public float getEstimatedCost(AStarNode node) {
			return 1000;
		}


		public List getNeighbors() {
			List<Point> points = new ArrayList<Point>();
			for(MyPair mp : p.getConnections()) {
				points.add(mp.getLeft());
			}
			return points;
		}

	}  


	public static class PriorityList extends LinkedList {

		public void add(Comparable object) {
			for (int i=0; i<size(); i++) {
				if (object.compareTo(get(i)) <= 0) {
					add(i, object);
					return;
				}
			}
			addLast(object);
		}
	}


	protected List<AStarNode> constructPath(AStarNode node) {
		LinkedList<AStarNode> path = new LinkedList<AStarNode>();
		while (node.pathParent != null) {
			path.addFirst(node);
			node = node.pathParent;
		}
		return path;
	}


	public List<AStarNode> findPath(Point A, Point B) {

		AStarNode startNode = new AStarNode(A);
		AStarNode goalNode = new AStarNode(B);
		PriorityList openList = new PriorityList();
		List<AStarNode> closedList = new LinkedList<AStarNode>();

		startNode.costFromStart=0;
		startNode.estimatedCostToGoal=startNode.getEstimatedCost(goalNode);
		startNode.pathParent=null;
		openList.add(startNode);
		AStarNode node = null;
		while (!openList.isEmpty()) {
			node = (AStarNode)openList.removeFirst();
			if (node == goalNode) {
				// construct the path from start to goal
				return constructPath(goalNode);
			}

			List<AStarNode> neighbors = node.getNeighbors();
			for (int i=0; i<neighbors.size(); i++) {
				AStarNode neighborNode = (AStarNode)neighbors.get(i);
				boolean isOpen = openList.contains(neighborNode);
				boolean isClosed = closedList.contains(neighborNode);
				float costFromStart = node.costFromStart + node.getCost(neighborNode);

				if ((!isOpen && !isClosed) || costFromStart < neighborNode.costFromStart)
				{
					neighborNode.pathParent=node;
					neighborNode.costFromStart=costFromStart;
					neighborNode.estimatedCostToGoal=neighborNode.getEstimatedCost(goalNode);
					closedList.remove(neighborNode);
				}
				if (!isOpen) {
					openList.add(neighborNode);
				}
			}
			closedList.add(node);
		}
		return closedList;
	}



}