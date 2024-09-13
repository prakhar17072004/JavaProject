package string_based_program;
import java.util.Scanner;
public class reverseString {
  public static String reverseString(String n) {
	  String rev = " ";
	  int i = n.length()-1;
	  while(i>=0) {
		  rev= rev+ n.charAt(i);
		  i--;
	  }
	  System.out.println("Reveerse string is :" +rev);
	  return n;
  }
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String ");
	String n = sc.nextLine();
	reverseString(n);
}
}
