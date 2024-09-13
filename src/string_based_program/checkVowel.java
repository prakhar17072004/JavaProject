package string_based_program;
import java.util.Scanner;
public class checkVowel {
  public static void vowel(String n) {
	  int i=0;  int count=0;
	  
	  while(i<n.length()) {
		  char ch = n.charAt(i);
		  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	  {
		  count++;
		 
		  
	   }
	  i++;
	  
	 }
	  
	  System.out.println("no.of count is : "+count);
	  
	 
  }
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String n= sc.nextLine().toLowerCase();
	vowel(n);
}
}
