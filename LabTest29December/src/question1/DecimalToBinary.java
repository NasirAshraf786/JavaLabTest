package com.question1;

import java.util.Scanner;

public class DecimalToBinary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
    int decimal = sc.nextInt();
    sc.close();

    String binary = "";
    while (decimal > 0) {
      int remainder = decimal % 2;
      binary = remainder + binary;
      decimal = decimal / 2;
    }

    System.out.println("Binary equivalent: " + binary);
  }
}
