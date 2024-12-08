package com.atmsoftware;

import java.util.Random;

public class OTPClass {
	public static int generaeOTP() {
		Random rand=new Random();
		//to get 4 digit otp between 1000 to 6000
		int otp=1000+rand.nextInt(5000);
		return otp;
		
	}
	 
}
