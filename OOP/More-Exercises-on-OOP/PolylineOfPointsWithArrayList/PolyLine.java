package oop.excercises.polylineofpointswitharrayList;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
	
	private List<Point> points;
	
	public PolyLine() {
		points = new ArrayList<Point>();
	}
	
	public PolyLine(List<Point> points) {
		this.points = points;
	}
	
	// Append a point at (x, y) to the end of this polyline
	public void appendPoint(int x, int y) {
		points.add(new Point(x, y));
	}
	
	// Append a point instance to the end of this polyline
	public void appendPoint(Point point) {
		points.add(point);
	}
	
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder("PolyLine: ");
		for (int i = 0; i < points.size(); i++) {
			res.append(points.get(i));
			if (i != points.size()-1) {
				res.append("; ");
			}
		}
		return res.toString();
	}

}
