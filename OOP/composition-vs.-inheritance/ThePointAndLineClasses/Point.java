package oop.excercises.thepointandlineclasses;

/**
 * Exercise: The Point and Line Classes
 * Let us begin with composition with the statement "a line composes of two points".
 * Complete the definition of the following two classes: Point and Line. The class 
 * Line composes 2 instances of class Point, representing the beginning and ending 
 * points of the line. Also write test classes for Point and Line (says TestPoint 
 * and TestLine).
 * 
 * public class Point {
	   // Private variables
	   private int x;    // x co-ordinate
	   private int y;    // y co-ordinate
	   
	   // Constructor
	   public Point (int x, int y) {......}
	   
	   // Public methods
	   public String toString() {
	      return "Point: (" + x + "," + y + ")";
	   }
	   
	   public int getX() {......}
	   public int getY() {......}
	   public void setX(int x) {......}
	   public void setY(int y) {......}
	   public void setXY(int x, int y) {......}
	}
	public class TestPoint {
	   public static void main(String[] args) {
	      Point p1 = new Point(10, 20);   // Construct a Point
	      System.out.println(p1);
	      // Try setting p1 to (100, 10).
	      ......
	   }
	}
	public class Line {
	   // A line composes of two points (as instance variables)
	   private Point begin;    // beginning point
	   private Point end;      // ending point
	   
	   // Constructors
	   public Line (Point begin, Point end) {  // caller to construct the Points
	      this.begin = begin;
	      ......
	   }
	   public Line (int beginX, int beginY, int endX, int endY) {
	      begin = new Point(beginX, beginY);   // construct the Points here
	      ......
	   }
	   
	   // Public methods
	   public String toString() { ...... }
	   
	   public Point getBegin() { ...... }
	   public Point getEnd() { ...... }
	   public void setBegin(......) { ...... }
	   public void setEnd(......) { ...... }
	   
	   public int getBeginX() { ...... }
	   public int getBeginY() { ...... }
	   public int getEndX() { ...... }
	   public int getEndY() { ...... }
	   
	   public void setBeginX(......) { ...... }
	   public void setBeginY(......) { ...... }
	   public void setBeginXY(......) { ...... }
	   public void setEndX(......) { ...... }
	   public void setEndY(......) { ...... }
	   public void setEndXY(......) { ...... }
	   
	   public int getLength() { ...... } // Length of the line
	                                     // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
	   public double getGradient() { ...... } // Gradient in radians
	                                          // Math.atan2(yDiff, xDiff)
	}
	public class TestLine {
	   public static void main(String[] args) {
	      Line l1 = new Line(0, 0, 3, 4);
	      System.out.println(l1);
	   
	      Point p1 = new Point(...);
	      Point p2 = new Point(...);
	      Line l2 = new Line(p1, p2);
	      System.out.println(l2);
	      ...
	   }
	}
 * 
 */
public class Point {

	private int x;
	private int y;

	/**
	 * Constructor that initializes x and y coordinates to the given values
	 * 
	 * @param x
	 * @param y
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/*
	 * @retrun "Point: (x, y)"
	 */
	@Override
	public String toString() {
		return "Point: (" + x + ", " + y + ")";
	}

	// Getters and setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
