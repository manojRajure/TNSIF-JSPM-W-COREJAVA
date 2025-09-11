package com.daysix.staticBloackMethod;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass.display();
		
		System.out.println();
		
		MyClass c1= new MyClass();

		
		System.out.println(c1);
		MyClass.display();
		
		MyClass c2= new MyClass();
		
		System.out.println(c2);
		MyClass.display();

		

	}

}
