package com.amsidh.burger;

import com.amsidh.intf.impl.Burger;

public class VegBurger extends Burger {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Veg Burger";
	}

	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 145.50f;
	}

	@Override
	public String toString() {
		return "VegBurger [name()=" + name() + ", price()=" + price() + ", packing()=" + packing() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
