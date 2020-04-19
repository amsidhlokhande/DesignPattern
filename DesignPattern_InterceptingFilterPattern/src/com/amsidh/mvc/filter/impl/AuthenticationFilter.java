package com.amsidh.mvc.filter.impl;

import com.amsidh.mvc.filter.Filter;

public class AuthenticationFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("Authenticating request: " + request);
	}

}
