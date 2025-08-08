package com.daythree.scanner;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		Person p=new Person();
		TaxCalculation tx=new TaxCalculation();
		
		
		
		System.out.println("Enter Person Name: ");
		String name=s.nextLine();
		
		
		System.out.println("Enter Person Gender: ");
		String gender=s.nextLine();
		
		System.out.println("Enter Person Age: ");
		int age=s.nextInt();
		
		
		System.out.println("Enter Person Income: ");
		int income=s.nextInt();
		
		p.setAge(age);
		p.setGender(gender);
		p.setName(name);
		p.setIncome(income);
		
		tx.calculateTax(p);
		
		System.out.println(name+" Income tax is: "+p.getTax());
		
		

	}

}
