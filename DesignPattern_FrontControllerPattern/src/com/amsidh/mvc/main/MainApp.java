package com.amsidh.mvc.main;

import com.amsidh.mvc.controller.FrontController;

public class MainApp {

	public static void main(String[] args) {

		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}
}
