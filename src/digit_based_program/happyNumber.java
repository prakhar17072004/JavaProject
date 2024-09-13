package digit_based_program;
import java.util.Scanner;
public class happyNumber {
  public static int happyNumber(int n) {
	  int sum =0;
	  while(n>0) {
		  int rem = n%10;
		  sum =sum +(rem*rem);
		  n=n/10;
	  }
	  return sum;
  }
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	int n = sc.nextInt();
	int result= n;
	while(result!=1&& result!=4) {
		result = happyNumber(result);
	}
	if(result==1) {
		System.out.println("Number is Happy : "+n);
	}
	else {
		System.out.println("Number is not Happy : "+n);
	}
}
}
