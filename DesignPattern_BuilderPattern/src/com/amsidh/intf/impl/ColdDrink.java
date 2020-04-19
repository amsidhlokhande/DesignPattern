package com.amsidh.intf.impl;

import com.amsidh.intf.Item;
import com.amsidh.intf.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

}
