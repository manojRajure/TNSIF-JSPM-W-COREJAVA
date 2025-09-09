package com.dayFive.singleInheritance;

public class Student extends Citizen{
	private int rollNo;
	private String collegename;
	
	Student(){
		super();
	}
	Student(String name, String adharNo, String address, long phone,int rollNo, String collegename) {
		super(name, adharNo, address, phone);
		
		this.rollNo=rollNo;
		this.collegename=collegename;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return "Sudent [rollNo=" + rollNo + ", collegename=" + collegename + "]";
	}
	
	

}
