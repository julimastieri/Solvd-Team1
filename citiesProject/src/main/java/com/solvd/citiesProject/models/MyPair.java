package com.solvd.citiesProject.models;

import org.apache.commons.lang3.tuple.Pair;

public class MyPair extends Pair<Point, Float>{

	private Point point;
	private Float distance;
	public MyPair(Point p, float distance) {
		this.point=p;
		this.distance=distance;
	}

	@Override
	public Float setValue(Float value) {
		distance = value;
		return distance;
	}

	@Override
	public Point getLeft() {
		return point;
	}

	@Override
	public Float getRight() {
		return distance;
	}

}
