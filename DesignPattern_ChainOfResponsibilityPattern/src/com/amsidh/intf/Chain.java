package com.amsidh.intf;

import com.amsidh.dto.Numbers;

public interface Chain {

	public void nextChain(Chain chain);

	public void calculate(Numbers numbers);
}
