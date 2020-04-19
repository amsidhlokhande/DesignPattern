package com.amsidh.mvc.client;

import com.amsidh.mvc.filter.chain.FilterManager;

public class Client {

	FilterManager filterManager;

	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}

	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}
}
