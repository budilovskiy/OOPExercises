package oop.excercises.thepointandlineclasses;

/**
 * 
 * Instead of composition, we can design a Line class using inheritance.
 * Instead of "a line composes of two points", we can say that
 * "a line is a point extended by another point" Let's re-design the Line class
 * (called LineSub) as a subclass of class Point. LineSub inherits the starting
 * point from its superclass Point, and adds an ending point. Complete the class
 * definition. Write a testing class called TestLineSub to test LineSub. 
 * 
 * public class LineSub extends Point { 
 * // A line needs two points: begin and end. 
 * // The begin point is inherited from its superclass Point. 
 * // Private variables
 * Point end; // Ending point
 * 
 * // Constructors 
 * public LineSub (int beginX, int beginY, int endX, int endY) {
 * 	super(beginX, beginY); // construct the begin Point this.end = new
 * 	Point(endX, endY); // construct the end Point } public LineSub (Point begin,
 * 	Point end) { // caller to construct the Points super(begin.getX(),
 * 	begin.getY()); // need to reconstruct the begin Point this.end = end; }
 * 
 *  // Public methods 
 *  // Inherits methods getX() and getY() from superclass Point
 *  public String toString() { ... }
 * 
 *  public Point getBegin() { ... } 
 *  public Point getEnd() { ... } 
 *  public void setBegin(...) { ... } 
 *  public void setEnd(...) { ... }
 * 
 *  public int getBeginX() { ... } 
 *  public int getBeginY() { ... } 
 *  public int getEndX() { ... } 
 *  public int getEndY() { ... }
 * 
 *  public void setBeginX(...) { ... } 
 *  public void setBeginY(...) { ... } 
 *  public void setBeginXY(...) { ... } 
 *  public void setEndX(...) { ... } 
 *  public void setEndY(...) { ... } 
 * 	public void setEndXY(...) { ... }
 * 
 * 	public int getLength() { ... } // Length of the line public double
 * 	getGradient() { ... } // Gradient in radians 
 * } 
 * Summary: There are two
 * approaches that you can design a line, composition or inheritance.
 * "A line composes two points" or
 * "A line is a point extended with another point"”. Compare the Line and
 * LineSub designs: Line uses composition and LineSub uses inheritance. Which
 * design is better?
 * 
 */
public class LineSub extends Point {

	private Point end; // Ending point

	// Constructors
	public LineSub(int beginX, int beginY, int endX, int endY) {
		super(beginX, beginY); // construct the begin Point
		this.end = new Point(endX, endY); // construct the end Point
	}

	public LineSub(Point begin, Point end) { // caller to construct the Points
		super(begin.getX(), begin.getY()); // need to reconstruct the begin
											// Point
		this.end = end;
	}

	// Public methods
	// Inherits methods getX() and getY() from superclass Point

	@Override
	public String toString() {
		return "Line from " + super.toString() + " to " + end;
	}

	public Point getBegin() {
		return this;
	}

	public Point getEnd() {
		return end;
	}

	public void setBegin(Point begin) {
		super.setXY(begin.getX(), begin.getY());
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	public int getBeginX() {
		return super.getX();
	}

	public int getBeginY() {
		return super.getY();
	}

	public int getEndX() {
		return end.getX();
	}

	public int getEndY() {
		return end.getY();
	}

	public void setBeginX(int x) {
		super.setX(x);
	}

	public void setBeginY(int y) {
		super.setY(y);
	}

	public void setBeginXY(int x, int y) {
		super.setXY(x, y);
	}

	public void setEndX(int x) {
		end.setX(x);
	}

	public void setEndY(int y) {
		end.setY(y);
	}

	public void setEndXY(int x, int y) {
		end.setXY(x, y);
	}

	public double getLength() { // Length of the line
		int xDiff = end.getX() - super.getX();
		int yDiff = end.getY() - super.getY();
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}

	public double getGradient() { // Gradient in radians
		int xDiff = end.getX() - super.getX();
		int yDiff = end.getY() - super.getY();
		return Math.atan2(yDiff, xDiff);
	}

}
