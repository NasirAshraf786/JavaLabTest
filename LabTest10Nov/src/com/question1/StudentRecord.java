/* create a record of students using array in java
 * 
 * Name = N@SIR_ASHRAF
 * LABTEST 10 NOVEMBER
 */



package com.question1;

//importng SCANNER CLASS
import java.util.Scanner;

//CREATING CLASS NAME "StudentRecord" 
public class StudentRecord {
	
	//
	public static void main(String args[]) 
	{ 
		//SCANNER OBJECT
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER THE STUDENTS NUMBER TO STORE THER DETAILS");
		int n = sc.nextInt();
		
		//ARRAY OF STRING TYPE WHICH HOLD STUDENT NAME
		String[] name = new String[n];
		
		//ARRAY OF STRING TYPE WHICH HOLD STUDENT ROLLNO
		int[] rollno = new int[n];
		
		//ARRAY OF STRING TYPE WHICH HOLD STUDENT MARKS
		int[] marks = new int[n];
		
		//ARRAY OF STRING TYPE WHICH HOLD STUDENT AGE
		int[] age = new int[n];
		
		
		
		System.out.println("ENTER THE NAME, ROLL NO, MARKS, AND AGE :");
		
		//USING FOR LOOP TO TAKE EXPLICITLY STUDENTS RECORDS
		for(int i = 0 ; i<n; i++)
		{
			name[i] = sc.next();
			
			rollno[i]= sc.nextInt();
			
			marks[i] = sc.nextInt();
			
			age[i] = sc.nextInt();
		}
		
		System.out.println("--------RECORD OF STUDENTS--------");
		
		//PRINTING STUDENTS RECORDS
		for(int j =0 ; j<n; j++ )
		{
			System.out.println("Name : " +name[j]+ "\nROLLNO : " +rollno[j]+ "\nMARKS : " +marks[j]+ "\nAGE : " +age[j] );
			System.out.println("--------------------------------------------------");
		}
		
		sc.close();

	}

}
