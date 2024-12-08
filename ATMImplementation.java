package com.atmsoftware;
import java.util.Scanner;
//Inheritance and polymorphism
public class ATMImplementation implements ATMSotware {
	static Scanner sc=new Scanner(System.in);
//method overriding
	public void withdraw(double amount) {
		String action="DEBITED";
		if(amount<=Account.totalBalance) {
			if(amount>=10000 && amount<=50000) {
				int otp=OTPClass.generaeOTP();
				System.out.println("Dear user its an OTP:"+otp+"for current transaction..."+
				"dont share your otp with any...if its not belong to you ignore and intimate to bank");
				System.out.println("enter the OTP");
				if(otp==sc.nextInt()) {
					Account.totalBalance-=amount;
					balanceEnquiry(action,amount);
				}else {
					
					System.err.println("Invalid OTP");
				}
			}else {
				Account.totalBalance-=amount;
				balanceEnquiry(action,amount);
			}
		}else {
			
			System.err.println("Insufficient Fund");
		}
			
		}
	public void deposite(double amount) {
		String action="CREDITED";
		if(amount<=100000) {
			Account.totalBalance+=amount;
			balanceEnquiry(action,amount);
		}else {
			System.out.println("your transaction limit is excced");
		}
	}
	//method overloading
	public void balanceEnquiry() {
		System.out.println("Total Balance:"+Account.totalBalance);
	}
	public void balanceEnquiry(String action,double amount) {
		System.out.println("Dear User Account Number:"+Account.accountNumber+
				" "+action+"by amount:"+amount+"on date"+SystemDateAndTime.getDateTime()+
				"remaining balance is "+Account.totalBalance+"Rs");
	}
}

