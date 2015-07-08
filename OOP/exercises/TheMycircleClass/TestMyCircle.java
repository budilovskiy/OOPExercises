package oop.excercises.themycircleclass;

public class TestMyCircle {

	public static void main(String[] args) {

		MyPoint center = new MyPoint(2, 0);

		MyCircle circle1 = new MyCircle(center, 5);
		MyCircle circle2 = new MyCircle(3, 5, 1);

		System.out.println(circle1 + ", area is " + circle1.getArea());
		System.out.println(circle2 + ", area is " + circle2.getArea());
		System.out.println("Distance between " + circle1 + " and " + circle2
				+ " is " + circle1.getCenter().distance(circle2.getCenter()));
		circle1.setCenter(1, 2);
		circle2.setCenter(center);
		System.out.println(circle1.getCenter());
		System.out.println(circle2.getCenter());
		circle1.setRadius(2);
		System.out.println(circle1 + ", area is " + circle1.getArea());
		System.out.println(circle2.getRadius());
	}
}
