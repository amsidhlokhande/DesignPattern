package com.amsidh.context;

import com.amsidh.intf.State;

public class Context {

	private State state;

	public Context() {
		state = null;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}
