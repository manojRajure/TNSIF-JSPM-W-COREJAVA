package com.dayseven.overriding;

public class OverridingDemo {

	public static void main(String[] args) {

		RBI rbi;
		rbi=new SBI();
		System.out.println(rbi.getRateofInterest());
		rbi=new HDFC();
		System.out.println(rbi.getRateofInterest());
		rbi=new RBI();
		System.out.println(rbi.getRateofInterest());
		
	}

}
