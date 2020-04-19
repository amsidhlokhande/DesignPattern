package com.amsidh.intf;

public abstract class ShapeDecorator implements Shape {

	public Shape shape;

	public ShapeDecorator(Shape shape) {
		super();
		this.shape = shape;
	}

	@Override
	public void draw() {
		shape.draw();

	}

}
