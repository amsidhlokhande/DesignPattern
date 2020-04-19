package com.amsidh.intf.impl;

import com.amsidh.intf.Order;

public class SaleOrder implements Order {

	@Override
	public void executeOrder() {
		System.out.println("Sale order");

	}

}
