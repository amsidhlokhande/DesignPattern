package com.amsidh.factory;



import com.amsidh.service.Color;
import com.amsidh.service.Shape;

public interface AbstractFactory {

	
	public Shape getShap(String shapName);
	public Color getColor(String colorName);
	
}
