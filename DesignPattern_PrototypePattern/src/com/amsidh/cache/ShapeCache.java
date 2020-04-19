package com.amsidh.cache;

import java.util.HashMap;
import java.util.Map;

import com.amsidh.intf.Shape;
import com.amsidh.intf.impl.Circle;
import com.amsidh.intf.impl.Rectangle;
import com.amsidh.intf.impl.Square;

public class ShapeCache {

	private static Map<String, Shape> shapeCache = new HashMap<>();

	static{
		loadMap();
	}
	public static void loadMap() {
		shapeCache.put("circle", new Circle());
		shapeCache.put("rectangle", new Rectangle());
		shapeCache.put("square", new Square());
	}

	public Shape getShape(String shape) {
		return shapeCache.get(shape.toLowerCase());
	}
}
