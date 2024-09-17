package pattern_program;

import java.util.Scanner;

public class ButterflyPattern {
  public static void pattern(int n) {
	  int mid =n/2+1;
	 int sst=1;
	 int est=n;
	  
	  for(int i=1;i<=n;i++) {
		 
			  for(int j=1;j<=n;j++) {
				  if(j<=sst||j>=est) {
					  System.out.print("* ");
				  }
				  else {
					  System.out.print("  ");
				  }
			  }

			  if(i<mid) {
				  sst++;
				  
				  est--;
			  }
			  else {
				  sst--;
				  est++;
				  
				  
			  }
			  
		  
		  System.out.println();
	  }
  }
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number ");
	int n= sc.nextInt();
	pattern(n);
}
}
