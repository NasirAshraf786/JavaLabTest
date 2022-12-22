package com.que2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Employee obj1 = new Employee("NASIR ASHRAF",23 ,9572933862L ,"RANCHI",1200000,"PROGRAMMER","IT");
		
		System.out.println("*********EMPLOYEE DETAILS************");
		obj1.detailsOfEmployee();
		obj1.printSalary();
		
		
		Manager obj2 = new Manager("ARYAN RAJPUT", 30, 8096578901L, "BENGALURU", 2400000, "PRODUCT MANAGER", "IT Finance");
		
		System.out.println("*********MANAGER DETAILS************");
		obj2.detailsOfManager();
		obj2.printSalary();
		
		
		
		
	}

}
