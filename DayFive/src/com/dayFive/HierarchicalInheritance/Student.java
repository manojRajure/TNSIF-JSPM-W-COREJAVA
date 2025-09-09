package com.dayFive.HierarchicalInheritance;

public class Student extends Person{
	
	private String clas;
	private float percent;

	Student(String name, String city,String clas, float percent) {
		super(name, city);
		
		this.clas=clas;
		this.percent=percent;
		
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student [clas=" + clas + ", percent=" + percent + "]";
	}
	

}
