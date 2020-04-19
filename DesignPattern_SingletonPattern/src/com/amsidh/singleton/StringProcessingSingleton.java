package com.amsidh.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class StringProcessingSingleton {

	private static StringProcessingSingleton instance = null;

	private String[] strs = new String[] { "a", "a", "a", "a", "a", "a", "b", "b", "c", "c", "d", "d", "d", "d", "d",
			"d", "d", "e", "e", "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "g", "h", "h", "h", "h",
			"h", "h", "h", "i", "i", "i", "i", "i", "i", "j", "k", "k", "k", "l", "l", "l", "l", "l", "l", "m", "m",
			"m", "m", "o", "o", "o", "o", "o", "p", "p", "p", "p", "p", "p", "p", "q", "q", "q", "q", "q", "r", "r",
			"r", "r", "r", "r", "r", "s", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u", "u", "u", "u", "u",
			"u", "w", "w", "w", "w", "w", "w", "x", "x", "x", "x", "x", "y", "y", "y", "y", "y", "y", "y", "y", "y",
			"y", "y", "z", "z", "z", "z", "z", "z", "z", "z", "z", "z", "z", "z", "z"

	};

	private LinkedList<String> letterList = new LinkedList<String>(Arrays.asList(strs));

	static boolean firstThread = true;

	private StringProcessingSingleton() {

	}

	public static StringProcessingSingleton getInstance() {

		if (instance == null) {

			if (firstThread) {
				try {
					firstThread = false;
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			instance = new StringProcessingSingleton();
            Collections.shuffle(instance.letterList); 
		}
		return instance;

	}

	public LinkedList<String> getLetters() {
		return instance.letterList;
	}

	public LinkedList<String> getTiles(Integer number) {
		LinkedList<String> tilesList = new LinkedList<String>();
		for (int i = 0; i < number; i++) {
			tilesList.add(letterList.remove(0));
		}
		return tilesList;
	}

}
