package com.amsidh.intf.impl;

import com.amsidh.intf.Order;

public class BuyOrder implements Order {

	@Override
	public void executeOrder() {
		System.out.println("Buy order");

	}

}
