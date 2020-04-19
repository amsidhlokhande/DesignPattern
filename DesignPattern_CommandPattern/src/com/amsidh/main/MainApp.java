package com.amsidh.main;

import com.amsidh.intf.impl.Broker;
import com.amsidh.intf.impl.BuyOrder;
import com.amsidh.intf.impl.SaleOrder;

public class MainApp {

	public static void main(String[] args) {
		SaleOrder sale = new SaleOrder();
		BuyOrder buy = new BuyOrder();

		Broker broker = new Broker();
		broker.addOrder(buy);
		broker.addOrder(sale);

		broker.proccessOrder();

	}

}
