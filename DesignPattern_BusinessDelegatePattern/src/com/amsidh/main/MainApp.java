package com.amsidh.main;

import com.amsidh.client.Client;
import com.amsidh.intf.impl.BusinessDelegate;

public class MainApp {

	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType("JMS");
		client.doTask();
	}

}
