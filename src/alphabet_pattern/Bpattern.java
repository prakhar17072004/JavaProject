package alphabet_pattern;

import java.util.Scanner;

public class Bpattern {
 public static void pattern(int n) {
	 int mid= n/2+1;
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=n;j++) {
			 if(i==1||i==mid&&j!=n||i==n||j==1||(j==n&&i!=mid)) {
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
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n =sc.nextInt();
	pattern(n);
}
}
