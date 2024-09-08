package Digit_Based_Program;
import java.util.Scanner;
public class differenceBiggestandSmallest {
    public static int difference(int n) {
    	int small= 9;
    	int larg =0;
    	while(n>0) {
    		int digit = n%10;
    		if(digit>larg) {
    			larg= digit;
    		}
    		if(digit<small) {
    			small=digit;
    		}
    		n=n/10;
    	}
    	int diff= larg-small;
    	System.out.println("The difference is "+diff);
    	 return 1;
    }
    public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the digit");
		int n = sc.nextInt();
		difference(n);
    }
   
    
}
