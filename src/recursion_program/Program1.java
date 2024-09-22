package recursion_program;

public class Program1 {
  public static void test() {
	  System.out.println("This is test method");
	  test();
  }
  public static void main(String[] args) {
	System.out.println("main method stats");
	test();
	System.out.println("main method ends");
}
  
}
