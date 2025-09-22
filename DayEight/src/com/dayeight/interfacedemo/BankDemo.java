package com.dayeight.interfacedemo;

public class BankDemo {

	public static void main(String[] args) {
		SavingAccount sa=new SavingAccount("manoj", "Pune", 145, 30000);
		System.out.println(sa);

		sa.withdraw(10000);
		System.out.println(sa);

		
		sa.deposit(1900);
		System.out.println(sa);
		
		

	}

}
