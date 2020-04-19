package com.amsidh.intf.impl;

import com.amsidh.intf.Shape;

public class Rectangle implements Shape {

	public Rectangle() {
		System.out.println("Rectangle constructor called");
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
