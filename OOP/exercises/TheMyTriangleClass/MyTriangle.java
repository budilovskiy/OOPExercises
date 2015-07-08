/**
A class called MyTriangle, which models a triangle with 3 vertices, is designed as follows. 
The MyTriangle class uses three MyPoint instances (created in the earlier exercise) 
as the three vertices.

The class contains:
	Three private instance variables v1, v2, v3 (instances of MyPoint), for the three vertices.
	A constructor that constructs a MyTriangle with three points v1=(x1, y1), v2=(x2, y2), v3=(x3, y3).
	An overloaded constructor that constructs a MyTriangle given three instances of MyPoint.
	A toString() method that returns a string description of the instance in the format 
		"Triangle @ (x1, y1), (x2, y2), (x3, y3)".
	A getPerimeter() method that returns the length of the perimeter in double. 
		You should use the distance() method of MyPoint to compute the perimeter.
	A method printType(), which prints "equilateral" if all the three sides are equal, 
		"isosceles" if any two of the three sides are equal, or "scalene" if the three sides are different.

Write the MyTriangle class. Also write a test program (called TestMyTriangle) to test all the methods defined in the class.
 */

package oop.excercises.themytriangleclass;

public class MyTriangle {

	private MyPoint v1, v2, v3;

	/**
	 * A constructor that constructs a MyTriangle with three points v1=(x1, y1),
	 * v2=(x2, y2), v3=(x3, y3).
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 */
	public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.v1 = new MyPoint(x1, y1);
		this.v2 = new MyPoint(x2, y2);
		this.v3 = new MyPoint(x3, y3);
	}

	/**
	 * An overloaded constructor that constructs a MyTriangle given three
	 * instances of MyPoint.
	 * 
	 * @param v1
	 * @param v2
	 * @param v3
	 */
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	@Override
	public String toString() {
		return "Triangle @ " + v1 + ", " + v2 + ", " + v3;
	}

	/**
	 * Calculate area of MyTriangle instance using Heron's formula
	 * 
	 * see https://en.wikipedia.org/wiki/Heron's_formula
	 * 
	 * @return double value of the area
	 */
	public double getArea() {
		double side1 = v1.distance(v2);
		double side2 = v1.distance(v3);
		double side3 = v2.distance(v3);
		double semiPerimeter = (side1 + side2 + side3) / 2;
		return Math.sqrt(semiPerimeter * (semiPerimeter - side1)
				* (semiPerimeter - side2) * (semiPerimeter - side3));
	}

	/**
	 * Calculate perimeter of MyTriangle instance
	 * 
	 * @return double value of the perimeter
	 */
	public double getPerimeter() {
		return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
	}

	/**
	 * A method printType(), which prints "equilateral" if all the three sides
	 * are equal, "isosceles" if any two of the three sides are equal, or
	 * "scalene" if the three sides are different
	 */
	public void printType() {
		double side1 = v1.distance(v2);
		double side2 = v1.distance(v3);
		double side3 = v2.distance(v3);
		if (side1 == side2 && side1 == side3) {
			System.out.println("Triangle is equilateral");
		} else if (side1 == side2 || side1 == side3 || side2 == side3) {
			System.out.println("Triangle is isosceles");
		} else {
			System.out.println("Triangle is scalene");
		}
	}

}
