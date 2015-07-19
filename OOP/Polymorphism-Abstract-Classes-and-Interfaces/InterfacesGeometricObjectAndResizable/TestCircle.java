/*
 * Write a test program called TestCircle to test the methods defined in Circle. 
 */
package oop.excercises.interfacesgeometricobjectandresizable;

public class TestCircle {

	public static void main(String[] args) {

		GeometricObject circle = new Circle(5.0);
		System.out.println(circle);
		System.out.println("area=" + circle.getArea() + ", perimeter=" + circle.getPerimeter());
		
		Circle circle1 = (Circle)circle; // Downcast
		circle1.setRadius(1.5); 
		
		System.out.println(circle);
		System.out.println("area=" + circle.getArea() + ", perimeter=" + circle.getPerimeter());
		
		System.out.println(circle1);
		System.out.println("area=" + circle1.getArea() + ", perimeter=" + circle1.getPerimeter());

	}

}
