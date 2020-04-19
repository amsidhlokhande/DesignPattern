package com.amsidh.dto;

import com.amsidh.intf.Chain;

public class Numbers {

	private Integer number1;
	private Integer number2;

	private String operation;

	public Numbers(Integer number1, Integer number2, String operation) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.operation = operation;
	}

	public Integer getNumber1() {
		return number1;
	}

	public Integer getNumber2() {
		return number2;
	}

	public String getOperation() {
		return operation;
	}

}
