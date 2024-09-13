package for_loop;
import java.util.Scanner;
public class perfectNumber {
  public static void perfectNumber(int n) {
	  int sum = 0;
	  for(int i=1;i<=n/2;i++) {
		  if(n%i==0) {
			  sum= sum+i;
		  }
		  
	  }
	  if(sum==n) {
		  System.out.println("Number is perfect");
	  }
	  else {
		  System.out.println("Nubber is not perfect");
	  }
  }
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ;
	System.out.println("Enter the number");
	int n= sc.nextInt();
	perfectNumber(n);
		
	
}
}
