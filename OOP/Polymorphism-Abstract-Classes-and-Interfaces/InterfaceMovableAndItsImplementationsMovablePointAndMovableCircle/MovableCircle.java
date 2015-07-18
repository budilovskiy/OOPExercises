/*
 * For the MovableCircle class, use a MovablePoint to represent its 
 * center (which contains four variable x, y, xSpeed and ySpeed). 
 * In other words, the MovableCircle composes a MovablePoint, and its radius.
 */
package oop.excercises.interfacemovableanditsimplementationsmovablepointandmovablecircle;

public class MovableCircle implements Movable {
	//instance variables with private access
	private MovablePoint center;
	private int radius;
	
	// Constructors
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	
	public MovableCircle(MovablePoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "MovableCircle with radius=" + radius + " and center at " + center;
	}

	@Override
	public void moveUp() {
//		center.y -= center.ySpeed;	// variables x and y of MovablePoint have package access, so we can write like this
		center.moveUp();			// or like this
	}

	@Override
	public void moveDown() {
//		center.y += center.ySpeed;	
		center.moveDown();
	}

	@Override
	public void moveLeft() {
//		center.x -= center.xSpeed;	
		center.moveLeft();
	}

	@Override
	public void moveRight() {
//		center.x += center.xSpeed;	
		center.moveRight();
	}

}
