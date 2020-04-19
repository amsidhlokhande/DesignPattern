package com.amsidh.main;

import com.amsidh.factory.AbstractFactory;
import com.amsidh.factory.provider.FactoryProvider;
import com.amsidh.service.Color;
import com.amsidh.service.Shape;

public class MainApp {

	public static void main(String []args) {
		
		AbstractFactory abstractFactory=FactoryProvider.getFactory("SHAPE");
		Shape shape = abstractFactory.getShap("Circle");
		shape.draw();
		
		shape = abstractFactory.getShap("Square");
		shape.draw();
		
		shape = abstractFactory.getShap("Rectangle");
		shape.draw();
		
		abstractFactory=FactoryProvider.getFactory("COLOR");
	   Color color=abstractFactory.getColor("Red");
	   color.fillColor();
		
	   color=abstractFactory.getColor("Yellow");
	   color.fillColor();
	   
	   color=abstractFactory.getColor("GREEN");
	   color.fillColor();
			
	}

}
