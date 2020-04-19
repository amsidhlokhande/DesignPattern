package com.amsidh.main;

import com.amsidh.intf.Iterator;
import com.amsidh.intf.impl.NameCollection;

public class IteratorPatternDemo {
	public static void main(String[] args) {
		NameCollection collection = new NameCollection();
		collection.addName("Amsidh");
		collection.addName("Adity");
		collection.addName("Adithi");
		collection.addName("Anjali");
		collection.addName("Nakusha");
		collection.addName("Anashuman");

		Iterator iterator = collection.getIterator();
		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			System.out.println(name);
		}
	}
}
