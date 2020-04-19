package com.amsidh.main;

import com.amsidh.intf.Player;
import com.amsidh.intf.impl.AudioPlayer;
import com.amsidh.intf.impl.VedioPlayer;

public class MainApp {

	public static void main(String[] args) {
		Player payer=new AudioPlayer();
		payer.playAudio();
		payer.playVedio();
		
		
		
		payer=new VedioPlayer();
		payer.playAudio();
		payer.playVedio();
		
		

	}

}
