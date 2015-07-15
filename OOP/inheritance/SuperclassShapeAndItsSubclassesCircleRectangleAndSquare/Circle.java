package oop.excersizes.superclassshapeanditssubclassescirclerectangleandsquare

public class Circle extends Shape {

	private double radius;
  
	/**
	 * The no-arg constructor initializes the radius to 1.0.
	 */
	public Circle() {
		super();
		radius = 1.0;
	}
  
	/**
	 * A constructor that initializes the radius to the given value.
	 * 
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
  
	/**
	 * A constructor that initializes the radius, color and filled to the given values.
	 * 
	 * @param radius
	 * @param color
	 * @param filled
	 */
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	/**
   * Getter for radius
   * 
   * @return radius
   */
	public double getRadius() {
		return radius;
	}
	
	/**
   * Setter for radius 
   * 
   * @param radius
   */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * Calculate area of circle that equals Pi*r^2
	 * 
	 * return area
	 */
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	/**
	 * Calculate area of perimeter that equals 2*Pi*r
	 * 
	 * @return perimeter
	 */
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	/*
	* @return "A Circle with radius=xxx, which is a subclass of yyy", 
	* where yyy is the output of the toString() method from the superclass.
	*/
	@Override
	public String toString() {
		return "A Circle with radius=" + radius ", which is a subclass of " + super.toString();
	}
	
}
