package com.amsidh.mvc.main;

import com.amsidh.mvc.client.Client;
import com.amsidh.mvc.filter.chain.FilterManager;
import com.amsidh.mvc.filter.impl.AuthenticationFilter;
import com.amsidh.mvc.filter.impl.LoggingFilter;
import com.amsidh.mvc.target.Target;

public class MainApp {

	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new LoggingFilter());

		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("HOME");
	}
}
