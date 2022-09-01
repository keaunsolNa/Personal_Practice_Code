package objectOrientedProgramming;

public class Point {
	private double x, y;
	public static final Point ORIGIN = new Point();
	
	private Point() {
		
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void add(double u, double v) { }
	public void add(Point p) { }
	public double amplitude() { return 0.0;	}
	public static double distance(Point p, Point q) { return 0.0; }
	public boolean equals(Object object) { return false; }
	public void expand(double c) { }
	public double x() { return 0.0; }
	public double y() { return 0.0; }
	public double modulus() { return 0.0; }
	public void moveTo(double x, double y) { }
	public void moveTo(Point p) { }
	public void rotate(double t) { }
	
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
