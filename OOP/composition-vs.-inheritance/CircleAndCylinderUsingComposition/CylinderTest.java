package oop.excercises.circleandcylinderusingcomposition;

public class CylinderTest {

	public static void main(String[] args) {

		Circle circle = new Circle();
		Cylinder cylinder1 = new Cylinder(0.5, 18);
		System.out.println(cylinder1); //Cylinder: base Circle [radius=0.5, color=red, area=0.7853981633974483] height= 18.0
		
		cylinder1.setBase(circle);
		cylinder1.setHeight(2.0);
		System.out.println(cylinder1); //Cylinder: base Circle [radius=1.0, color=red, area=3.141592653589793] height= 2.0
		
		Cylinder cylinder2 = new Cylinder();
		System.out.println(cylinder2);
		System.out.println(cylinder2.getBase());
		System.out.println("Cylinder area=" + cylinder2.getArea() + " volume=" + cylinder2.getVolume());

	}

}
