package pattern_program;

import java.util.Scanner;

public class Pyramid7 {
   public static void pyramid(int n) {
	   if(n%2==0) {
		   System.out.println("invalid input");
	   }
	   else {
		   int star=1;int space=n/2 ;int  mid=n/2+1;
		   for(int i=1;i<=n;i++) {
			   for(int j=1;j<=space;j++) {
				   System.out.print("  ");
			   }
			   for(int j=1;j<=star;j++) {
				   System.out.print("*   ");
				   
			   }
			   if(i<mid) {
				   star+=1;
				   space--;
				   
			   }
			   else {
				   star-=1;
				   space++;
			   }
			   System.out.println();
		   }
	   }
   }
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	pyramid(n);
}
  
   }
