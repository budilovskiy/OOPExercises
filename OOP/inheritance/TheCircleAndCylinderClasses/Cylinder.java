/*
 * Exercise: The Circle and Cylinder Classes
 * In this exercise, a subclass called Cylinder is derived from the 
 * superclass Circle as shown in the class diagram (where an an arrow 
 * pointing up from the subclass to its superclass). Study how the 
 * subclass Cylinder invokes the superclass' constructors (via super() 
 * and super(radius)) and inherits the variables and methods from the 
 * superclass Circle.
 * You can reuse the Circle class that you have created in the previous 
 * exercise. Make sure that you keep "Circle.class" in the same directory.
 * 
 * Write a test program (says TestCylinder) to test the Cylinder class created.
 * 
 * Method Overriding and "Super": The subclass Cylinder inherits getArea() 
 * method from its superclass Circle. Try overriding the getArea() method 
 * in the subclass Cylinder to compute the surface area 
 * (=2π×radius×height + 2×base-area) of the cylinder instead of base area. 
 * That is, if getArea() is called by a Circle instance, it returns the area. 
 * If getArea() is called by a Cylinder instance, it returns the surface area 
 * of the cylinder.
 * If you override the getArea() in the subclass Cylinder, the getVolume() no 
 * longer works. This is because the getVolume() uses the overridden getArea() 
 * method found in the same class. (Java runtime will search the superclass only 
 * if it cannot locate the method in this class). Fix the getVolume().
 * Hints: After overridding the getArea() in subclass Cylinder, you can choose 
 * to invoke the getArea() of the superclass Circle by calling super.getArea().
 * TRY:
 * Provide a toString() method to the Cylinder class, which overrides the 
 * toString() inherited from the superclass Circle, e.g.,
 * 
 * @Override
 * public String toString() {      // in Cylinder class
 *   return "Cylinder: subclass of " + super.toString()  // use Circle's toString()
 *           + " height=" + height;
 * }
 * 
 * Try out the toString() method in TestCylinder.
 * Note: @Override is known as annotation (introduced in JDK 1.5), which asks 
 * compiler to check whether there is such a method in the superclass to be 
 * overridden. This helps greatly if you misspell the name of the toString(). 
 * If @Override is not used and toString() is misspelled as ToString(), it will 
 * be treated as a new method in the subclass, instead of overriding the superclass. 
 * If @Override is used, the compiler will signal an error. @Override annotation 
 * is optional, but certainly nice to have.
 * 
 */

package oop.excercises.thecircleandcylinderclasses;

public class Cylinder extends Circle {

	private double height;

	/**
	 * Constructor with default color, radius and height
	 */
	public Cylinder() {
		super();
		height = 1;
	}

	/**
	 * Constructor with default radius, color but given height
	 * 
	 * @param height
	 */
	public Cylinder(double height) {
		super();
		this.height = height;
	}

	/**
	 * Constructor with default color, but given radius, height
	 * 
	 * @param radius
	 * @param height
	 */
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	/**
	 * Getter for height
	 * 
	 * @return height of cylinder
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * A public method for computing the volume of cylinder use superclass
	 * method getArea() to get the base area
	 * 
	 * @return volume of cylinder
	 */
	public double getVolume() {
		return super.getArea() * height;
	}
	
	/**
	 * Compute the surface area (=2π×radius×height + 2×base-area) of the 
	 * cylinder instead of base area
	 * 
	 * @return surface area of cylinder
	 */
	@Override
	public double getArea() {
		return 2*Math.PI*getRadius()*height + 2*super.getArea();
	}
	
	/**
	 * Overrides the toString() inherited from the superclass Circle, e.g.,
	 * 
	 * @return string representation of cylinder
	 */
	@Override
	public String toString() {
		return "Cylinder: subclass of " + super.toString() + // use Circle's toString()
				" height= " + height;
	}
}
