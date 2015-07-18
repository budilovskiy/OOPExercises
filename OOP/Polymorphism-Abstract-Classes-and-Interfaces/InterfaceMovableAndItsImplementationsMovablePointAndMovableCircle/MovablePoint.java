/*
 * For the MovablePoint class, declare the instance variable x, y, xSpeed 
 * and ySpeed with package access as shown with '~' in the class diagram 
 * (i.e., classes in the same package can access these variables directly).
 */
package oop.excercises.interfacemovableanditsimplementationsmovablepointandmovablecircle;

public class MovablePoint implements Movable {
	// instance variables with package access
	int x, y, xSpeed, ySpeed;
	
	// Constructor
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public String toString() {
		return "MovablePoint (" + x + "," + y + "), xSpeed=" + xSpeed
				+ ", ySpeed=" + ySpeed;
	}

	// Implement abstract methods declared in the interface Movable
	@Override
	public void moveUp() {
		y -= ySpeed;	// y-axis pointing down for 2D graphics
	}

	@Override
	public void moveDown() {
		y += ySpeed;	// y-axis pointing down for 2D graphics
	}

	@Override
	public void moveLeft() {
		x -= xSpeed;	// x-axis pointing right for 2D graphics
	}

	@Override
	public void moveRight() {
		x += xSpeed;	// x-axis pointing right for 2D graphics
	}

}
