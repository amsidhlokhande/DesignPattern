package com.amsidh.main;

import com.amsidh.context.Context;
import com.amsidh.intf.impl.StartState;
import com.amsidh.intf.impl.StopState;

public class MainApp {

	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}

}
