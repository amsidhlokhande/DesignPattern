package com.amsidh.intf.impl;

import com.amsidh.intf.BusinessService;

public class BusinessLookUp {
	public BusinessService getBusinessService(String serviceType) {

		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}
