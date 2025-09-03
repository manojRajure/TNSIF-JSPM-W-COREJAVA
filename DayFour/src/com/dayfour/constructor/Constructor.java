package com.dayfour.constructor;

import java.util.Scanner;

public class Constructor {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String name, city;
		int id;
		
		
		System.out.println("Enter the customer name: ");
		name=sc.nextLine();
		
		System.out.println("Enter the customer city: ");
		city=sc.nextLine();
		
		System.out.println("Enter the customer ID: ");
		id=sc.nextInt();
		
		Customer c=new Customer();
		System.out.println(c.toString());
		
		Customer c1= new Customer(id, name, city);
		System.out.println(c1.toString());
	}

}
