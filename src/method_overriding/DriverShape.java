package method_overriding;

public class DriverShape {
   public static void main(String[] args) {
	Shape s1 = new Rectangle();
	Shape s2 = new Cricle();
	Shape s3 = new Triangle();
	s1.area();
	s2.area();
	s3.area();
	
}
}
