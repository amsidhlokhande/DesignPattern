package com.amsidh.main;

import com.amsidh.device.TV32Inches;
import com.amsidh.device.TV41Inches;
import com.amsidh.remote.AbstractRemote;
import com.amsidh.remote.RemoveFor32InchesTV;
import com.amsidh.remote.RemoveFor41InchesTV2;

public class MainApp {

	public static void main(String[] args) {
		
		AbstractRemote remote32=new RemoveFor32InchesTV(new TV32Inches());

		AbstractRemote remote41=new RemoveFor41InchesTV2(new TV41Inches());
		
		
		
		System.out.println("Increase speed TV32  ");
		
		remote32.pressButtonNine();
		
		
		System.out.println("Decrease speed TV32");
		remote32.pressButtonEight();
		
		System.out.println("Press button five of remote32");
		remote32.pressButtonFive();
		
		
		System.out.println("Press button five of remote41");
		remote41.pressButtonFive();
		
		
		System.out.println("Press button Nine of remote41");
		remote41.pressButtonNine();
		
		System.out.println("Press button Eight of remote41");
		remote41.pressButtonEight();
		
	}
}
