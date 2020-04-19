package com.amsidh.intf.impl;

import com.amsidh.intf.Bird;

public class NullBird implements Bird {

	@Override
	public String getName() {
		return "No Name Found";
	}

	@Override
	public void display() {
		System.out.println("No bird with this name found in the record");

	}

}
