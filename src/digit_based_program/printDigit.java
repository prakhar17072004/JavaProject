package digit_based_program;

import java.util.Scanner;


public class printDigit {
    public static int  printDigit(int n) {
    
    	
    	while(n>0) {
    		int rem = n%10;
    		System.out.println("Sequence of digit is :" +rem);
    		n=n/10;
    	}
    	return 1;
    }
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = sc.nextInt();
		printDigit(n);
		
	}
}
