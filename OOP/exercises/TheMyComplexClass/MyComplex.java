/**
 * Exercise: The MyComplex class

A class called MyComplex, which models complex numbers x+yi, is designed as shown in the class diagram. 
It contains:
Two instance variable named real(double) and imag(double) which stores the real and imaginary parts of
the complex number respectively.
A constructor that creates a MyComplex instance with the given real and imaginary values.
Getters and setters for instance variables real and imag.
A method setValue() to set the value of the complex number.
A toString() that returns "(x + yi)" where x and y are the real and imaginary parts respectively.
Methods isReal() and isImaginary() that returns true if this complex number is real or imaginary, respectively. 
Hint:
return (imag == 0);   // isReal()
A method equals(double real, double imag) that returns true if this complex number is equal to the 
given complex number of (real, imag).
An overloaded equals(MyComplex another) that returns true if this complex number is equal to the 
given MyComplex instance another.
A method magnitude()that returns the magnitude of this complex number.
magnitude(x+yi) = Math.sqrt(x2 + y2)
Methods argumentInRadians() and argumentInDegrees() that returns the argument of this complex number 
in radians (in double) and degrees (in int) respectively.
arg(x+yi) = Math.atan2(y, x) (in radians)
Note: The Math library has two arc-tangent methods, Math.atan(double) and Math.atan2(double, double). 
We commonly use the Math.atan2(y, x) instead of Math.atan(y/x) to avoid division by zero. Read the 
documentation of Math class in package java.lang.
A method conjugate() that returns a new MyComplex instance containing the complex conjugate of this instance.
conjugate(x+yi) = x - yi
Hint:
return new MyComplex(real, -imag);  // construct a new instance and return the constructed instance
Methods add(MyComplex another) and subtract(MyComplex another) that adds and subtract this instance 
with the given MyComplex instance another, and returns a new MyComplex instance containing the result.
(a + bi) + (c + di) = (a+c) + (b+d)i
(a + bi) - (c + di) = (a-c) + (b-d)i
Methods multiplyWith(MyComplex another) and divideBy(MyComplex another) that multiplies and divides 
this instance with the given MyComplex instance another, keep the result in this instance, and returns 
this instance.
(a + bi) * (c + di) = (ac - bd) + (ad + bc)i
(a + bi) / (c + di) = [(a + bi) * (c – di)] / (c2 + d2)
Hint:
return this;  // return "this" instance
You are required to:
Write the MyComplex class.
Write a test program to test all the methods defined in the class.
Write an application called MyComplexApp that uses the MyComplex class. The application shall prompt 
the user for two complex numbers, print their values, check for real, imaginary and equality, and 
carry out all the arithmetic operations.
Enter complex number 1 (real and imaginary part): 1.1 2.2
Enter complex number 2 (real and imaginary part): 3.3 4.4
  
Number 1 is: (1.1 + 2.2i)
(1.1 + 2.2i) is NOT a pure real number
(1.1 + 2.2i) is NOT a pure imaginary number
  
Number 2 is: (3.3 + 4.4i)
(3.3 + 4.4i) is NOT a pure real number
(3.3 + 4.4i) is NOT a pure imaginary number
   
(1.1 + 2.2i) is NOT equal to (3.3 + 4.4i)
(1.1 + 2.2i) + (3.3 + 4.4i) = (4.4 + 6.6000000000000005i)
(1.1 + 2.2i) - (3.3 + 4.4i) = (-2.1999999999999997 + -2.2i)

Take note that there are a few flaws in the design of this class, which was introduced solely 
for teaching purpose:
- Comparing doubles in equal() using "==" may produce unexpected outcome. 
For example, (2.2+4.4)==6.6 returns false. It is common to define a small threshold 
called EPSILON (set to about 10^-8) for comparing floating point numbers.
- The method add(), subtract(), and conjugate() produce new instances, whereas 
multiplyWith() and divideBy() modify this instance. There is inconsistency in the 
design (introduced for teaching purpose).
- Unusual to have both argumentInRadians() and argumentInDegrees().
 */

package oop.excercises.themycomplexclass;

public class MyComplex {

	private double real;
	private double imag;

	/**
	 * A constructor that creates a MyComplex instance with the given real and
	 * imaginary values.
	 * 
	 * @param real
	 * @param imagine
	 */
	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	/**
	 * Getters and setters for instance variables real and imag.
	 * 
	 * @return
	 */
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	/**
	 * A method setValue() to set the value of the complex number.
	 * 
	 * @param real
	 * @param imag
	 */
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	@Override
	public String toString() {
		return "(" + real
				+ (imag < 0 ? (" - ") + Math.abs(imag) : " + " + imag) + "i)";
	}

	/**
	 * Method isReal() that returns true if this complex number is real.
	 * 
	 * @return true if this complex number is real
	 */
	public boolean isReal() {
		return (imag == 0);
	}

	/**
	 * Method isImaginary() that returns true if this complex number is
	 * imaginary.
	 * 
	 * @return true if this complex number is imaginary
	 */
	public boolean isImaginary() {
		return (real == 0);
	}

	/**
	 * An overwritten method equals(Object obj) that returns true if this
	 * complex number is equal to the given Object.
	 * 
	 * Comparing doubles in equal() using "==" may produce unexpected outcome.
	 * For example, (2.2+4.4)==6.6 returns false. It is common to define a small
	 * threshold called EPSILON (set to about 10^-8) for comparing floating
	 * point numbers.
	 * 
	 * @param obj
	 * @return true if this complex number is equal to the given Object
	 */
	@Override
	public boolean equals(Object obj) {
		double epsilon = 10E-8;
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyComplex other = (MyComplex) obj;
		if (Math.abs(real - other.real) > epsilon)
			return false;
		if (Math.abs(imag - other.imag) > epsilon)
			return false;
		return true;
	}

	/**
	 * An overloaded method equals(double real, double imag) that returns true
	 * if this complex number is equal to the given complex number of (real,
	 * imag).
	 * 
	 * Comparing doubles in equal() using "==" may produce unexpected outcome.
	 * For example, (2.2+4.4)==6.6 returns false. It is common to define a small
	 * threshold called EPSILON (set to about 10^-8) for comparing floating
	 * point numbers.
	 * 
	 * @param real
	 * @param imag
	 * @return true if this complex number is equal to the given complex number
	 *         of (real, imag)
	 */
	public boolean equals(double real, double imag) {
		double epsilon = 10E-8;
		if (Math.abs(this.real - real) > epsilon)
			return false;
		if (Math.abs(this.imag - imag) > epsilon)
			return false;
		return true;
	}

	/**
	 * An overloaded equals(MyComplex another) that returns true if this complex
	 * number is equal to the given MyComplex instance another.
	 * 
	 * Comparing doubles in equal() using "==" may produce unexpected outcome.
	 * For example, (2.2+4.4)==6.6 returns false. It is common to define a small
	 * threshold called EPSILON (set to about 10^-8) for comparing floating
	 * point numbers.
	 * 
	 * @param another
	 * @return true if this complex number is equal to the given MyComplex
	 *         instance another
	 */
	public boolean equals(MyComplex another) {
		double epsilon = 10E-8;
		if (Math.abs(this.real - another.real) > epsilon)
			return false;
		if (Math.abs(this.imag - another.imag) > epsilon)
			return false;
		return true;
	}

	/**
	 * A method magnitude()that returns the magnitude of this complex number.
	 * 
	 * @return magnitude of this complex number.
	 * 
	 *         magnitude(x+yi) = Math.sqrt(x2 + y2)
	 */
	public double magnitude() {
		return Math.sqrt(real * real + imag * imag);
	}

	/**
	 * Method argumentInRadians() that returns the argument of this complex
	 * number in radians (in double).
	 * 
	 * The Math library has two arc-tangent methods, Math.atan(double) and
	 * Math.atan2(double, double). We commonly use the Math.atan2(y, x) instead
	 * of Math.atan(y/x) to avoid division by zero. Read the documentation of
	 * Math class in package java.lang.
	 * 
	 * @return the argument of this complex number in radians (in double)
	 */
	public double argumentInRadians() {
		return Math.atan2(imag, real);
	}

	/**
	 * Method argumentInDegrees() that returns the argument of this complex
	 * number in degrees (in double).
	 * 
	 * @return the argument of this complex number in degrees (in double)
	 */
	public double argumentInDegrees() {
		return Math.toDegrees(argumentInRadians());
	}

	/**
	 * A method conjugate() that returns a new MyComplex instance containing the
	 * complex conjugate of this instance.
	 * 
	 * @return a new MyComplex instance containing the complex conjugate of this
	 *         instance
	 */
	public MyComplex conjugate() {
		return new MyComplex(real, -imag);
	}

	/**
	 * Method add(MyComplex another)that adds this instance with the given
	 * MyComplex instance another, and returns a new MyComplex instance
	 * containing the result.
	 * 
	 * (a + bi) + (c + di) = (a+c) + (b+d)i
	 * 
	 * @param another
	 * @return a new MyComplex instance containing the result of adding
	 */
	public MyComplex add(MyComplex another) {
		return new MyComplex(real + another.real, imag + another.imag);
	}

	/**
	 * Method subtract(MyComplex another) that subtract this instance with the
	 * given MyComplex instance another, and returns a new MyComplex instance
	 * containing the result.
	 * 
	 * (a + bi) - (c + di) = (a-c) + (b-d)i
	 * 
	 * @param another
	 * @return a new MyComplex instance containing the result of subtraction
	 */
	public MyComplex subtract(MyComplex another) {
		return new MyComplex(real - another.real, imag - another.imag);
	}

	/**
	 * Method multiplyWith(MyComplex another) that multiplies this instance with
	 * the given MyComplex instance another, keep the result in this instance,
	 * and returns this instance.
	 * 
	 * (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
	 * 
	 * Method modify this instance. There is inconsistency in the design
	 * (introduced for teaching purpose).
	 * 
	 * @param another
	 * @return this instance multiplied with another
	 */
	public MyComplex multiplyWith(MyComplex another) {
		double a = real;
		double b = imag;
		double c = another.real;
		double d = another.imag;
		real = a * c - b * d;
		imag = a * d + b * c;
		return this;
	}

	/**
	 * Method divideBy(MyComplex another) that divides this instance with the
	 * given MyComplex instance another, keep the result in this instance, and
	 * returns this instance.
	 * 
	 * (a + bi) / (c + di) = [(a + bi) * (c – di)] / (c2 + d2)
	 * 
	 * Method modify this instance. There is inconsistency in the design
	 * (introduced for teaching purpose).
	 * 
	 * @param another
	 * @return this instance divided by another
	 */
	public MyComplex divideBy(MyComplex another) {
		double a = real;
		double b = imag;
		double c = another.real;
		double d = another.imag;
		real = (a * c - b * (-d)) / (c * c + d * d);
		imag = (a * (-d) + b * c) / (c * c + d * d);
		return this;
	}
}
