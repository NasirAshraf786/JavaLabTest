package com.qestion3;

public class Main {

	public static void main(String[] args) {
		
		
		Employee obj1 = new Employee("NASIR ASHRAF",23 ,9572933862L ,"RANCHI",1200000,"PROGRAMMER","IT");
		
		System.out.println("*********EMPLOYEE DETAILS************");
		obj1.detailsOfEmployee();
		obj1.printSalary();
		
		
		Manager obj2 = new Manager("KAMACHI MADAM", 30, 8096578901L, "BENGALURU", 2400000, "PRODUCT MANAGER", "IT");
		
		System.out.println("*********MANAGER DETAILS************");
		obj2.detailsOfManager();
		obj2.printSalary();
		
		
		
		
		
		
     }
}
