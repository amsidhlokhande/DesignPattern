package com.amsidh.factory;

import java.util.HashMap;
import java.util.Map;

import com.amsidh.intf.Shape;
import com.amsidh.intf.impl.Circle;

public class ShapeFactory {
	private final static Map<String, Shape> map = new HashMap<>();

	public static Shape getCircle(String color) {
		Shape shape = map.get(color);
		if (shape == null) {
			shape = new Circle(color);
			map.put(color, shape);
			System.out.println("circle Object is created. hashcode=" + shape.hashCode());
		}

		return shape;

	}
}
