package com.amsidh.main;

import com.amsidh.dto.Numbers;
import com.amsidh.intf.Chain;
import com.amsidh.intf.impl.AddNumbers;
import com.amsidh.intf.impl.DivideNumbers;
import com.amsidh.intf.impl.MultiNumbers;
import com.amsidh.intf.impl.SubNumbers;

public class MainApp {
  public static void main(String[] args) {
	Chain c1=new AddNumbers();
	Chain c2=new SubNumbers();
	Chain c3=new MultiNumbers();
	Chain c4=new DivideNumbers();
	
	
	c1.nextChain(c2);
	c2.nextChain(c3);
	c3.nextChain(c4);
	
	
	Numbers numbers=new Numbers(20, 5, "add");
	
	
	c1.calculate(numbers);
	
}
}
