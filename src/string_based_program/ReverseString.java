package string_based_program;
import java.util.Scanner;
public class ReverseString {
	public static String reverse(String n) {
		int i = n.length()-1;
		while(i>=0) {
			System.out.println(n.charAt(i));
			i--;
		}
		return n;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	
	String n= sc.nextLine();
	reverse(n);
}

}
