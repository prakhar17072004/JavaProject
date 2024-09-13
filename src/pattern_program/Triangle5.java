package pattern_program;

import java.util.Scanner;

public class Triangle5 {
 public static void triangle(int n ) {
	 int star =1;
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=star;j++) {
			 System.out.print(j+" ");
		 }
		 star++;
		 System.out.println();
	 }
	 
 }
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	triangle(n);
}
}
