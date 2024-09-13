package for_loop;
import java.util.Scanner;
public class TableOfNumber {
  public static void TableOfNumber(int n) {
	  for(int i=1;i<=10;i++) {
		  
		  
		 
		  System.out.println(i+"*"+n+ " table is "+i*n);
	  }
	  
	 
  }
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	TableOfNumber(n);
		
	
}
}
