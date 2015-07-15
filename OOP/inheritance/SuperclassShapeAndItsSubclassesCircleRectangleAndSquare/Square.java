package oop.exersizes.superclassshapeanditssubclassescirclerectangleandsquare

public class Square extends Rectangle {

	/**
	 * The no-arg constructor initializes the side to 1.0.
	 * 
	 */
	public Square() {
		super(1.0, 1.0);
	}
	
	/**
	 * A constructor that initializes the side to the given value.
	 * It uses parent constructor Rectangle(double width, double length)
	 * 
	 * @param side
	 */
	public Square(double side) {
		super(side, side);
	}
	
	/**
	 * A constructor that initializes the side, color and filled to the given values.
	 * It uses parent constructor Rectangle(double width, double length, String color, boolean filled)
	 * 
	 * @param side
	 * @param color
	 * @param filled
	 */
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	/*
	 * @return "A Square with side=xxx, which is a subclass of yyy", 
	 * where yyy is the output of the toString() method from the superclass.
	 */
	@Override
	public String toString() {
		return "A Square with side=" + super.gerWidth() 
			+ " , which is a subclass of " + super.toString();
	}
	
	/**
	 * Change both the width and length of parent Rectangle class, so as to maintain 
	 * the square geometry 
	 * 
	 * @param side
	 */
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	/**
	 * Change both the width and length of parent Rectangle class, so as to maintain 
	 * the square geometry 
	 * 
	 * @param side
	 */
	@Override
	public void setLength(double side) {
		super.setWidth(side);
		super.setLength(side);
	}

}
