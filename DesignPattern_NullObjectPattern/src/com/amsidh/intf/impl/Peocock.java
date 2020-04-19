package com.amsidh.intf.impl;

import com.amsidh.intf.Bird;

public class Peocock implements Bird {

	@Override
	public String getName() {
		return "Peocock";

	}

	@Override
	public void display() {
		System.out.println("This is the peocock bird");

	}

}
