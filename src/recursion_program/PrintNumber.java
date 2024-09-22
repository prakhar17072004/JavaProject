package recursion_program;

public class PrintNumber {
  public static void printNumber(int n) {
	  if(n<=100) {
		  System.out.println(n);
		  printNumber(n+1);
	  }
	  else {
		  System.out.println("number from else is : "+n);
	  }
  }
  public static void main(String[] args) {
   System.out.println("main method starts");
   printNumber(1);
   System.out.println("main ends");
  }
}
