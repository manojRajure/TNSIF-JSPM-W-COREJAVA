package com.daysix.usingfinal;

public class FinalVariable {
	
	final int x=100;
	
	final static int y;
	final static int z=10;

	
	void change() {
//		x++;
//		y=20;
//		z++;
	}
	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ",y="+y+"]";
	}
	
//	declare static block
	
	static {
		//z=89;
		y=20;
		System.out.println("");
	}

	

}
