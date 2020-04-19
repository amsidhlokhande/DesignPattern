package com.amsidh.main;

import java.util.LinkedList;

import com.amsidh.singleton.StringProcessingSingleton;

public class StringProccessingMain {

	public static void main(String[] args) {
		StringProcessingSingleton instance1 = StringProcessingSingleton.getInstance();
		System.out.println("Instance 1 ID :" + System.identityHashCode(instance1));
		System.out.println(instance1.getLetters());

		LinkedList<String> playerOneTiles=instance1.getTiles(7);
		
		System.out.println("Player Ones Tiles: "+playerOneTiles);

		System.out.println(instance1.getLetters());
		
		
		
		StringProcessingSingleton instance2 = StringProcessingSingleton.getInstance();
		System.out.println("Instance 2 ID :" + System.identityHashCode(instance2));
		System.out.println(instance2.getLetters());

		LinkedList<String> playerTwoTiles=instance2.getTiles(7);
		
		System.out.println("Player Two Tiles: "+playerTwoTiles);

		System.out.println(instance2.getLetters());
	}
}
