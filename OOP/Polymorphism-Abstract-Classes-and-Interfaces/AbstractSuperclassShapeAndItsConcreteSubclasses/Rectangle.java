package oop.excercises.abstractsuperclassshapeanditsconcretesubclasses;

/**
 * Class provides representation of rectangle.
 * Class extends abstract class Shape and implements its abstract 
 * methods getArea() and getPerimeter().
 *
 */
public class Rectangle extends Shape {
	
	protected double width;
	protected double length;

	/**
	 * A no-arg (no-argument) constructor that initializes the width and length to 1.0,
	 * color and filled to default values.
	 */
	public Rectangle() {
		super();
		width = 1.0;
		length = 1.0;
	}
	
	/**
	 * A constructor that initializes width and length to the given values,
	 * color and filled to the default values.
	 * 
	 * @param width
	 * @param length
	 */
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	/**
	 * A constructor that initializes width, length, color and filled to the given
	 * values.
	 * 
	 * @param width
	 * @param length
	 * @param color
	 * @param filled
	 */
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	// Getters and setters for width and length
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	/* (non-Javadoc)
	 * @see oop.excercises.abstractsuperclassshapeanditsconcretesubclasses.Shape#getArea()
	 */
	@Override
	public double getArea() {
		return width * length;
	}

	/* (non-Javadoc)
	 * @see oop.excercises.abstractsuperclassshapeanditsconcretesubclasses.Shape#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}
	
	@Override
	public String toString() {
		return "A rectangle with width=" + width 
				+ " and length=" + length 
				+ ", which is a subclass of " + super.toString();
	}

}
