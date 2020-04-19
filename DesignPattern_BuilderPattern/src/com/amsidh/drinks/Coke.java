package com.amsidh.drinks;

import com.amsidh.intf.impl.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Coke";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 30.50f;
	}

	@Override
	public String toString() {
		return "Coke [name()=" + name() + ", price()=" + price() + ", packing()=" + packing() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
