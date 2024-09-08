package Digit_Based_Program;

import java.util.Scanner;
public class biggestDigit {
	public static int biggestDigit(int n) {
		 int larg=0;
		 while(n>0) {
			 int digit= n%10;
		  if(digit>larg) {
			  larg= digit;
		  }
		  n=n/10;
		  
		 }
		 System.out.println("biggest is "+larg);
		 return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a= sc.nextInt();
		
		biggestDigit(a);
				
	}
	

}
