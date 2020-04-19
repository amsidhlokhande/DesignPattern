package com.amsidh.main;

import java.util.LinkedList;

import com.amsidh.singleton.StringProcessingSingleton;

public class StringProcessingBreaksInThreadMain {

	public static void main(String[] args) {
	
		Runnable r1=new MyThread();
		Runnable r2=new MyThread();
		
		Thread t1=new Thread(r1,"Thread1");
		Thread t2=new Thread(r2,"Thread2");
		t1.start();
		t2.start();
	}

	
	
}


class MyThread implements Runnable{

	@Override
	public void run() {
		StringProcessingSingleton instance = StringProcessingSingleton.getInstance();
		System.out.println("Instance ID :" + System.identityHashCode(instance));
		System.out.println(instance.getLetters());

		LinkedList<String> player=instance.getTiles(7);
		
		System.out.println("Player Tiles: "+player);

		System.out.println(instance.getLetters());
		
	}
	
}