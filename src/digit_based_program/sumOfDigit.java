package digit_based_program;
import java.util.Scanner;

public class sumOfDigit {
  public static int sumDigit(int n) {
	  int sum=0;
	  while(n>0) {
		  int  digit =n%10;
		  sum= sum+digit;
		  n=n/10;
	  }
	  System.out.println("Sum of digit is : "+sum);
	  return 1;
  }
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the digit ");
	  int n =sc.nextInt();
	  sumDigit(n);
	
}
}
