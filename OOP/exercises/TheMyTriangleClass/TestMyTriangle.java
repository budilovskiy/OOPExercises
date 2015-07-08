package oop.excercises.themytriangleclass;

public class TestMyTriangle {

	public static void main(String[] args) {

		MyPoint v1 = new MyPoint(0, 0);
		MyPoint v2 = new MyPoint(3, 0);
		MyPoint v3 = new MyPoint(0, 4);
		
		MyTriangle t1 = new MyTriangle(v1, v2, v3); //scalene
		MyTriangle t2 = new MyTriangle(4, 1, 2, 4, 6, 4); //isosceles
		MyTriangle t3 = new MyTriangle(0, 0, 5, 0, 3, 4); //isosceles
		
		System.out.println("-----------------------------------");
		System.out.println(t1);
		System.out.println("Area is: " + t1.getArea());
		System.out.println("Perimeter is: " + t1.getPerimeter());
		t1.printType();
		System.out.println("-----------------------------------");
		System.out.println(t2);
		System.out.println("Area is: " + t2.getArea());
		System.out.println("Perimeter is: " + t2.getPerimeter());
		t2.printType();
		System.out.println("-----------------------------------");
		System.out.println(t3);
		System.out.println("Area is: " + t3.getArea());
		System.out.println("Perimeter is: " + t3.getPerimeter());
		t3.printType();
	}
}
