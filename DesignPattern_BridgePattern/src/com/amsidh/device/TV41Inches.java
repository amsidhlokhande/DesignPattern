package com.amsidh.device;

public class TV41Inches extends AbstractTVDevice {

	public int contrastLevel;

	@Override
	public void deviceSize(int lenght, int width) {
		System.out.println("Size Of TV : Length * Width= " + lenght + " * " + width);

	}

	@Override
	public void pressButtonNine() {
		contrastLevel++;
		System.out.println("Contract Level increased :" + contrastLevel);

	}

	@Override
	public void pressButtonEight() {
		contrastLevel--;
		System.out.println("Contrast Level decreased :" + contrastLevel);

	}

}
