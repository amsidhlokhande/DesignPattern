package com.amsidh.intf.impl;

import com.amsidh.intf.Player;

public class VedioPlayer implements Player {

	@Override
	public void playAudio() {
		System.out.println("Audio playing...");

	}

	@Override
	public void playVedio() {
		System.out.println("Vedio playing...");

	}

}
