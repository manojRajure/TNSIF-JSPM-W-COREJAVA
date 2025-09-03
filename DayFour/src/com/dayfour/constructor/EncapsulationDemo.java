package com.dayfour.constructor;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		oopsDemo obj=new oopsDemo();
		
		obj.setAge(21);
		obj.setName("Manoj");
		obj.setSerialNum(1234);
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getSerialNum());

		
	}

}
