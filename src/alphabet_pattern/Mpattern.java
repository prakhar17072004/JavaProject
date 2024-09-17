package alphabet_pattern;

import java.util.Scanner;

public class Mpattern {
  public static void pattern(int n) {
	  int mid=n/2+1;
	  for(int i=1;i<=n;i++) {
		  for(int j=1;j<=n;j++) {
			  if(j==1||j==n||j<mid&&j==i||j>mid&&j+i==n+1) {
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
	int n =sc.nextInt();
	pattern(n);
}
}
