package com.daysix.staticBloackMethod;

public class MyClass {
	
	private static int srNo;
	private int section;
	
	static {
		System.out.println("----Within the Static block----");
		srNo=1000;
//		section=20000;
	}
	
	MyClass(){
		System.out.println("----Within the Default block block----");
	    srNo++;
	    section++;
		
	}

	@Override
	public String toString() {
		return "MyClass [srNo="+srNo+", section=" + section + "]";
	}
	
	static void display() {
		System.out.println("Serial Number: " +srNo);
//		System.out.println("Section: " +section);
		
	}
}
