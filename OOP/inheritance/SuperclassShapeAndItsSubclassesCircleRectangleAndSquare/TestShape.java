package oop.exersizes.superclassshapeanditssubclassescirclerectangleandsquare;

public class TestShape {

  public static void main(String... args) {
  
    Shape shape1 = new Shape();
    System.out.println(shape1);
    shape1.setColor("blue");
    shape1.setFilled(false);
    System.out.println(shape1);
    
    Shape shape2 = new Shape("yellow", false);
    System.out.println("Shape 2." 
          + " The color is: " + shape2.getColor() 
          + " Is filled: " + shape2.isFilled());
  }

}
