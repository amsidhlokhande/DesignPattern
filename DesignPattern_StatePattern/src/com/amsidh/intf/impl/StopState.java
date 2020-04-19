package com.amsidh.intf.impl;

import com.amsidh.context.Context;
import com.amsidh.intf.State;

public class StopState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}
}
