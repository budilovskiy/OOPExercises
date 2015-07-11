package oop.excercises.themycomplexclass;

public class MyComplexTest {
	MyComplex c1 = new MyComplex(1, 3);
	MyComplex c2 = new MyComplex(4, -5);

	public void test() {
		System.out.println(c1 + " magnitude is: " + c1.magnitude());
		System.out.println(c1 + " argument in radians: " + c1.argumentInRadians());
		System.out.println(c1 + " argument in degrees: " + c1.argumentInDegrees());
		System.out.println(c1 + " conjugate: " + c1.conjugate());
		System.out.println("--------------");
		System.out.println(c2 + " magnitude is: " + c2.magnitude());
		System.out.println(c2 + " argument in radians: " + c2.argumentInRadians());
		System.out.println(c2 + " argument in degrees: " + c2.argumentInDegrees());
		System.out.println(c2 + " conjugate: " + c2.conjugate());
		System.out.println("--------------");
		System.out.println(c1 + (c1.equals(c2) ? " is equal to " : " is NOT equal to ") + c2 + " : MyComplex arg");
		System.out.println(c1 + (c1.equals(1, 3) ? " is equal to " : " is NOT equal to ") + new MyComplex(1, 3) + " : double args");
		Object complex = (Object) new MyComplex(0, 1);
		System.out.println(c1 + (c1.equals(complex) ? " is equal to " : " is NOT equal to ") + complex + " : Object arg");
		System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
		System.out.println(c1 + " - " + c2 + " = " + c1.subtract(c2));
		System.out.println(c1 + " * " + c2 + " = " + c1.multiplyWith(c2));
		MyComplex c3 = new MyComplex(1, 3);
		MyComplex c4 = new MyComplex(4, -5);
		System.out.println(c3 + " / " + c4 + " = " + c3.divideBy(c4));
	}

}
