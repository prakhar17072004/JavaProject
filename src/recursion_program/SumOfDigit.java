package recursion_program;

public class SumOfDigit {
  static int sum =0;static int rem = 0;
  public static void sum(int n) {
	  if(n>0) {
		  rem=n%10;
		  sum  =sum+rem;
		  n=n/10;
		  sum(n);
	  }
  }
  public static void main(String[] args) {
	System.out.println("main starts ");
	sum(554);
	System.out.println(sum);
	System.out.println("main ends");
}
}
