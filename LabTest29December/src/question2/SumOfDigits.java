package com.question2;

import java.util.Scanner;

public class SumOfDigits {

  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = sc.nextInt();
    sc.close();

    int sum = 0;
    while (num > 0) {
      int digit = num % 10;
      sum += digit;
      num = num / 10;
    }

    System.out.println("Sum of digits: " + sum);
  }
}
