package digit_based_program;
import java.util.Scanner;

public class productOfAllDigit {
	public static int productDigit(int n) {
		int mul=1;
		while(n>0) {
			int digit = n%10;
			mul= mul*digit;
			n=n/10;
			
			
		}
		if(mul%2==0) {
			System.out.println("product is even");
		}
		else {
			System.out.println("product is odd");
		}
		return 1;
	}
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no.");
	int n = sc.nextInt();
	productDigit(n);
}
}
