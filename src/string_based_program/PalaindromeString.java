package string_based_program;
import java.util.Scanner;

public class PalaindromeString {
 public static String PalindromeString(String n) {
	 String rev = " ";
	 int i = 0;
	 while(i<n.length()) {
		 rev= n.charAt(i)+rev;
		 i++;
	 }
	 if(rev.equalsIgnoreCase(n)) {
		 System.out.println("String is Palindrome ");;
	 }
	 else {
		 System.out.println("String is not plaindrome");
	 }
	 return n;
 }
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String n = sc.nextLine();
	PalindromeString(n);
}
}
