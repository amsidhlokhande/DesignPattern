package com.amsidh.intf;

import com.amsidh.intf.impl.Computer;
import com.amsidh.intf.impl.Keyboard;
import com.amsidh.intf.impl.Monitor;
import com.amsidh.intf.impl.Mouse;

public interface ComputerPartVisitor {

	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
