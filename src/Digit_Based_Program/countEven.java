package Digit_Based_Program;
 
import java.util.Scanner;
public class countEven {
     public static int countEven(int n) {
    	 
    	 int count=0;
    	 
    	 while(n>0) {
    		 int digit = n%10;
    		 if(digit%2==0) {
    			 System.out.println("Number is even :"+digit);
    			 count++;
    		 }
    		 else {
    			 System.out.println("Number is odd : " +digit);
    		 }
    		 n=n/10;
    		
    	 }
    	 System.out.println("total even count is :"+count);
    	 return 1;
    	 
     }
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		countEven(n);
	}
}
