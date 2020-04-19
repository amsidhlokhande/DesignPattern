package com.amsidh.proxy;

import com.amsidh.intf.RealImage;
import com.amsidh.intf.Image;

public class ProxyImage implements Image {

	private RealImage realImage;

	@Override
	public void draw() {
		if (realImage == null) {
			realImage = new RealImage();
		}

		realImage.draw();

	}

}
