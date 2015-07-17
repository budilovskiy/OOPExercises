package oop.excercises.abstractsuperclassshapeanditsconcretesubclasses;

/**
 * Exercise: Abstract Superclass Shape and Its Concrete Subclasses
 * Rewrite the superclass Shape and its subclasses Circle, Rectangle and Square
 * 
 * In this exercise, Shape shall be defined as an abstract class, which contains:
 *  - Two protected instance variables color(String) and filled(boolean). The protected 
 * 	variables can be accessed by its subclasses and classes in the same package. They 
 * 	are denoted with a '#' sign in the class diagram.
 *  - Getter and setter for all the instance variables, and toString().
 *  - Two abstract methods getArea() and getPerimeter() (shown in italics in the class diagram).
 * 
 * The subclasses Circle and Rectangle shall override the abstract methods getArea() and 
 * getPerimeter() and provide the proper implementation. They also override the toString().
 * Write a test class to test these statements involving polymorphism and explain the outputs. 
 * Some statements may trigger compilation errors. Explain the errors, if any.
 * 
 * What is the usage of the abstract method and abstract class?
 */
abstract public class Shape {
	// protected variables color and filled
	// can be accessed by its subclasses and classes in the same package
	protected String color;
	protected boolean filled;
	
	/**
	 * A no-arg (no-argument) constructor that initializes the color to "green" and filled to true.
	 */
	public Shape() {
		color = "green";
		filled = true;
	}
	
	/**
	 * A constructor that initializes the color and filled to the given values.
	 */
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	/**
	 * Getter for color
	 * 
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Setter for color 
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * Getter for filled
	 * 
	 * @return variable filled
	 */
	public boolean isFilled() {
		return filled;
	}
  
	/**
	 * Setter for filled
	 * 
	 * @param filled
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	// Abstract method must be implemented in child classes
	// to calculate area of certain shape
	abstract public double getArea();
	
	// Abstract method must be implemented in child classes
	// to calculate perimeter of certain shape
	abstract public double getPerimeter();
	
	// return "A Shape with color of xxx and filled/Not filled"
	@Override
	public String toString() {
		return "A Shape with color of " + color + " and" + (filled ? "" : " not") + " filled.";
	}
	
}
