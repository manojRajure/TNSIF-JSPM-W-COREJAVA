package com.dayFive.HierarchicalInheritance;

public class HirarchicleDemo {

	public static void main(String[] args) {
		
//		Student s1=new Student("Manoj", "Pune", "BE", 50.87f);
//		System.out.println(s1);
		
		Person p;
		p=new Person("Manoj", "Pune");
		System.out.println(p);
		
		p=new Employee("Manoj", "Pune", 123, 23456, "SD");
		System.out.println(p);
		
		p=new Student("Manoj", "Nashik", "BE", 90.65f);
		System.out.println(p);

	}

}
