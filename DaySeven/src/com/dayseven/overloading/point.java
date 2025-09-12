package com.dayseven.overloading;

public class point {
	
	private int x;
	private int y;
	public point() {
		super();
		this.x=5;
		this.y=6;
	}
	public point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	

}
