package com.amsidh.main;

import com.amsidh.context.Context;
import com.amsidh.intf.impl.OperationAdd;
import com.amsidh.intf.impl.OperationMultiply;
import com.amsidh.intf.impl.OperationSubstract;

public class MainApp {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
