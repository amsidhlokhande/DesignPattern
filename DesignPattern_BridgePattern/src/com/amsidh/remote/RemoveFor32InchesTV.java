package com.amsidh.remote;

import com.amsidh.device.TV32Inches;

public class RemoveFor32InchesTV extends AbstractRemote {

	private TV32Inches tv32Inches;

	public RemoveFor32InchesTV(TV32Inches tv32Inches) {
		super(tv32Inches);
		
		this.tv32Inches=tv32Inches;
	}

	@Override
	public void pressButtonNine() {
		tv32Inches.pressButtonNine();
	}

	@Override
	public void pressButtonEight() {
		tv32Inches.pressButtonEight();

	}

}
