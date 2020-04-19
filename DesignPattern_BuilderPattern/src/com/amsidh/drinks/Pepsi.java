package com.amsidh.drinks;

import com.amsidh.intf.impl.ColdDrink;

public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Pepsi";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 12.50f;
	}

	@Override
	public String toString() {
		return "Pepsi [name()=" + name() + ", price()=" + price() + ", packing()=" + packing() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
