package digit_based_program;
import java.util.Scanner;
public class PlaindromeNumber {
 public static int plaindromeNumber(int  n) {
	 int rev =0;
	 int temp=n;
	 while(n>0) {
		 int rem=n%10;
		 rev =rev *10+rem;
		 n=n/10;
		 
	 }
	 if(temp==rev) {
		 System.out.println("no. is palaindrome "+ rev);
	 }
	 else {
		 System.out.println("no. is not palindrome "+ rev);
	 }
	 return rev;
 }
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int n = sc.nextInt();
	plaindromeNumber(n);
}
}
