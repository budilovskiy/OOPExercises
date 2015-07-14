package thecircleandcylinderclasses;

public class TestCylinder {

	public static void main(String[] args) {

		// Declare and allocate a new instance of cylinder
		// with default color, radius, and height
		Cylinder c1 = new Cylinder();
		System.out.println("Cylinder:" 
				+ " radius=" + c1.getRadius()
				+ " height=" + c1.getHeight() 
				+ " surface area=" + c1.getArea()
				+ " volume=" + c1.getVolume());
		
		// Declare and allocate a new instance of cylinder
	    // specifying height, with default color and radius
	    Cylinder c2 = new Cylinder(10.0);
	    System.out.println("Cylinder:"
	            + " radius=" + c2.getRadius()
	            + " height=" + c2.getHeight()
	            + " surface area=" + c2.getArea()
	            + " volume=" + c2.getVolume());
	   
	    // Declare and allocate a new instance of cylinder
	    // specifying radius and height, with default color
	    Cylinder c3 = new Cylinder(2.0, 10.0);
	    System.out.println("Cylinder:"
	            + " radius=" + c3.getRadius()
	            + " height=" + c3.getHeight()
	            + " surface area=" + c3.getArea()
	            + " volume=" + c3.getVolume());
	    
	    Cylinder c4 = new Cylinder(1.0, 10);
	    System.out.println(c4); // Cylinder: subclass of Circle [radius=1.0, color=red, area=69.11503837897544] height= 10.0
	    						// The area of a circle is not computed properly
	    						// because it has been overwritten in Cylinder class
	}
}
