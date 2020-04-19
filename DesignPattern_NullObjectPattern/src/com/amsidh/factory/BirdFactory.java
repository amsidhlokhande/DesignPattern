package com.amsidh.factory;

import com.amsidh.intf.Bird;
import com.amsidh.intf.impl.ChiwChiw;
import com.amsidh.intf.impl.NullBird;
import com.amsidh.intf.impl.Peocock;

public class BirdFactory {

	public Bird getBird(String str) {
		if (str.equalsIgnoreCase("Peocock")) {
			return new Peocock();
		} else if (str.equalsIgnoreCase("ChiwChiw")) {
			return new ChiwChiw();
		} else {
			return new NullBird();
		}

	}
}
