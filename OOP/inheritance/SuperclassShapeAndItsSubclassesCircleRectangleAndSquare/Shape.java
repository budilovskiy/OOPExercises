package oop.excersizes.superclassshapeanditssubclassescirclerectangleandsquare

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
