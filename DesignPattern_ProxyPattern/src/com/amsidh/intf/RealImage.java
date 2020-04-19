package com.amsidh.intf;

public class RealImage implements Image {

	public RealImage() {
		System.out.println("RealImage constructor called");
	}

	@Override
	public void draw() {
		System.out.println("Image drawn");

	}

}
