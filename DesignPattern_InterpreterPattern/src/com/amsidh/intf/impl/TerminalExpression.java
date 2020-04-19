package com.amsidh.intf.impl;

import com.amsidh.intf.Expression;

public class TerminalExpression implements Expression {

	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {

		if (context.contains(data)) {
			return true;
		}
		return false;
	}
}
