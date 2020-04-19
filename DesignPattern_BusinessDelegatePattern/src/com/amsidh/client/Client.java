package com.amsidh.client;

import com.amsidh.intf.impl.BusinessDelegate;

public class Client {

	BusinessDelegate businessService;

	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}

	public void doTask() {
		businessService.doTask();
	}
}
