package com.dayseven.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--Constructor overloading--");
		point p=new point();
		System.out.println(p);
		
		System.out.println("--Method Overloading--");
		
		System.out.println(MethodOverloadingDemo.addition(5, 10));
		System.out.println(MethodOverloadingDemo.addition(5, 10,98));
		System.out.println(MethodOverloadingDemo.addition("Manoj ", "Rajure"));
		System.out.println(MethodOverloadingDemo.addition(5.46f,24.98f));

	}

}
