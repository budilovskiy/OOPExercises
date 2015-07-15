package oop.excersizes.superclassshapeanditssubclassescirclerectangleandsquare

/**
 * Write a superclass called Shape (as shown in the class diagram), which contains:
 * Two instance variables color (String) and filled (boolean).
 * Two constructors: a no-arg (no-argument) constructor that initializes the color 
 * to "green" and filled to true, and a constructor that initializes the color and 
 * filled to the given values.
 * Getter and setter for all the instance variables. By convention, the getter for 
 * a boolean variable xxx is called isXXX() (instead of getXxx() for all the other 
 * types).
 * A toString() method that returns "A Shape with color of xxx and filled/Not filled".
 * Write a test program to test all the methods defined in Shape. 
 * 
 * 
 * Write two subclasses of Shape called Circle and Rectangle,.
 * 
 * The Circle class contains:
 * - An instance variable radius (double).
 * - Three constructors as shown. The no-arg constructor initializes the radius to 1.0.
 * - Getter and setter for the instance variable radius.
 * - Methods getArea() and getPerimeter().
 * - Override the toString() method inherited, to return "A Circle with radius=xxx, 
 *			which is a subclass of yyy", where yyy is the output of the toString() method 
 *			from the superclass.
 * 
 * The Rectangle class contains:
 * - Two instance variables width (double) and length (double).
 * - Three constructors as shown. The no-arg constructor initializes the width and length to 1.0.
 * - Getter and setter for all the instance variables.
 * - Methods getArea() and getPerimeter().
 * - Override the toString() method inherited, to return "A Rectangle with width=xxx and length=zzz, 
 *      which is a subclass of yyy", where yyy is the output of the toString() method from the 
 *      superclass.
 * 
 * Write a class called Square, as a subclass of Rectangle. Convince yourself that Square can be 
 * modeled as a subclass of Rectangle. Square has no instance variable, but inherits the instance 
 * variables width and length from its superclass Rectangle.
 * Provide the appropriate constructors (as shown in the class diagram). Hint:
 * 
 * public Square(double side) {
 *  super(side, side);  // Call superclass Rectangle(double, double)
 * }
 * Override the toString() method to return "A Square with side=xxx, which is a subclass of yyy", 
 * where yyy is the output of the toString() method from the superclass.
 * Do you need to override the getArea() and getPerimeter()? Try them out.
 * Override the setLength() and setWidth() to change both the width and length, so as to maintain 
 * the square geometry.
 * 
 */

public class Shape {
  
  private String color;
  private boolean filled;
  
  /**
   * A no-arg (no-argument) constructor that initializes the color to "green" and filled to true.
   */
  public Shape() {
    color = "green";
    filled = true;
  }
  
  /**
   * A constructor that initializes the color and filled to the given values.
   */
  public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }
  
  /**
   * Getter for color
   * 
   * @return color
   */
  public String getColor() {
    return color;
  }
  /**
   * Setter for color 
   * 
   * @param color
   */
  public void setColor(String color) {
    this.color = color;
  }
  
  /**
   * Getter for filled
   * 
   * @return variable filled
   */
  public boolean isFilled() {
    return filled;
  }
  
  /**
   * Setter for filled
   * 
   * @param filled
   */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  
  /*
  * @return "A Shape with color of xxx and filled/Not filled"
  */
  @Override
  public String toString() {
    return "A Shape with color of " + color " and" + (filled ? "" : " not") + " filled.";
  }
  
}
