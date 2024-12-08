package com.atmsoftware;

public class Account {
	String accHolderName;
	final static long accountNumber=998967991448l;
	static double totalBalance=12000;
	String IFSCCode;
	String branch;
	public Account(String accHolderName,String IFSCCode,String branch ) {
		super();
		this.accHolderName=accHolderName;
		this.IFSCCode=IFSCCode;
		this.branch=branch;
	}
	public void accountDetails() {
		System.out.println("Account Details");
		System.out.println("------------------");
		System.out.println("Account Holder Name:"+accHolderName);
		System.out.println("Account Number:"+ accountNumber);
		System.out.println("IFSC CODE:"+IFSCCode);
		System.out.println("Branch:"+branch);
	}

}
