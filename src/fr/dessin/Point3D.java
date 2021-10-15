package fr.dessin;

import java.util.Objects;

public class Point3D extends Point2D {
	private int z;
	
	public Point3D() {
		super();
		super.getCounter();
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
		super.translater(dX, dY);
		int translateZ = this.z += dZ;
		System.out.println("Points after translater : [ " + super.getX() + ", " + super.getY() + ", " + translateZ + " ]");
	}

	@Override
	public String toString() {
		return "Point3D [z=" + z + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(z);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point3D other = (Point3D) obj;
		return z == other.z;
	}
	
	
}
