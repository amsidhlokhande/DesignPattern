package com.amsidh.intf.impl;

import com.amsidh.intf.Shape;

public class Circle implements Shape {

	public Circle() {
		System.out.println("Circle constructor called");
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
