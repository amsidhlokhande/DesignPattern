package com.amsidh.factory;



import com.amsidh.service.Color;
import com.amsidh.service.Shape;
import com.amsidh.service.impl.Circle;
import com.amsidh.service.impl.Rectangle;
import com.amsidh.service.impl.Square;

public class ShapeFactory implements AbstractFactory{


	@Override
	public Shape getShap(String shapeName) {
		if (shapeName == null) {
			return null;
		} else if (shapeName.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeName.equalsIgnoreCase("SQUARE")) {
			return new Square();
		} else if (shapeName.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else {
			return null;
		}
	}

	@Override
	public Color getColor(String colorName) {
		return null;
	}

	
	
}
