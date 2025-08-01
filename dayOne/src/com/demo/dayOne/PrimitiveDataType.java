package com.demo.dayOne;

public class PrimitiveDataType {
	public static void main(String[] args) {
		byte byteMax=127;
		byte byteMin=-128;
		
		System.out.println("Max Range of byte is :"+byteMax);
		System.out.println("Min Range of byte is :"+byteMin);
		
		short shortMax=32767;
		short shortMin=-32768;
		System.out.println("Max Range of short is :"+shortMax);
		System.out.println("Min Range of short is :"+shortMin);
		
		int intMax =2147483647;
		int intMin =-2147483648;
		System.out.println("Max Range of int is :"+intMax);
		System.out.println("Min Range of int is :"+intMin);
		
		long longMax=9223372036854775807l;
		long longMin=-9223372036854775808l;
		System.out.println("Max Range of long is :"+longMax);
		System.out.println("Min Range of long is :"+longMin);

	}
}
