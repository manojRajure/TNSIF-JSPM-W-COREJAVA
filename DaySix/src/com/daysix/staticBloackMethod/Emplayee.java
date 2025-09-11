package com.daysix.staticBloackMethod;

public class Emplayee {
	
	private String name;
	private int id;
	
	//TNS which is common for all the object
	
	static String companyName="TNS";
	
	Emplayee(String name, int id){
		this.name=name;
		this.id=id;
	}

	@Override
	public String toString() {
		return "Emplayee [name=" + name + ", id=" + id + ", company="+companyName+"]";
	}
	

}
