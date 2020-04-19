package com.amsidh.mediator;

import com.amsidh.dto.User;

public class ChatBoxMediator {

	public static void showMessage(User user) {
		System.out.println("User " + user.getName() + "  MSG :" + user.getMessage());
	}
}
