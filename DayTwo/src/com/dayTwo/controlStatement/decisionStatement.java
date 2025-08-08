package com.dayTwo.controlStatement;

public class decisionStatement {

	public static void main(String[] args) {
		int age=20;
		//if
		if(age>=18) 
		{
			System.out.println("Eligible for voting");
		}
		
		//if-else
		if(age>=18) 
		{
			System.out.println("Eligible for voting");
		}else {
			System.out.println("Sorry ! You have to Wait till 18");
		}
		
		//else if 
		int x=8, y=7;
		int a=10;
		int b=11;
		
		if(x>=y) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
		if(!(a<b) || a==b) {
			System.out.println("Condition True");
		}else {
			System.out.println("Condition false");
		}
		
		

	}

}
