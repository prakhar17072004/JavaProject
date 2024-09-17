package pattern_program;

import java.util.Scanner;

public class Vpattern {
  public static void pattern(int n) {
  int sst=1; int est=2*n-1;
	  
	  
	  for(int i=1;i<=n;i++) {
		 
		  for(int j=1;j<=est;j++) {
			  if(j==sst||j==est) {
				  System.out.print("* ");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
		  est--;;
		  sst++;
		  System.out.println();
	  }
  }
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	pattern(n);
}
}
