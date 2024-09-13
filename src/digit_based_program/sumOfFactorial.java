package digit_based_program;
import java.util.Scanner;

public class sumOfFactorial {
 public static int sumOfFact(int n) {
	 int sum =0;
	 while(n>0) {
		 int fact =1;
		 int i=1;
		 int digit = n%10;
		 while(i<=digit) {
			 fact= fact*i;
			 
			 i++;
		 }
		 sum = sum+fact;
		 
		 n=n/10;
	 }
	 System.out.println( " sum of fact is :"+sum);
	 return 1;
 }
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Digit");
	int  n = sc.nextInt();
	sumOfFact(n);
}
}
