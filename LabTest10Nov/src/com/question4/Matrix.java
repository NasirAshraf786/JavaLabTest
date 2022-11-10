 /* MULTIPLICATION OF MATRIX
  * NAME NASIR ASHRAF
  * LABTEST10NOVEMBER
  */

package com.question4;
  
//IMPORTIN SCANNER CLASS
import java.util.Scanner;

//DECLARING MATRIX CLASS
public class Matrix
{

	int n;  //n VARIABLE KEEP THE BASE INDEX OF MATRIX
	
	//SCANNER OBJECT
    Scanner input = new Scanner(System.in);
    
    System.out.println("ENTER THE BASE OF MATRIX ");
    n = input.nextInt();
    
    
    //declaring matrix
    int[][] matrix1 = new int[n][n];
    int[][] matrix2 = new int[n][n];
    int[][] product = new int[n][n];
    
    System.out.println("Enter the elements of 1st martix row wise ");
    
    //taking VALUES OF MATRIX1
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            matrix1[i][j] = input.nextInt();
        }
    }
    System.out.println("Enter the elements of 2nd martix row wise \n");
    
    //TAKING VALUE OF MATRIX2 USING FOR LOOP
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            matrix2[i][j] = input.nextInt();
        }
    }
    
    
    System.out.println("Multiplying the matrices...");
    
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            for (int k = 0; k < n; k++)
            {
                product[i][j] = product[i][j] + matrix1[i][k] * matrix2[k][j];
            }
        }
    }
    System.out.println("The product is:");
    
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            System.out.print(product[i][j] + " ");
        }
        System.out.println();
    }
}
