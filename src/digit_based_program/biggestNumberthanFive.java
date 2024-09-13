package digit_based_program;
import java.util.Scanner;

public class biggestNumberthanFive {
  public static int getGreater(int n) {
   
   while(n>0) {
	   int digit =n%10;
	   if(digit>5) {
		   System.out.println("the number is "+ digit);
	   }
	   else {
		   System.out.println("the number is not  greater");
	   }
	   n=n/10;
   }
   return 1;
  }
  
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	 int  n = sc.nextInt();
	 
	 getGreater(n);
}
  
}
