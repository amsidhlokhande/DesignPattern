package com.amsidh.main;

import com.amsidh.dto.User;
import com.amsidh.mediator.ChatBoxMediator;

public class MainApp {

	public static void main(String[] args) {
		User user1 = new User("Amsidh");
		User user2 = new User("Anush");
		user1.setMessage("Hello Anush");
		user2.setMessage("Hi Amsidh, How are you");

		ChatBoxMediator.showMessage(user1);
		ChatBoxMediator.showMessage(user2);
	}

}
