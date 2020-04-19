package com.amsidh.intf.impl;

import com.amsidh.intf.ComputerPart;
import com.amsidh.intf.ComputerPartVisitor;

public class Keyboard implements ComputerPart {

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}
