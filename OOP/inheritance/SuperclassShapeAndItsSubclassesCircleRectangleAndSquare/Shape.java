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
