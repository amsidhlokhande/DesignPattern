package com.amsidh.main;

import com.amsidh.cache.ShapeCache;
import com.amsidh.intf.Shape;

public class MainApp {

	public static void main(String[] args) {
		ShapeCache shapCache=new ShapeCache();
		Shape circle = shapCache.getShape("Circle");
		circle.draw();
		System.out.println(circle.hashCode());
		
		Shape circle1 = shapCache.getShape("Circle");
		circle1.draw();
		System.out.println(circle1.hashCode());

		Shape square1 = shapCache.getShape("Square");
		square1.draw();
		System.out.println(square1.hashCode());
		Shape square2 = shapCache.getShape("Square");
		square2.draw();
		System.out.println(square2.hashCode());
		
		Shape square3 = shapCache.getShape("Square");
		square3.draw();
		System.out.println(square3.hashCode());
		
	}

}
