package Digit_Based_Program;
import java.util.Scanner;
public class ReverseNumber {
 public static int reverseNumber(int n) {
	 int rev =0;
	 while(n>0) {
		 int rem = n%10;
		 rev = rev*10+rem;
		 n=n/10;
	 }
	 System.out.println("Reverse number is :" +rev);
	 return rev;
 }
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int n = sc.nextInt();
	reverseNumber(n);
 }
}
