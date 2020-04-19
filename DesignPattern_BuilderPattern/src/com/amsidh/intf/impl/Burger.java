package com.amsidh.intf.impl;

import com.amsidh.intf.Item;
import com.amsidh.intf.Packing;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}
	
	
}
