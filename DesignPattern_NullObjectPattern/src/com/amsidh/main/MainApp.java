package com.amsidh.main;

import com.amsidh.factory.BirdFactory;
import com.amsidh.intf.Bird;

public class MainApp {

	public static void main(String[] args) {
		BirdFactory birdFactory=new BirdFactory();
		
		Bird bird=birdFactory.getBird("Peocock");
	    System.out.println(bird.getName());
		bird.display();
		
		
		bird=birdFactory.getBird("hen");
		System.out.println(bird.getName());
		bird.display();
		

	}

}
