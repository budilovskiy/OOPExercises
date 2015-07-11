package oop.excercises.themycomplexclass;

import java.util.Scanner;

public class MyComplexApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Enter complex number 1 (real and imaginary part): ");
		MyComplex c1 = new MyComplex(scanner.nextDouble(), scanner.nextDouble());

		System.out
				.println("Enter complex number 2 (real and imaginary part): ");
		MyComplex c2 = new MyComplex(scanner.nextDouble(), scanner.nextDouble());

		System.out.println("Number 1 is: " + c1);
		System.out.println(c1
				+ (c1.isReal() ? " is a pure real number"
						: " is NOT a pure real number"));
		System.out.println(c1
				+ (c1.isImaginary() ? " is a pure imaginary number"
						: " is NOT a pure imaginary number"));
		
		System.out.println();
		System.out.println("Number 2 is: " + c2);
		System.out.println(c2
				+ (c2.isReal() ? " is a pure real number"
						: " is NOT a pure real number"));
		System.out.println(c2
				+ (c2.isImaginary() ? " is a pure imaginary number"
						: " is NOT a pure imaginary number"));
		
		System.out.println();
		System.out.println(c1 + (c1.equals(c2) ? " is equal to " :  " is NOT equal to ") + c2);
		
		System.out.println();
		System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
		System.out.println(c1 + " - " + c2 + " = " + c1.subtract(c2));

	}
}
