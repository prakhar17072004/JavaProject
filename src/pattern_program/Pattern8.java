package pattern_program;

import java.util.Scanner;

public class Pattern8 {
 public static void pattern(int n) {
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=n;j++) {
			 System.out.print(i%2+" ");
		 }
		 System.out.println();
	 }
 }
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n= sc.nextInt();
	pattern(n);
}
}
