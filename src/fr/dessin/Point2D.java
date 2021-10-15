package fr.dessin;

public class Point2D {
	static int counter;
	private int x, y;
	
	public Point2D() {
		System.out.println("Number of point, you've created: " + getCounter() );
	}
	
	public Point2D(int vX, int vY) {
		this.x = vX;
		this.y = vY;
		System.out.println("Number of point, you've created: " + getCounter() );
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
		System.out.println(this.x += dX);
		System.out.println(this.y += dY);
	}
	
	public static int getCounter() {
		return (counter++)+1;
	}
}
