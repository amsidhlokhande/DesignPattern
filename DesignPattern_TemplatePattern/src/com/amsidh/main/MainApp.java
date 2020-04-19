package com.amsidh.main;

import com.amsidh.intf.Game;
import com.amsidh.intf.impl.Cricket;
import com.amsidh.intf.impl.Football;

public class MainApp {

	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}

}
