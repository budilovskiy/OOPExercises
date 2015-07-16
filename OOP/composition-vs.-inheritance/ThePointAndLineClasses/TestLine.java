package oop.excercises.thepointandlineclasses;

public class TestLine {

	public static void main(String[] args) {
		Line l1 = new Line(0, 0, 3, 4);
	      System.out.println(l1);
	   
	      Point p1 = new Point(10, 20);
	      Point p2 = new Point(-10, -80);
	      Line l2 = new Line(p1, p2);
	      System.out.println(l2);
	      
	      System.out.println(l2 + ", length=" + l2.getLength() + ", gradient=" + l2.getGradient());

	      LineSub l3 = new LineSub(p1, p2);
	      System.out.println(l3);
	      LineSub l4 = new LineSub(8, 9, 10, 11);
	      System.out.println(l4);
	      
	      System.out.println(l3 + ", length=" + l3.getLength() + ", gradient=" + l3.getGradient());
	      System.out.println(l4 + ", length=" + l4.getLength() + ", gradient=" + l4.getGradient());

	}
}
