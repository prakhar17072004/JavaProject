package Digit_Based_Program;
import java.util.Scanner;
public class StrongNumber {
 public static int strongNumber(int n) {
	int temp= n;
	 int sum = 0;
	 while(n>0) {
		 int  fact =1;
		 int i=1;
		 int digit =n%10;
		 while(i<=digit) {
			 fact =fact*i;
			 i++;
		 }
		 
		 sum= sum+fact;
		 n=n/10;
	 }
	 if(sum==temp) {
		 System.out.println(temp+" No. is strong no.");
	 }
	 else { 
		 System.out.println(temp+" no. is not  strong");
	 }
	 return 1;
 }
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int n = sc.nextInt();
	strongNumber(n);
}
}
