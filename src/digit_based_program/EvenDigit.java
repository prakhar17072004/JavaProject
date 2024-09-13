package digit_based_program;

import java.util.Scanner;
public class EvenDigit {
 public static int getEven(int n) {
	 
	 while(n>0) {
		 int digit = n%10;
		 if (digit%2==0) {
		 System.out.println("The no. is even"+digit);
		 }
		 else {
			 System.out.println("The no. odd "+digit);
		 }
		 n=n/10;
		 
	 }
	 return 1;
	 
	 
	 
 }
 
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Number");
	 int n = sc.nextInt();
	 getEven(n);
	 }
}
