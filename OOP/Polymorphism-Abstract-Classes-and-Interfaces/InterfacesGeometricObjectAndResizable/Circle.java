/*
 * Write the implementation class Circle, with a protected 
 * variable radius, which implements the interface GeometricObject.
 */
package oop.excercises.interfacesgeometricobjectandresizable;

public class Circle implements GeometricObject {

	protected double radius;

	// Constructors
	public Circle() {
		radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Getter for instance variable radius
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Setter for instance variable radius
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * Calculate perimeter
	 * 
	 * @return perimeter of the circle
	 */
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	/**
	 * Calculate area
	 * 
	 * @return area of the circle
	 */
	@Override
	public double getArea() {
		return radius * radius * Math.PI; // Area = Pi * r^2
	}
	
	@Override
	public String toString() {
		return "Circle with radius=" + radius;
	}

}
