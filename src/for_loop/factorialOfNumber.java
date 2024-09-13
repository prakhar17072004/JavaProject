package for_loop;
import java.util.Scanner;
public class factorialOfNumber {
   public static void factorial(int n) {
	   int fact =1;
	   for(int i=1; i<=n;i++) {
		   
			   fact=fact*i;
			   System.out.println(i+"!="+fact);
		   
		   
	   }
   }
   public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number");
	int n= sc.nextInt();
	factorial(n);
}
}
