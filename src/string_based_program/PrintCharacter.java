package string_based_program;
import java.util.Scanner;

public class PrintCharacter {
 public static String printCharacter(String n) {
	 int i=0;
	 while(i<n.length()) {
		 System.out.println(n.charAt(i));
		 i++;
	 }
	 return n;
 }
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String n= sc.nextLine();
	printCharacter(n);
}
}
