package fr.dessin;

public class Point2D {
	static int counter;
	private int x, y;
	
	public Point2D() {
		System.out.println("Number of points, you've created: " + getCounter());
	}
	
	public Point2D(int vX, int vY) {
		System.out.println("Number of points, you've created: " + getCounter());
		this.x = vX;
		this.y = vY;
		
	}
	
	public void display() {
		System.out.println("[ " + this.x + ", " + this.y + " ]");
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int valX) {
		this.x = valX;
	}
	
	public void setY(int valY) {
		this.y = valY;
	}
	
	public void translater(int dX, int dY) {
		int translateX = this.x += dX;
		int translateY = this.y += dY;
		System.out.println("Points after translater : [ " + translateX + ", " + translateY + " ]");
	}
	
	public static int getCounter() {
		return (counter++)+1;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

	
}
