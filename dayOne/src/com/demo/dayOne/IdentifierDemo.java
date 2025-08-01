package com.demo.dayOne;

public class IdentifierDemo {

	public static void main(String[] args) {
		//Variable declaration -Invalid Identifier
		//int for=13;  Error bcoz of keyword
        //int num 1=13;
		// int @num=12;
		
		//valid Identifier
		
		int $num=12;

		System.out.println("Value of the number variable: " +$num);
		
		String studentName="Manoj";
		System.out.println("Name of the student: " +studentName);
		
		int age;
		age=20;
		System.out.println("Age of the student: " +age);


		

	}

}
