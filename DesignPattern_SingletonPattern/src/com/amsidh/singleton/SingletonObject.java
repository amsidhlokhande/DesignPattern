package com.amsidh.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonObject {

	private static SingletonObject instance = new SingletonObject();

	private List<Integer> nums = new ArrayList<>();

	private SingletonObject() {
		System.out.println("SingletonObject constructor is called");
	}

	public static SingletonObject getSingletonObjectInstance() {

		return instance;
	}

	public void displayMessage() {
		System.out.println("Hello world of singleton design pattern");
	}

	public List<Integer> getNums() {
		return nums;
	}

	public void setNums(List<Integer> nums) {
		this.nums = nums;
	}

}
