package com.amsidh.main;

import com.amsidh.factory.ShapeFactory;
import com.amsidh.service.Shape;

public class MainApp {

	public static void main(String[] args) {
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape shape=shapeFactory.getShape("Circle");
		shape.draw();
		
		shape=shapeFactory.getShape("rectangle");
		shape.draw();
		
		shape=shapeFactory.getShape("square");
		shape.draw();
		
		System.out.println("End of Program");

	}

}
