package for_loop;
import java.util.Scanner;
public class tableTillNumber {
  public static void table(int n) {
	  for(int i=1;i<=n;i++) {
		  for(int j=1;j<=10;j++) {
			  System.out.println(i+"*"+j+" table is "+i*j);
		  }
		  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	  }
  }
  public static void main(String[] args) {
	Scanner sc =new Scanner(System.in) ;
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	table(n);
		
	
}
}
