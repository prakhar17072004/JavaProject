package pattern_program;

import java.util.Scanner;

public class Pattern14 {
 public static void pattern(int n) {
	 if(n%2==0) {
		 System.out.println("invalid input");
	 }
	 else {
		 int mid=n/2 +1;
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n;j++) {
				 if(i==mid||j==mid) {
					 System.out.print("* ");
				 }
				 else {
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		 }
	 }
 }
 public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	pattern(n);
}
}
