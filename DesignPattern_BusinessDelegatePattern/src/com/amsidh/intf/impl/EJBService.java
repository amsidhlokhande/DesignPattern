package com.amsidh.intf.impl;

import com.amsidh.intf.BusinessService;

public class EJBService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}

}
