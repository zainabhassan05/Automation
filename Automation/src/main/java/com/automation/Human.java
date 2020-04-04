package com.automation;

public class Human {
	
	//Framework
	void getSalary() {		
		
		int age=6;
		String sex="F";
		double salary=5000.75;
		System.out.println(age);
		System.out.println(sex);
		System.out.println(salary);
	}
	
	//Test Run
	public static void main(String[] args) {
		
		Human obj=new Human();
		obj.getSalary();
	}
}
