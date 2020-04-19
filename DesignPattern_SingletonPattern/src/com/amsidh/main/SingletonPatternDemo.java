package com.amsidh.main;

import com.amsidh.singleton.SingletonObject;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		SingletonObject obj1 = SingletonObject.getSingletonObjectInstance();
		obj1.displayMessage();
		obj1.getNums().add(1);
		obj1.getNums().add(2);
		obj1.getNums().add(3);

		SingletonObject obj2 = SingletonObject.getSingletonObjectInstance();
		obj2.displayMessage();

		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);

		obj2.getNums().add(4);
		obj2.getNums().add(5);

		for (Integer num : obj1.getNums()) {
			System.out.println(num);
		}

	}

}
