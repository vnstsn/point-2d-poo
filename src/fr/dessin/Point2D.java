package fr.dessin;

public class Point2D {
	private int x, y;
	private static int counter;
	
	public Point2D() {
		counter++;
	}
	
	public Point2D(int vX, int vY) {
		this(); // to call counter++
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
	
	public void translater(int dX, int dY) throws PointException {
		if(dX < 0) {
			throw new PointException("The point dX cant't be define under 0");
		}
		this.x += dX;
		this.y += dY;
	}
	
	public static int getCounter() {
		return counter;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}

	
}
