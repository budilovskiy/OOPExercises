package oop.excercises.abstractsuperclassshapeanditsconcretesubclasses;

/**
 * Class provides representation of circle.
 * Class extends abstract class Shape and implements its abstract 
 * methods getArea() and getPerimeter().
 *
 */
public class Circle extends Shape {

	protected double radius;

	/**
	 * A no-arg (no-argument) constructor that initializes the radius to 1.0,
	 * color to "green" and filled to true.
	 */
	public Circle() {
		super();
		radius = 1.0;
	}

	/**
	 * A constructor that initializes the radius to given value, color and
	 * filled to the default values.
	 * 
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	/**
	 * A constructor that initializes the radius, color and filled to the given
	 * values.
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
	 * Getter for instance variable radius
	 * 
	 * @return the double value of radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * Setter for instance variable radius
	 * 
	 * @param double value of radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/* (non-Javadoc)
	 * @see oop.excercises.abstractsuperclassshapeanditsconcretesubclasses.Shape#getArea()
	 */
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	/* (non-Javadoc)
	 * @see oop.excercises.abstractsuperclassshapeanditsconcretesubclasses.Shape#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "A circle with radius=" + radius + ", which is a subclass of "
				+ super.toString();
	}

}
