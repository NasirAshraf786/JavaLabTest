
	 /** PROGRAM TO PRINT DEIAMOND PATTERN
	 NAME N@SIR ASHRAF
	 DATE 3rd November
	 QUESTION 01
	 LAB TEST */


	//DECLACRING PACKAGE
	package com.diamond;   

	
	//CREATING CLASS NAME "DiamondPattern" AS A MAIN CLASS 
	public class DiamondPattern
	{
		
		 //METHOD TO PRINT THE DIAMOND PATTERN
		  public static void printDiamond(int row)
		 {
			 int i , j;
			 
			 //CODE TO PRINT HALF OF DIAMOND SHAPE(upper shape)
			 for(i=0;i<=row;i++)
			   {
			     for(j=1; j<=row-i; j++)
			        System.out.print(" ");
			     
			     for(j=1; j<=2*i-1 ;j++)
			        System.out.print("*");
			     
			     System.out.print("\n");
			   }
			 
			 //CODE TO PRINT REST PART OF DIAMOND SHAPE(LOWER PART)
			  for(i=row-1;i>=1;i--)
			   {
			     for(j=1; j<=row-i; j++)
			        System.out.print(" ");
			     
			     for(j=1; j<=2*i-1; j++)
			         System.out.print("*");
			     
			     System.out.print("\n");
			   }
			 
		 }
		
		  
	}



