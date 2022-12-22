package com.que1;

public class Test {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 5);
		System.out.println("Area of rectangle: " + rectangle.getArea());
		System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());

		Square square = new Square(10);
		System.out.println("Area of square: " + square.getArea());
		System.out.println("Perimeter of square: " + square.getPerimeter());
		}
}
