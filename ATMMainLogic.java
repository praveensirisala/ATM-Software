package com.atmsoftware;
import java.util.Scanner;
public class ATMMainLogic {
	static {
		System.out.println("*******************************");
		System.out.println("*                             *");
		System.out.println("*Welcomw to JNTU super100 ATM*");   
		System.out.println("*                             *"); 
		System.out.println("*******************************");
	}
	public static void main(String[]args) throws InterruptedException{
		Scanner sc=new Scanner(System.in);
		ATMImplementation atm =new ATMImplementation();
		PINclass pin =new PINclass(998967991493l);
		System.out.println();
		System.out.println("Insert your ATM card");
		Thread.sleep(3000);
		System.out.println();
		System.out.println("wait your card under processing");
		Thread.sleep(3000);
		pin.pinValidation();
		System.out.println();
		System.out.println("******************************************");
		System.out.println("*                                        *");
		System.out.println("*                                        *");
		System.out.println("*             1.withdraw                 *");
		System.out.println("*             2.Deposite                 *");
		System.out.println("*            3.BalanceEnquiry            *");
		System.out.println("*        4.Generate pin number           *");
		System.out.println("*             5.AccountDetails           *");
		System.out.println("*                                        *");
		System.out.println("******************************************");
		System.out.println("enter your option");
		int option =sc.nextInt();
		switch(option) {
		case 1:{
			System.out.println("enter amount");
			double amount=sc.nextDouble();
			atm.withdraw(amount);
		}
		break;
		case 2:{
			System.out.println("enter amount");
			double amount=sc.nextDouble();
			atm.deposite(amount);
		}
		break;
		case 3:{
			atm.balanceEnquiry();
		}
		break;
		case 4:{
			System.out.println("enter pin number");
			int pinNum = sc.nextInt();
			pin.setPinNumber(pinNum);
			System.out.println("Pin number Generated:"+pinNum);
		}
		break;
		case 5:{
			Account a=new Account("praveen","JNTU0000","JNTU");
			a.accountDetails();
		}
		}
		System.out.println("******************************************");
		System.out.println("*       thank you                        *");
		System.out.println("*         visit again                    *");
		System.out.println("******************************************"); 
		
	}

}
