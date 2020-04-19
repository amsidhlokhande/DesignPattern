package com.amsidh.main;

import com.amsidh.facade.ShapeMaker;

public class MainApp {

	public static void main(String[] args) {
		ShapeMaker shapeMaker=new ShapeMaker();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();

	}

}
