package com.amsidh.remote;

import com.amsidh.device.TV41Inches;

public class RemoveFor41InchesTV2 extends AbstractRemote {

	private TV41Inches tv41Inches;

	public RemoveFor41InchesTV2(TV41Inches tv41Inches) {
		super(tv41Inches);
		this.tv41Inches=tv41Inches;
	}

	@Override
	public void pressButtonNine() {
		tv41Inches.pressButtonNine();
	}

	@Override
	public void pressButtonEight() {
		tv41Inches.pressButtonEight();

	}

}
