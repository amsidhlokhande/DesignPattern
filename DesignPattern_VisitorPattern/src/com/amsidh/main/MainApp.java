package com.amsidh.main;

import com.amsidh.intf.ComputerPart;
import com.amsidh.intf.impl.Computer;
import com.amsidh.intf.impl.ComputerPartDisplayVisitor;

public class MainApp {

	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
