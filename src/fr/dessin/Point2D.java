package fr.dessin;

public class Point2D {
	private int x, y;
	
	public Point2D() {}
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y =y;
	}
	
	public void display() {
		System.out.println("[ " + this.x + ", " + this.y + " ]");
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setX(int valX) {
		this.x = valX;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int valY) {
		this.y = valY;
	}
	
	public void translater(int dX, int dY) {
		System.out.println(this.x += dX);
		System.out.println(this.y += dY);
	}
}
