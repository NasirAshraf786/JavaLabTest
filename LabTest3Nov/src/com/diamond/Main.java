package com.diamond;


	//IMPORTING SCANNER CLASS TO TAKE INPUT EXPLICITLY
	import java.util.Scanner;

	public class Main
	{
		
		//DECLARING MAIN METHOD
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			
			System.out.println("ENTER HALF NUMBER OF ROWS OF DIAMOND TO PRINT ");
			 
			 //CREATING OBJECT OF SCANNER CLASS
			 Scanner sc = new Scanner(System.in);
			 
			 //CREAQTING OBJECT OF DIAMONDPATTERN CLASS PRESENT IN com.diamond PACKAGE
			// DiamondPattern obj = new DiamondPattern();
			 
			 //TAKING INPUT 
			 int row = sc.nextInt();
			 
			 //CALLING METHOD
			 DiamondPattern.printDiamond(row);
			 
			 
			 sc.close();

		}

	}

