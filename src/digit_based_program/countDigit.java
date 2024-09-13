package digit_based_program;

import java.util.Scanner;
public class countDigit {
    public static int printDigit(int n) {
    	
       int	count=0; 
    	while(n>0) {
    		int  digit = n%10;
    		System.out.println("The digit is :"+digit);
    		count ++;
    		
    		n=n/10;
    	}
    	
    	
    	System.out.println("Total count is :"+count);
    	return 1;
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the no.");
		int n =sc.nextInt();
		printDigit(n);
		
	}
}
