package alphabet_pattern;

import java.util.Scanner;

public class Dpattern {
  public static void pattern(int n) {
	  for(int i=1;i<=n;i++) {
		  for(int j=1;j<=n;j++) {
			  if(i==1&&j!=n||i==n&&j!=n||j==1||j==n&&i!=1&&i!=n) {
				  System.out.print("* ");
			  }
			  else {
				  System.out.print("  ");
			  }
				  
		  }
		  System.out.println();
	  }
  }
  public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	pattern(n);
}
}
