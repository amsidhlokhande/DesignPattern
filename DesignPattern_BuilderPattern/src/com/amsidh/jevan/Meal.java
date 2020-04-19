package com.amsidh.jevan;

import java.util.ArrayList;
import java.util.List;

import com.amsidh.intf.Item;

public class Meal {
	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0f;
		for (Item item : items) {
			cost = cost + item.price();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.println(item.toString());
		}
	}

}
