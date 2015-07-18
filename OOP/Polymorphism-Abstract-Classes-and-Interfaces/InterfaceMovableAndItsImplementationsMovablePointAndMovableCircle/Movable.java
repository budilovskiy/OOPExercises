/**
 * Suppose that we have a set of objects with some common behaviors: they 
 * could move up, down, left or right. The exact behaviors (such as how to
 * move and how far to move) depend on the objects themselves. One common 
 * way to model these common behaviors is to define an interface called 
 * Movable, with abstract methods moveUp(), moveDown(), moveLeft() and 
 * moveRight(). The classes that implement the Movable interface will provide 
 * actual implementation to these abstract methods.
 * 
 * Let's write two concrete classes - MovablePoint and MovableCircle - that 
 * implement the Movable interface.
 */
package oop.excercises.interfacemovableanditsimplementationsmovablepointandmovablecircle;

public interface Movable {
	
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();

}
