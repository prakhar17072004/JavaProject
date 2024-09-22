package recursion_program;

public class SumOfNumber {
  static	int sum =0;
  public static int sum(int n) {
	  if(n<=100) {
		  int sqr= n*n;
		  sum =sum+sqr;
		  
		  sum(n+1);
		  
		  
		  
	  }
	  return sum;
	  
	  
  }
  public static void main(String[] args) {
	System.out.println("main starts");
	sum(1);
   System.out.println(sum);
    
	System.out.println("main ends");
}
}
