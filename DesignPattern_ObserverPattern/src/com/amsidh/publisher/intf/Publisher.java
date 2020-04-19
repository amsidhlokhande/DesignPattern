package com.amsidh.publisher.intf;

import com.amsidh.observer.intf.Observer;

public interface Publisher {

	public void register(Observer observer);

	public void unRegister(Observer observer);

	public void notifyObservers();
}
