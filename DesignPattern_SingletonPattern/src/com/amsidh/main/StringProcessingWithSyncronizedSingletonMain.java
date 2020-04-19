package com.amsidh.main;

import java.util.LinkedList;

import com.amsidh.singleton.StringProcessingWithSynchronizedBlockSingleton;
import com.amsidh.singleton.StringProcessingWithSynchronizedSingleton;

public class StringProcessingWithSyncronizedSingletonMain {

	public static void main(String[] args) {
	
		Runnable r1=new ThreadDemo();
		Runnable r2=new ThreadDemo();
		
		Thread t1=new Thread(r1,"Thread1");
		Thread t2=new Thread(r2,"Thread2");
		t1.start();
		t2.start();
	}

	
	
}


class ThreadDemo implements Runnable{

	@Override
	public void run() {
		//StringProcessingWithSynchronizedSingleton instance = StringProcessingWithSynchronizedSingleton.getInstance();
		StringProcessingWithSynchronizedBlockSingleton instance=StringProcessingWithSynchronizedBlockSingleton.getInstance();
		
		System.out.println("Instance ID :" + System.identityHashCode(instance));
		System.out.println(instance.getLetters());

		LinkedList<String> player=instance.getTiles(7);
		
		System.out.println("Player Tiles: "+player);

		System.out.println(instance.getLetters());
		
	}
	
}