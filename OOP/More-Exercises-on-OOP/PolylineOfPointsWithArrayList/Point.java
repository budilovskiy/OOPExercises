/*
 * A polyline is a line with segments formed by points. Let's use the 
 * ArrayList (dynamically allocated array) to keep the points, but 
 * upcast to List in the instance variable. (Take note that array 
 * is of fixed-length, and you need to set the initial length).
 */
package oop.excercises.polylineofpointswitharrayList;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
