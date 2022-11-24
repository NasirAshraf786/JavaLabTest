package com.qestion3;

public class Main {

	public static void main(String[] args) {
		
		Member obj = new Member();
		// TODO Auto-generated method stub
		
		Employee obj1 = new Employee("NASIR ASHRAF",23 ,9572933862L ,"RANCHI",1200000,"PROGRAMMER","IT");
		
		System.out.println("*********EMPLOYEE DETAILS************");
		System.out.println("NAME : " +obj1.name);
		System.out.println("AGE : " +obj1.age);
		System.out.println("MOBILE NUMBER : " +obj1.mobile_No);
		System.out.println("ADDRESS : " +obj1.address);
		System.out.println("SPECELISATION : " +obj1.major);
		System.out.println("DEPARTMENT : " +obj1.department);
		obj.printSalary();
		
		
		Manager obj2 = new Manager("KAMACHI MADAM", 30, 8096578901L, "BENGALURU", 2400000, "PRODUCT MANAGER", "IT");
		
		System.out.println("*********MANAGER DETAILS************");
		System.out.println("NAME : " +obj2.name);
		System.out.println("AGE : " +obj2.age);
		System.out.println("MOBILE NUMBER : " +obj2.mobile_No);
		System.out.println("ADDRESS : " +obj2.address);
		System.out.println("SALARY : " +obj2.salary);
		System.out.println("SPECELISATION : " +obj2.major);
		System.out.println("DEPARTMENT : " +obj2.department);
		obj.printSalary();
		
		
		
		
		
		
     }
}