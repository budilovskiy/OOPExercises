package oop.exersizes.superclassshapeanditssubclassescirclerectangleandsquare

public class Rectangle extends Shape {

	private double width;
	private double length;
	
	/**
	 * The no-arg constructor initializes the width and length to 1.0.
	 */
	public Rectangle() {
		super();
		width = 1.0;
		length = 1.0;
	}
	
	/**
	 * A constructor that initializes the width and length to the given values.
	 * 
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	/**
	 * A constructor that initializes the width, length color and filled to the given values.
	 * 
	 * @param width
	 * @param height
	 * @param color
	 * @param filled
	 */
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	/**
	 * Getter for width
	 * 
	 * @return width
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * Setter for width 
	 * 
	 * @param width
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * Getter for length
	 * 
	 * @return length
	 */
	public double getLength() {
		return length;
	}
	
	/**
	 * Setter for length 
	 * 
	 * @param length
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/**
	 * Calculate area of the rectangle
	 * 
	 * @return area
	 */
	public double getArea() {
		return width * length;
	}
	
	/**
	 * Calculate perimeter of the rectangle
	 * 
	 * @return perimeter
	 */
	public double getPerimeter() {
		return 2 * (width + length);
	}
	
	/*
	 * @return "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy", 
	 * where yyy is the output of the toString() method from the superclass.
	 */
	@Override
	public String toString() {
		return "A Rectangle with width=" + width 
			+ " and length=" + length 
			+ ", which is a subclass of " + super.toString();
	}

}
