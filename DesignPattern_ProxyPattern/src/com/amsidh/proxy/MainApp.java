package com.amsidh.proxy;

import com.amsidh.intf.Image;

public class MainApp {

	public static void main(String[] args) {
		Image image = new ProxyImage();
		// Acutal objects draw method called
		image.draw();
		// proxyed object draw method called
		image.draw();
	}

}
