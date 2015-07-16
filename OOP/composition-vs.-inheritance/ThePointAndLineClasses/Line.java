package oop.excercises.thepointandlineclasses;

public class Line {

	private Point begin;
	private Point end;
  
  	/**
  	 * A constructor that initializes the begin and end points to the given values. 
  	 * 
  	 * @param begin
  	 * @param end
  	 */
	public Line(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
	}
  
  	/**
  	 * A constructor that initializes the begin and end points to the given co-ordinates
  	 * beginX, beginY, endX, endY.  
  	 * 
	 * @param beginX
	 * @param beginY
  	 * @param endX
  	 * @param endY
  	 */
	public Line(int beginX, int beginY, int endX, int endY) {
		begin = new Point(beginX, beginY);
		end = new Point(endX, endY);
	}
  
  	/*
  	 * @return "Line from Point: (x1, y1) to Point: (x2, y2)";
  	 */
  	@Override
	public String toString() {
		return "Line from " + begin + " to " + end;
	}
   
   	// Getters and setters of begin and end points
	public Point getBegin() {
		return begin;
	}
	
	public Point getEnd() {
		return end;
	}
	
	public void setBegin(Point begin) {
		this.begin = begin;
	}
	
	public void setEnd(Point end) {
		this.end = end;
	}
	
	// Getters and setters of co-ordinates of begin and end points
	public int getBeginX() {
		return begin.getX();
	}
	
	public int getBeginY() {
		return begin.getY();
	}
	
	public int getEndX() {
		return end.getX();
	}
	
	public int getEndY() {
		return end.getY();
	}
	   
	public void setBeginX(int x) {
		begin.setX(x);
	}
	
	public void setBeginY(int y) {
		begin.setY(y);
	}
	
	public void setBeginXY(int x, int y) {
		begin.setXY(x, y);
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
	
	/**
	 * Calculate length of the line
	 * length = Math.sqrt((x2-x1)^2 + (y2-y1)^2)
	 * 
	 * @return length of the line
	 */
	public double getLength() {
		int xDiff = end.getX() - begin.getX();
		int yDiff = end.getY() - begin.getY();
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
	}
	
	/**
	 * Calculate gradient in radians
	 * gradient = Math.atan2(y2-y1, x2-x1)
	 * 
	 * @return length of the line
	 */
	public double getGradient() {
		int xDiff = end.getX() - begin.getX();
		int yDiff = end.getY() - begin.getY();
		return Math.atan2(yDiff, xDiff);
	}

}
