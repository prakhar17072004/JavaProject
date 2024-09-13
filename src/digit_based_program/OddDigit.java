package digit_based_program;

import java.util.Scanner;

public class OddDigit {
	public static int oddDigit(int n) {
		
		while(n>0) {
			int  digit = n%10;
			if(digit%2!=0) {
				System.out.println("Digit is odd :"+digit );
			}
			else {
				System.out.println("Digit is even :"+digit);
			}
			n=n/10;
		}
		return 1;
	}
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int n = sc.nextInt();
	 oddDigit(n);
	 
 }
}
