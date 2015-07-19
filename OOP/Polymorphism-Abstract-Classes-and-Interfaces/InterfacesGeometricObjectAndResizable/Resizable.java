/*
 * The class ResizableCircle is defined as a subclass of the class 
 * Circle, which also implements an interface called Resizable, as 
 * shown in class diagram. The interface Resizable declares an 
 * abstract method resize(), which modifies the dimension (such as 
 * radius) by the given percentage. Write the interface Resizable 
 * and the class ResizableCircle.
 */
package oop.excercises.interfacesgeometricobjectandresizable;

public interface Resizable {
	
	public void resize(int percent);

}
