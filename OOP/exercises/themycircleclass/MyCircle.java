/**
 * A class called MyCircle, which models a circle with a center (x, y) and a radius, 
 * is designed as shown in the class diagram. The MyCircle class uses an instance of 
 * MyPoint class (created in the previous exercise) as its center.
 * The class contains:
 * - Two private instance variables: center (an instance of MyPoint) and radius (int).
 * - A constructor that constructs a circle with the given center's (x, y) and radius.
 * - An overloaded constructor that constructs a MyCircle given a MyPoint instance as 
 *   center, and radius.
 * - Various getters and setters.
 * - A toString() method that returns a string description of this instance in the 
 *   format "Circle @ (x, y) radius=r".
 * - A getArea() method that returns the area of the circle in double.
 * Write the MyCircle class. Also write a test program (called TestMyCircle) to test all 
 * the methods defined in the class.
 */

package oop.excercises.themycircleclass;

public class MyCircle {

	private MyPoint center;
	private int radius;

	/**
	 * A constructor that constructs a circle with the given center's (x, y) and
	 * radius.
	 * 
	 * @param x
	 * @param y
	 * @param radius
	 */
	public MyCircle(int x, int y, int radius) {
		this.center = new MyPoint(x, y);
		this.radius = radius;
	}

	/**
	 * An overloaded constructor that constructs a MyCircle given a MyPoint
	 * instance as center, and radius.
	 * 
	 * @param center
	 * @param radius
	 */
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	/*
	 * Getters and setters
	 */
	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public void setCenter(int x, int y) {
		this.center = new MyPoint(x, y);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle @ " + center + " radius = " + radius;
	}

	/**
	 * A getArea() method that returns the area of the circle in double.
	 * 
	 * @return area of MyCircle instance
	 */
	public double getArea() {
		return 2 * Math.PI * radius;
	}
}
