package com.amsidh.intf.impl;

import com.amsidh.intf.Shape;

public class Square implements Shape {

	public Square() {
		System.out.println("Square constructor called");
	}

	@Override
	public void draw() {
		System.out.println("Drawing Square");

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
