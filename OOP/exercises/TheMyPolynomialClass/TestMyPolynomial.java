package oop.excercises.themypolynomialclass;

public class TestMyPolynomial {

	public static void main(String[] args) {

		MyPolynomial mp = new MyPolynomial("file.txt");
		System.out.println("Degree of polynomial from file is: " + mp.getDegree());
		System.out.println("Polynomial from file is: " + mp);
		System.out.println("Evaluation of polynomial from file for 5 is: " + mp.evaluate(5));

		System.out.println();
		MyPolynomial mp2 = new MyPolynomial(1, 2, 3, 4, 5);
		System.out.println("Degree of polynomial mp2 is : " + mp2.getDegree());
		System.out.println("Polynomial mp2 is: " + mp2);
		System.out.println("Evaluation of polynomial mp2 for -5 is: " + mp2.evaluate(-5));

		System.out.println();
		MyPolynomial mp3 = new MyPolynomial(1, 2, 3);
		System.out.println("Degree of polynomial mp3 is: " + mp3.getDegree());
		System.out.println("Polynomial mp3 is: " + mp3);
		System.out.println("Evaluation of polynomial mp3 for -5 is: " + mp3.evaluate(-5));

		System.out.println();
		System.out.println("Sum of polynomials mp2 and mp3 is: " + mp2.add(mp3));
		System.out.println("Product of polynomials mp2 and mp3 is: " + mp2.multiply(mp3));

	}
}
