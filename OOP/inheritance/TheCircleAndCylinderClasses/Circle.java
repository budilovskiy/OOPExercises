package oop.excercises.thecircleandcylinderclasses;

public class Circle {
	
	private double radius;
	private String color;
	
	/**
	 * Default constructor
	 */
	public Circle() {
		radius = 1.0; // default radius
		color = "red"; // default color
	}
	
	/**
	 * Constructor with given radius
	 * @param radius
	 */
	public Circle(double radius) {
		this.radius = radius;
		color = "red"; // default color
	}
	
	/**
	 * Constructor with given radius and color
	 * @param radius
	 */
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	/**
	 * Getter for instance variable radius
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Getter for instance variable color
	 * @return color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Getter for instance area
	 * @return area of the circle
	 */
	public double getArea() {
		return radius*radius*Math.PI; // Area = Pi * r^2
	}
	
	/**
	 * Setter for instance variable radius
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Setter for instance variable color
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", area="
				+ getArea() + "]";
	}
}
