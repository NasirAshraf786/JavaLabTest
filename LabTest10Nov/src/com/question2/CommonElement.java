package com.question2;


import java.util.Scanner;

public class CommonElement
{
	
    public static void printCommonElements(int[]a1 , int[]a2)
    {
    	for(int i = 0; i < a1.length; i++)
    	{
    		
    		for(int j = 0; j < a2.length; j++)
    		{
    			if(a1[i] == a2[j])
    				System.out.println("COMMON ELEMENTS ARE : "+a1[i]+ " ");
    		}
    	}
    	
    }
	public static void main(String args[])
      {
    	  
    	   int[] array1 = new int[5];
    	  
    	   int[] array2 = new int[5];
    	  
    	   System.out.println("ENTER THE ARRAY ELEMENTS : ");
    	
	       Scanner sc = new Scanner(System.in);
	       
	       //ENTERING ELEMENTS OF ARRAY1 USING FOR LOOP
	       for(int i = 0 ; i < array1.length; i++)
	       {
	    
	         array1[i] = sc.nextInt();
	    
           }
	       
	       //ENTERING ELEMENTS OF ARRAY2 USING FOR LOOP
	       for(int i = 0 ; i < array2.length; i++)
	       {
	    
	         array2[i] = sc.nextInt();
	    
           }
	       
	       printCommonElements(array1, array2);
	       
      }
}