package com.dayeight.abstractdemo;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape s;
		
		s=new Sqaure(5.0f);
		s.calArea();
		s.show();
		
		s=new Rectangular(5, 4);
		s.calArea();
		s.show();
		

	}

	}


