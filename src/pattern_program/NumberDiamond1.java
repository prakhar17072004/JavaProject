package pattern_program;

import java.util.Scanner;

public class NumberDiamond1 {
  public static void pattern(int n) {
	  int num=1;int space=n/2;
	  int x =1;
	  int mid =n/2+1;
	  for(int i=1;i<=n;i++) {
		  for(int j=1;j<=space ;j++) {
			  System.out.print("   ");
		  }
		  for(int j=1;j<=num;j++) {
			  System.out.print(x +"  ");
		  }
		  if(i<mid) {
			  num+=2;
			  space--;
		  }
		  else {
			  num-=2;
			  space++;
		  }
		  x++;
		  System.out.println();
	  }
  }
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	pattern(n);
}
}
