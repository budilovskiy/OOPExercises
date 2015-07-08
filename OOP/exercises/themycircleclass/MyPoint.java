package oop.excercises.themycircleclass;

public class MyPoint {

	private int x, y;

	/**
	 * A "no-argument" (or "no-arg") constructor that construct a point at (0,
	 * 0).
	 */
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * A constructor that constructs a point with the given x and y coordinates.
	 * 
	 * @param x
	 * @param y
	 */
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/*
	 * Getters and setters
	 */
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	/**
	 * A method setXY() to set both x and y
	 * 
	 * @param x
	 * @param y
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	/**
	 * A method called distance(int x, int y) that returns the distance from
	 * this point to another point at the given (x, y) coordinates.
	 * 
	 * @param x
	 * @param y
	 * @return the distance from this point to another point at the given (x, y)
	 *         coordinates
	 */
	public double distance(int x, int y) {
		int dx = x - this.x;
		int dy = y - this.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	/**
	 * An overloaded distance(MyPoint another) that returns the distance from
	 * this point to the given MyPoint instance another.
	 * 
	 * @param another
	 * @return the distance from this point to the given MyPoint instance
	 *         another
	 */
	public double distance(MyPoint another) {
		int dx = another.getX() - this.x;
		int dy = another.getY() - this.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
}
