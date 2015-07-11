/**
 * A class called MyPolynomial, which models polynomials of degree-n (see equation)
The class contains:

An instance variable named coeffs, which stores the coefficients of the n-degree 
polynomial in a double array of size n+1, where c0 is kept at index 0.

A constructor MyPolynomial(coeffs:double...) that takes a variable number of doubles 
to initialize the coeffs array, where the first argument corresponds to c0. 
The three dots is known as varargs (variable number of arguments), which is a new 
feature introduced in JDK 1.5. It accepts an array or a sequence of comma-separated arguments. 
The compiler automatically packs the comma-separated arguments in an array. 
The three dots can only be used for the last argument of the method.
Hints:
public class MyPolynomial {
   private double[] coeffs;
   public MyPolynomial(double... coeffs) {  // varargs
      this.coeffs = coeffs;                 // varargs is treated as array
   }
   ......
}
   
// Test program
// Can invoke with a variable number of arguments
MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
// Can also invoke with an array
Double coeffs = {1.2, 3.4, 5.6, 7.8}
MyPolynomial p2 = new MyPolynomial(coeffs);

Another constructor that takes coefficients from a file (of the given filename), having this format:
Degree-n(int)
c0(double)
c1(double)
......
......
cn-1(double)
cn(double)
(end-of-file)
Hints:
public MyPolynomial(String filename) {
   Scanner in = null;
   try {
      in = new Scanner(new File(filename));  // open file
   } catch (FileNotFoundException e) {
      e.printStackTrace();
   }
   int degree = in.nextInt();      // read the degree
   coeffs = new double[degree+1];  // allocate the array
   for (int i=0; i<coeffs.length; ++i) {
      coeffs[i] = in.nextDouble();
   }
}

A method getDegree() that returns the degree of this polynomial.

A method toString() that returns "cnx^n+cn-1x^(n-1)+...+c1x+c0".

A method evaluate(double x) that evaluate the polynomial for the given x, 
by substituting the given x into the polynomial expression.

Methods add() and multiply() that adds and multiplies this polynomial with 
the given MyPolynomial instance another, and returns a new MyPolynomial 
instance that contains the result.

Write the MyPolynomial class. Also write a test program (called TestMyPolynomial) 
to test all the methods defined in the class.
 */

package oop.excercises.themypolynomialclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyPolynomial {

	private double[] coeffs;

	/**
	 * A constructor MyPolynomial(coeffs:double...) that takes a variable number
	 * of doubles to initialize the coeffs array, where the first argument
	 * corresponds to c0.
	 * 
	 * @param coeffs
	 */
	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;
	}

	/**
	 * Another constructor that takes coefficients from a file (of the given
	 * filename)
	 * 
	 * @param filename
	 */
	public MyPolynomial(String filename) {
		Scanner in = null;
		try {
			in = new Scanner(new File(filename)); // open file
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int degree = in.nextInt(); // read the degree
		coeffs = new double[degree + 1]; // allocate the array
		for (int i = 0; i < coeffs.length; ++i) {
			coeffs[i] = in.nextDouble();
		}
	}

	/**
	 * A method getDegree() that returns the degree of this polynomial.
	 * 
	 * @return the degree of this polynomial
	 */
	public int getDegree() {
		return coeffs.length - 1;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = coeffs.length - 1; i >= 0; i--) {
			if (i > 1) {
				sb.append(coeffs[i] + "x^" + i + "+");
			} else if (i > 0) {
				sb.append(coeffs[i] + "x+");
			} else {
				sb.append(coeffs[i]);
			}
		}
		return new String(sb);
	}

	/**
	 * A method evaluate(double x) that evaluate the polynomial for the given x,
	 * by substituting the given x into the polynomial expression.
	 * 
	 * @param x
	 * @return evaluation of this polynomial for the given x
	 */
	public double evaluate(double x) {
		double sum = 0;
		for (int i = 0; i < coeffs.length; i++) {
			sum += coeffs[i] * Math.pow(x, i);
		}
		return sum;
	}

	/**
	 * Method add() that adds this polynomial with the given MyPolynomial
	 * instance another, and returns a new MyPolynomial instance that contains
	 * the result.
	 * 
	 * @param another
	 * @return new MyPolynomial instance that contains the result of adding
	 */
	public MyPolynomial add(MyPolynomial another) {
		double[] newCoeffs = coeffs;
		for (int i = 0; i < another.coeffs.length; i++) {
			newCoeffs[i] += another.coeffs[i];
		}
		return new MyPolynomial(newCoeffs);
	}

	/**
	 * Method multiply() that multiplies this polynomial with the given
	 * MyPolynomial instance another, and returns a new MyPolynomial instance
	 * that contains the result.
	 * 
	 * @param another
	 * @return new MyPolynomial instance that contains the result of multiply
	 */
	public MyPolynomial multiply(MyPolynomial another) {
		double[] newCoeffs = new double[coeffs.length + another.coeffs.length
				- 1];
		for (int i = 0; i < coeffs.length; i++) {
			for (int j = 0; j < another.coeffs.length; j++) {
				newCoeffs[i + j] += coeffs[i] * another.coeffs[j];
			}
		}
		return new MyPolynomial(newCoeffs);
	}
}
