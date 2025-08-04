package com.demo.dayOne;

public class typeCasting {

	public static void main(String[] args) {
		
		//Widening or Implicit type casting (small data type to big data type)
		
		byte b=10;
		int l=b;
		System.out.println(l);
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		char ch='A';
		int i=ch;
		System.out.println(i);
		
		//narrowing or Explicit type casting
		
		double f1=10.52f;
		long ll=(long) f1;
		System.out.println(ll);
		
		int i2=156;
		byte b1=(byte) i2;
		System.out.println(b1);
	

	}

}
