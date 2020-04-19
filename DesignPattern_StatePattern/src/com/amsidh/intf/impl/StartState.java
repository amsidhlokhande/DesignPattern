package com.amsidh.intf.impl;

import com.amsidh.context.Context;
import com.amsidh.intf.State;

public class StartState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in start state");
		context.setState(this);
	}

	public String toString() {
		return "Start State";
	}
}
