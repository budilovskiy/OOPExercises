package thecircleandcylinderclasses;

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
	 * @return
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * A public method for computing the volume of cylinder use superclass method
	 * getArea() to get the base area
	 * 
	 * @return
	 */
	public double getVolume() {
		return getArea() * height;
	}

}
