/**
 * 
 */
package com.amsidh.publisher.intf.impl;

import java.util.ArrayList;
import java.util.List;

import com.amsidh.observer.intf.Observer;
import com.amsidh.publisher.intf.Publisher;

/**
 * @author amsidhlokhande
 *
 */
public class PublisherImpl implements Publisher {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.amsidh.publisher.intf.Publisher#register(com.amsidh.observer.intf.
	 * Observer)
	 */

	private List<Observer> observers;
	private int ibmPrice;
	private int applePrice;
	private int googlePrice;
	
	public PublisherImpl() {
		observers = new ArrayList<>();
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.amsidh.publisher.intf.Publisher#unRegister(com.amsidh.observer.intf.
	 * Observer)
	 */
	@Override
	public void unRegister(Observer observer) {
		int indexOf = observers.indexOf(observer);
		observers.remove(indexOf);
		System.out.println("Observer "+observer+" is deleted");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.amsidh.publisher.intf.Publisher#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(ibmPrice, applePrice, googlePrice);
		}

	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public void setIbmPrice(int ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObservers();
	}

	public void setApplePrice(int applePrice) {
		this.applePrice = applePrice;
		notifyObservers();
	}

	public void setGooglePrice(int googlePrice) {
		this.googlePrice = googlePrice;
		notifyObservers();
	}

}
