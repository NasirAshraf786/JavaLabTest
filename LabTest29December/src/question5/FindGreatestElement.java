package com.question5;

import java.util.Scanner;

public class FindGreatestElement {
	
  public static void main(String[] args) {
	  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();

    int[] numbers = new int[size];
    for (int i = 0; i < size; i++) {
      System.out.print("Enter element " + (i + 1) + ": ");
      numbers[i] = sc.nextInt();
    }
    sc.close();

    int greatest = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > greatest) {
        greatest = numbers[i];
      }
    }

    System.out.println("Greatest element: " + greatest);
  }
}
