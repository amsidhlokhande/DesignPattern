package com.amsidh.intf.impl;

import com.amsidh.dto.Numbers;
import com.amsidh.intf.Chain;

public class MultiNumbers implements Chain {

	private Chain nextChain;

	@Override
	public void nextChain(Chain chain) {

		this.nextChain = chain;
	}

	@Override
	public void calculate(Numbers numbers) {
		if (numbers.getOperation().equalsIgnoreCase("add")) {
			System.out.println("Numbers " + numbers.getNumber1() + " * " + numbers.getNumber2() + " = "
					+ numbers.getNumber1() * numbers.getNumber2());
		}else
		{
			nextChain.calculate(numbers);
		}

	}

}
