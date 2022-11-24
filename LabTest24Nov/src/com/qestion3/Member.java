package com.qestion3;

public class Member {

	   String name;
	   int age;
	   long mobile_No;
	   String address;
	   int salary;
	
	public Member(String name, int age, long mobile_No, String address, int salary) {
		super();
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
	
}


class Manager extends Member{
	
	String major;
	String department;
	
	public Manager(String name, int age, long mobile_No, String address, int salary, String major, String department) {
		super(name, age, mobile_No, address, salary);
		this.major = major;
		this.department = department;
		
		
	}
	
}