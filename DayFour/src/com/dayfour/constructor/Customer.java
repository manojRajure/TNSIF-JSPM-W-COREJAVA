package com.dayfour.constructor;

public class Customer {
	
	private int id;
	private String name;
	private String city;
	
	Customer(int id,String name, String city){
		this.id =id;
		this.name=name;
		this.city=city;
	}
	
	Customer(){
		id=25;
		name="Manoj";
		city="Pune";
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}
