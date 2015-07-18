/*
 * Write a new class called MovableRectangle, which composes two 
 * MovablePoints (representing the top-left and bottom-right 
 * corners) and implementing the Movable Interface. Make sure that 
 * the two points has the same speed.
 */
package oop.excercises.interfacemovableanditsimplementationsmovablepointandmovablecircle;

public class MovableRectangle implements Movable {

	private MovablePoint topLeft;
	private MovablePoint bottomRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed,
			int ySpeed) {
		topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	@Override
	public String toString() {
		return "MovableRectangle with top-left corner at " + topLeft
				+ " and bottom-right corner at " + bottomRight;
	}

	@Override
	public void moveUp() {
		topLeft.moveUp();
		bottomRight.moveUp();
	}

	@Override
	public void moveDown() {
		topLeft.moveDown();
		bottomRight.moveDown();
	}

	@Override
	public void moveLeft() {
		topLeft.moveLeft();
		bottomRight.moveLeft();
	}

	@Override
	public void moveRight() {
		topLeft.moveRight();
		bottomRight.moveRight();
	}

}
