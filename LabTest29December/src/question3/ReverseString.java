package com.question3;


import java.util.Scanner;

public class ReverseString {


  public static void main(String[] args) {
  
  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    sc.close();

    char[] chars = str.toCharArray();
    int left = 0;
    int right = chars.length - 1;
    while (left < right) {
      char temp = chars[left];
      chars[left] = chars[right];
      chars[right] = temp;
      left++;
      right--;
    }

    String reversed = new String(chars);
    System.out.println("Reversed string: " + reversed);
  }
}

