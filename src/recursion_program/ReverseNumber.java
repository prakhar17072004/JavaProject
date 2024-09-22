package recursion_program;

public class ReverseNumber {
  public static void print(int n) {
	  if(n>0) {
		  System.out.println(n);
		  print(n-1);
	  }
	  else {
		  System.out.println("n from  else is : "+n);
	  }
  }
  public static void main(String[] args) {
	System.out.println("main method starts");
	print(100);
	System.out.println("main ends");
	
}
}
