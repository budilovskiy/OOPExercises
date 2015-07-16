package oop.excercises.circleandcylinderusingcomposition;

/**
 * 
 * Try rewriting the Circle-Cylinder of the previous exercise using composition
 * instead of inheritance. That is,
 * "a cylinder is composed of a base circle and a height".
 *
 */
public class Cylinder {

	private Circle base;
	private double height;

	/**
	 * Constructor with default color, radius and height
	 */
	public Cylinder() {
		base = new Circle(); // Call the constructor to construct the Circle
		height = 1.0;
	}

	/**
	 * Constructor with default radius of base, color but given height
	 * 
	 * @param height
	 */
	public Cylinder(double heigth) {
		base = new Circle();
		this.height = heigth;
	}
	
	/**
	 * Constructor with given base and height
	 * 
	 * @param base
	 * @param height
	 */
	public Cylinder(Circle base, double height) {
		this.base = base;
		this.height = height;
	}

	/**
	 * Constructor with default color, but given radius, height
	 * 
	 * @param radius
	 * @param height
	 */
	public Cylinder(double radius, double height) {
		base = new Circle(radius);
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
	 * Setter for height
	 * 
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Getter for base
	 * 
	 * @return base
	 */
	public Circle getBase() {
		return base;
	}

	/**
	 * Setter for base
	 * 
	 * @param base
	 */
	public void setBase(Circle base) {
		this.base = base;
	}

	/**
	 * Setter for base
	 * 
	 * @param radius
	 *            of base
	 */
	public void setBase(double radius) {
		base.setRadius(radius);
	}

	/**
	 * A public method for computing the volume of cylinder
	 * 
	 * @return volume of cylinder
	 */
	public double getVolume() {
		return base.getArea() * height;
	}

	/**
	 * Compute the surface area (=2π×radius×height + 2×base-area)
	 * 
	 * @return surface area of cylinder
	 */
	public double getArea() {
		return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
	}

	@Override
	public String toString() {
		return "Cylinder: base " + base.toString() +
				" height= " + height;
	}

}
