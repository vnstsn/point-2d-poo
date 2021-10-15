package fr.dessin;

public class Point3D extends Point2D {
	private int z;
	
	public Point3D() {
		super();
	}
	
	public Point3D(int vX, int vY, int vZ) {
		super(vX, vY);
		this.z = vZ;
	}
	
	public void display() {
		System.out.println("[ " + this.getX() + ", " + this.getY() + ", " + this.z + " ]");
	}
	
	public int getZ() {
		return this.z;
	}
	
	public void setZ(int dZ) {
		this.z = dZ;
	}
	
	public void translater(int dX, int dY, int dZ) {
		this.translater(dX, dY); // instead of super. you can use this. because it inherits the method from Point2D
		this.z += dZ;
	}

	@Override
	public String toString() {
		return "Point3D [z=" + z + "]";
	}
	
}
