package com.amsidh.intf.impl;

import com.amsidh.intf.Shape;

public class Circle implements Shape {

	private String color;
	private int x;
	private int y;
	private int radius;

	public Circle(String color) {
		super();
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println(this.toString());

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [color=" + color + ", x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}

}
