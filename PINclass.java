package com.atmsoftware;
import java.util.Scanner;
//Encapsulation
public class PINclass {
	static Scanner sc=new Scanner(System.in);
	long aadharNumber;
	private int pinnumber=1234;
	public PINclass(long aadharNumber) {
		if(count(aadharNumber)==12) {
			this.aadharNumber=aadharNumber;
		}else {
			System.out.println("Ivalid Aadharcardnumber");
		}
		
	}
	public int getPinnumber() {
		return pinnumber;
	}
	public  void setPinNumber( int pinNumber) {
		if(count(pinNumber)==4) {
			this.pinnumber=pinNumber;
		}else {
			System.out.println("Enter only 4 digit");
		}		
	}
	public long count(long aadharNumber) {
		long count=0;
		while(aadharNumber!=0) {
			count++;
			aadharNumber/=10;
		}
		return count;
	}
	int count=0;
	public void pinValidation() throws InterruptedException{
		System.out.println("enter your pin number");
		int pin=sc.nextInt();
		if(getPinnumber()==pin) {
			System.out.println("Validation Scucessfull");
		}else {
			System.out.println("Invalid PinNumber");
			count++;
			if(count<=3) {
				Thread.sleep(5000);
				pinValidation();
			}else {
				System.out.println("-------------------");
				System.out.println("your card blocked");
				System.out.println("-------------------");
				System.out.println( );
				System.out.println( "Generate new pin number");
				System.out.println( );
				int otp=OTPClass.generaeOTP();
				System.out.println("Dear user its an OTP:"+otp+"for current transaction..."+
				"dont share your otp with any...if its not belong to you ignore and intimate to bank");
				System.out.println("enter the OTP");
				if(otp==sc.nextInt()) {
					System.out.println("enter 4 digit new pin number");
				int newPin=sc.nextInt();
				setPinNumber(newPin);
				Thread.sleep(5000);
				System.out.println("your new pin number got generated as new pin:"+newPin+"....dont share with anyone");
				pinValidation();
			}else {
				System.out.println("Invalid OTP");
			}
			
		}
	}
	
	}
}
