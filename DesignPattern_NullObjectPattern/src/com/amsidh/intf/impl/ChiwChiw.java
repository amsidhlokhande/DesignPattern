package com.amsidh.intf.impl;

import com.amsidh.intf.Bird;

public class ChiwChiw implements Bird {

	@Override
	public String getName() {
		return "ChiwChiw";
	}

	@Override
	public void display() {
		System.out.println("This is Chiwchiw bird");
	}

}
