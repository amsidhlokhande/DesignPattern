package com.amsidh.intf.impl;

import java.util.ArrayList;
import java.util.List;

import com.amsidh.intf.Order;

public class Broker {

	private List<Order> orders = new ArrayList<>();

	public void addOrder(Order order) {
		orders.add(order);
	}

	public void proccessOrder() {
		for (Order order : orders) {
			order.executeOrder();
		}
	}
}
