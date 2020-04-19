package com.amsidh.device;

public abstract class AbstractTVDevice {

	int volumeSize;

	
	public abstract void deviceSize(int lenght, int width);

	public void pressButtonTen() {
		System.out.println("Playing TV...");
	}
	
	public void pressButtonFive() {
		System.out.println("Pausing TV...");
	}
	
	public void pressButtonTwo() {
		volumeSize--;
		System.out.println("Volume decreased :" + volumeSize);
	}

	public void pressButtonThree() {
		volumeSize++;
		System.out.println("Volume increased :" + volumeSize);
	}

	public abstract void pressButtonNine();

	public abstract void pressButtonEight();
}
