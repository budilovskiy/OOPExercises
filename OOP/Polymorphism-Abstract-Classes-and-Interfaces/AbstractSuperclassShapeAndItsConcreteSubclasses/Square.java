package oop.excercises.abstractsuperclassshapeanditsconcretesubclasses;

/**
 * Class provides representation of square. Extends class Rectangle.
 *
 */
public class Square extends Rectangle {

	/**
	 * A no-arg (no-argument) constructor that initializes side of square to
	 * 1.0, color and filled to default values.
	 */
	public Square() {
		super(1.0, 1.0);
	}

	/**
	 * A constructor that initializes width and length of parent rectangle to
	 * the given value of side, color and filled to the default values.
	 * 
	 * @param side
	 */
	public Square(double side) {
		super(side, side);
	}

	/**
	 * A constructor that initializes width and length of parent rectangle to
	 * the given value of side, color and filled to the given values.
	 * 
	 * @param side
	 * @param color
	 * @param filled
	 */
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}

	/**
	 * Getter of the side of the square
	 * 
	 * @return double value of side
	 */
	public double getSide() {
		return width;
	}

	/**
	 * Setter of the side of the square
	 * 
	 * @param side
	 */
	public void setSide(double side) {
		width = side;
		length = side;
	}

	@Override
	public void setWidth(double width) {
		setSide(width);
	}

	@Override
	public void setLength(double length) {
		setSide(length);
	}

	@Override
	public String toString() {
		return "Square with side=" + width + ", which is a subclass of " + super.toString();
	}
	
}
