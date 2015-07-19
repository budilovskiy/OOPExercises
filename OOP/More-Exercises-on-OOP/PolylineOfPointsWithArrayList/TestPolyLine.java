package oop.excercises.polylineofpointswitharrayList;

public class TestPolyLine {

	public static void main(String[] args) {

		PolyLine polyline = new PolyLine();
		System.out.println(polyline);
		polyline.appendPoint(0, 0);
		polyline.appendPoint(5, 10);
		System.out.println(polyline);
		polyline.appendPoint(new Point(-5, 15));
		System.out.println(polyline);

	}

}
