package com.amsidh.intf.impl;

import com.amsidh.intf.Shape;
import com.amsidh.intf.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		setRedBorderColor(shape);

	}

	public void setRedBorderColor(Shape shape) {
		System.out.println("Border Color : Red");

	}
}
