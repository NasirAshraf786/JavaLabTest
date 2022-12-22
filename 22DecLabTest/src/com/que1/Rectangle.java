package com.que1;

public class Rectangle {

	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getArea() {
		return length * breadth;
		}

		public int getPerimeter() {
		return 2 * (length + breadth);
		}
		}

class Square extends Rectangle {
	
	public Square(int s) {
		super(s, s);
		
		}
		

		/*public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 5);
		System.out.println("Area of rectangle: " + rectangle.getArea());
		System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());

		Square square = new Square(10);
		System.out.println("Area of square: " + square.getArea());
		System.out.println("Perimeter of square: " + square.getPerimeter());
		}*/
}
