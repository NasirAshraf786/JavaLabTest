package com.qestion3;

public class Member {

	   String name;
	   int age;
	   long mobile_No;
	   String address;
	   int salary;
	
	public Member(String name, int age, long mobile_No, String address, int salary) {
		
		this.name = name;
		this.age = age;
		this.mobile_No = mobile_No;
		this.address = address;
		this.salary = salary;
	}
	
	
	void printSalary() {
		
		System.out.println(salary);
		
	}

}

class Employee extends Member {
	
	String major;
	String department;
	
	public Employee(String name, int age, long mobile_No, String address, int salary, String major, String department) {
		
		super(name, age, mobile_No, address, salary);
		this.major = major;
		this.department = department;
	}
	public void detailsOfEmployee() {
		
		System.out.println("NAME : " +name);
		System.out.println("AGE : " +age);
		System.out.println("MOBILE NUMBER : " +mobile_No);
		System.out.println("ADDRESS : " +address);
		System.out.println("SPECELISATION : " +major);
		System.out.println("DEPARTMENT : " +department);
	}
}


class Manager extends Member{
	
	String major;
	String department;
	
	public Manager(String name, int age, long mobile_No, String address, int salary, String major, String department) {
		super(name, age, mobile_No, address, salary);
		this.major = major;
		this.department = department;
		
		
	}
	public void detailsOfManager() {
		
		System.out.println("NAME : " +name);
		System.out.println("AGE : " +age);
		System.out.println("MOBILE NUMBER : " +mobile_No);
		System.out.println("ADDRESS : " +address);
		System.out.println("SPECELISATION : " +major);
		System.out.println("DEPARTMENT : " +department);
	}
}
