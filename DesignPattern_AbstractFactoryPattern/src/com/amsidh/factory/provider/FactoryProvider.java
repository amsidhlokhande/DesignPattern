package com.amsidh.factory.provider;

import com.amsidh.factory.AbstractFactory;
import com.amsidh.factory.ColorFactory;
import com.amsidh.factory.ShapeFactory;

public class FactoryProvider {

	public static AbstractFactory getFactory(String factoryName) {
		if (factoryName == null) {
			return null;
		} else if (factoryName.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (factoryName.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		} else {
			return null;
		}
	}
}
