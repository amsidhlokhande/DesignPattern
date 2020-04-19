package com.amsidh.factory;



import com.amsidh.service.Color;
import com.amsidh.service.Shape;
import com.amsidh.service.impl.Green;
import com.amsidh.service.impl.Red;
import com.amsidh.service.impl.Yellow;

public class ColorFactory implements AbstractFactory{

	@Override
	public Shape getShap(String shapName) {
		return null;
	}

	@Override
	public Color getColor(String colorName) {
		if (colorName == null) {
			return null;
		} else if (colorName.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (colorName.equalsIgnoreCase("YELLOW")) {
			return new Yellow();
		}else if (colorName.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else {
			return null;
		}
	}

}
