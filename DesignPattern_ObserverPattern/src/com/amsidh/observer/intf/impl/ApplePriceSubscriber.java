/**
 * 
 */
package com.amsidh.observer.intf.impl;

import com.amsidh.observer.intf.Observer;
import com.amsidh.publisher.intf.Publisher;

/**
 * @author amsidhlokhande
 *
 */
public class ApplePriceSubscriber implements Observer {

	private Publisher publisher;

	public ApplePriceSubscriber(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.register(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amsidh.observer.intf.Observer#update(int, int, int)
	 */

	@Override
	public void update(int ibmPrice, int applePrice, int googlePrice) {
		System.out.println("Apple Subscriber");
		System.out
				.println(" IBMPrice: " + ibmPrice + "\n ApplePrice: " + applePrice + "\n GooglePrice: " + googlePrice);
		System.out.println("\n");
	}

}
