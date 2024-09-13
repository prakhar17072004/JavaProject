package digit_based_program;
import java.util.Scanner;
public class AramStrongNumber {
  public static int armstrongNumber(int n) {
	  int temp=n;
	  int sum =0;
	  while(n>0) {
		  int  rem= n%10;
		  sum = sum+(rem*rem*rem);
		  n=n/10;
	  }
	  if(temp==sum) {
		  System.out.println("Number is armStrong " );
	  }
	  else {
		  System.out.println("Number is not armStrong " );
	  }
	  
	  return 1;
  }
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int n = sc.nextInt();
	armstrongNumber(n);
}
}
