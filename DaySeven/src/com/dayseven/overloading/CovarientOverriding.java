package com.dayseven.overloading;

class Color{
	protected Color getColor() {
		Color s = new Color();
		return s;
	}
}

class Yellow extends Color{
	protected Yellow getColor() {
		Yellow s = new Yellow();
		return s;
	}
	
}

public class CovarientOverriding {

	public static void main(String[] args) {
		
		Color c= new Color();
		System.out.println(c.getColor());
		
		Yellow y=new Yellow();
		System.out.println(y.getColor());

	}

}
