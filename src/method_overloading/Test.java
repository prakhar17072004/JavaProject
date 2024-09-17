package method_overloading;

public class Test {
  public static void start() {
	  System.out.println("start with no argument");
  }
  public static void start(int x) {
	  int sqr = x*x;
	  System.out.println("start with int arguments  "+sqr);
  }
  public static void start(int x ,int y) {
	  
	  int sum =x+y;
	  System.out.println("start with int int arguments  " +sum);
  }
  public static void start(double x) {
	  System.out.println("start with double arguments " +x);
  }
}
