package com.dayeight.interfacedemo;

public class SavingAccount extends Customer implements Bank {

	
	
	private int accNo;
	private float balance;
	
	public SavingAccount(String name, String city, int accNo,float balance) {
		super(name, city);
		this.accNo=accNo;
		this.balance=balance;
	}

	@Override
	public void deposit(float amount) {
		
		if(amount<0 || amount > Deposit_Limit) {
			System.out.println("Please deposit valid amount");
		}else {
			balance+=amount;
			System.out.println("Rs"+amount+" is deposited");
		}
		
	}

	@Override
	public void withdraw(float amount) {
		if(amount < balance-MINBAL) {
			balance-=amount;
			System.out.println("Rs"+amount+" is withdraw");
			
			
		}else {
			System.out.println("Insufitient balance");
		}
		
	}

	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", name="+getName()+", city="+getCity()+"]";
	}
	
	

}
