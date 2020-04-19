package com.amsidh.burger;

import com.amsidh.intf.impl.Burger;

public class NonVegBurger extends Burger {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Non-Veg Burger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 250.45f;
	}

	@Override
	public String toString() {
		return "NonVegBurger [name()=" + name() + ", price()=" + price() + ", packing()=" + packing() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
