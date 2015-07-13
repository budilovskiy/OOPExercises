package bouncingballs_ballandcontainerclasses;

public class Container {

	private float x1;
	private float x2;
	private float y1;
	private float y2;

	/**
	 * A constructor which accepts (x, y) of the top-left corner, width and
	 * height as argument, and converts them into the internal representation
	 * (i.e., x2=x1+width-1). Width and height is used in the argument for safer
	 * operation (there is no need to check the validity of x2>x1 etc.).
	 * 
	 * @param x coordinate of the top-left corner
	 * @param y coordinate of the top-left corner
	 * @param width of container
	 * @param height of container
	 */
	public Container(float x, float y, float width, float height) {
		x1 = x;
		y1 = y;
		x2 = x1 + width - 1;
		y2 = y1 + height - 1;
	}
	
	@Override
	public String toString() {
		return "Container at (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")";
	}
	
	/**
	 * A boolean method called collidesWith(Ball), which check if the given Ball 
	 * is outside the bounds of the container box. If so, it invokes the Ball's 
	 * reflectHorizontal() and/or reflectVertical() to change the movement 
	 * direction of the ball, and returns true.
	 * 
	 * @param ball
	 * @return if the given Ball is outside the bounds of the container box and
	 * invokes the Ball's  reflectHorizontal() and/or reflectVertical()
	 * methods;
	 */
	public boolean collidesWith(Ball ball) {
		boolean ret = false;
		if (ball.getX() <= x1) {
			ball.reflectHorizontal();
			ball.setX(x1);
			ret = true;
		}
		if (ball.getX() >= x2) {
			ball.reflectHorizontal();
			ball.setX(x2);
			ret = true;
		}
		if (ball.getY() <= y1) {
			ball.reflectVertical();
			ball.setY(y1);
			ret = true;
		}
		if (ball.getY() >= y2) {
			ball.reflectVertical();
			ball.setY(y2);
			ret = true;
		}
		return ret;
	}

}
