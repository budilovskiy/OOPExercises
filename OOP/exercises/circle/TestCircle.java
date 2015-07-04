package oop.excercises.circle;

public class TestCircle {

	public static void main(String[] args) {

		// Declare and allocate an instance of class Circle called c1
		// with default radius and color
		Circle c1 = new Circle();

		// Use the dot operator to invoke methods of instance c1.
		System.out.println(c1);

		// Declare and allocate an instance of class circle called c2
		// with the given radius and default color
		Circle c2 = new Circle(2.0);

		// Use the dot operator to invoke methods of instance c2.
		System.out.println(c2);

		// Declare and allocate an instance of class circle called c3
		// with the given radius and color
		Circle c3 = new Circle(3.0, "green");

		// Use the dot operator to invoke methods of instance c3.
		System.out.println(c3);

		// Declare and allocate an instance of class circle called c4
		Circle c4 = new Circle();
		// Set variables of c4 to new values
		c4.setRadius(4.0);
		c4.setColor("yellow");

		// Use the dot operator to invoke methods of instance c4.
		System.out.println(c4);

	}
}
