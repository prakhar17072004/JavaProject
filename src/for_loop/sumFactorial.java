package for_loop;
import java.util.Scanner;
public class sumFactorial {
  public static void sumFact(int n) {
	  int fact=1; int sum=0;
	  for(int i=1;i<=n;i++) {
		  fact= fact*i;
		 
		  sum= sum+fact;
		  System.out.println( fact+"+" +sum);
		  
	  }
	 
  }
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n= sc.nextInt();
	sumFact(n);
}
}
