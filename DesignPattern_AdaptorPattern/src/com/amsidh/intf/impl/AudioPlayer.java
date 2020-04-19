package com.amsidh.intf.impl;

import com.amsidh.intf.Player;

public class AudioPlayer implements Player {

	@Override
	public void playAudio() {
		System.out.println("Audio playing...");

	}

	@Override
	public void playVedio() {
		System.out.println("No supported vedio available to play this");

	}

}
