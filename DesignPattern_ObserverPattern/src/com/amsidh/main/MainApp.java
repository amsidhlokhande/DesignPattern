package com.amsidh.main;

import com.amsidh.observer.intf.impl.ApplePriceSubscriber;
import com.amsidh.observer.intf.impl.GooglePriceSubscriber;
import com.amsidh.observer.intf.impl.IbmPriceSubscriber;
import com.amsidh.publisher.intf.impl.PublisherImpl;

public class MainApp {

	public static void main(String[] args) {
		PublisherImpl publisher=new PublisherImpl();
		
		IbmPriceSubscriber ibmPriceSubscriber = new IbmPriceSubscriber(publisher);
		ApplePriceSubscriber applePriceSubscriber = new ApplePriceSubscriber(publisher);
		GooglePriceSubscriber googlePriceSubscriber = new GooglePriceSubscriber(publisher);
		
		publisher.setApplePrice(120);
		
		publisher.unRegister(ibmPriceSubscriber);
		publisher.setIbmPrice(50);

		publisher.setGooglePrice(20);
		
		

	}

}
