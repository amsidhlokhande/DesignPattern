package com.amsidh.device;

public class TV32Inches extends AbstractTVDevice {

	public int vedioSpeed;

	@Override
	public void deviceSize(int lenght, int width) {
		System.out.println("Size Of TV : Length * Width= " + lenght + " * " + width);
	}

	@Override
	public void pressButtonNine() {
		vedioSpeed++;
		System.out.println("Vedio speed Increased: " + vedioSpeed);

	}

	@Override
	public void pressButtonEight() {
		vedioSpeed--;
		System.out.println("Vedio speed decreased: " + vedioSpeed);
	}

}
