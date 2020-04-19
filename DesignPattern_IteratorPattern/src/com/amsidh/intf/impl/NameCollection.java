package com.amsidh.intf.impl;

import java.util.ArrayList;
import java.util.List;

import com.amsidh.intf.Container;
import com.amsidh.intf.Iterator;

public class NameCollection implements Container {

	private final List<String> names = new ArrayList<>();

	public void addName(String name) {
		names.add(name);
	}

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int index;

		@Override
		public boolean hasNext() {
			if (index < names.size()) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names.get(index++);
			}
			return null;
		}

	}
}
