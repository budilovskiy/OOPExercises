package oop.excercises.interfacesgeometricobjectandresizable;

public class TestResizableCircle {

	public static void main(String[] args) {

		Resizable circle1 = new ResizableCircle(100);
		System.out.println(circle1);
		circle1.resize(50);
		System.out.println(circle1);
		circle1.resize(25);
		System.out.println(circle1);

	}

}
