package Digit_Based_Program;
import java.util.Scanner;
public class Factorial {
  public static int getFactorial(int n) {
	 
	  while(n>0) {
		  int fact =1;
		  int digit = n%10;
		  int i=1;
		  while(i<=digit) {
			  fact=fact*i;
			  i++;
		  }
		  System.out.println(digit +" fact is : "+fact);
		  
		  n=n/10;
	  }
	  
	  return 1;
	  
  }
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the  digit ");
	int  n = sc.nextInt();
	getFactorial(n);
}
}
