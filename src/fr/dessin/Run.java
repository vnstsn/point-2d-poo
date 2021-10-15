package fr.dessin;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D pointsTest = new Point2D(5, 9);
		pointsTest.display();
		
		pointsTest.translater(3, 9);
		
		Point2D pointsTest2 = new Point2D(6, 10);
		pointsTest2.display();
		
		Point2D pointsTest3 = new Point2D(7, 22);
		pointsTest3.display();
		
		Point3D point3DTest = new Point3D(3, 9, 12);
		point3DTest.display();
		point3DTest.translater(1, 42, 79);
		System.out.println("Points x, y, z after translater :");
		point3DTest.display();
		
		System.out.println("Number of points, you've created: " + Point2D.getCounter());
	}

}
