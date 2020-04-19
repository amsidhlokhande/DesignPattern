package com.amsidh.remote;

import com.amsidh.device.AbstractTVDevice;

public abstract class AbstractRemote {

	private AbstractTVDevice abstractTVDevice;

	public AbstractRemote(AbstractTVDevice abstractTVDevice) {
		this.abstractTVDevice = abstractTVDevice;
	}

	public void pressButtonTen() {
		abstractTVDevice.pressButtonTen();
	}

	public void pressButtonFive() {
		abstractTVDevice.pressButtonFive();
	}

	public void pressButtonTwo() {
		abstractTVDevice.pressButtonTwo();
	}

	public void pressButtonThree() {
		abstractTVDevice.pressButtonThree();
	}

	
	public abstract void pressButtonNine();

	public abstract void pressButtonEight();
}
