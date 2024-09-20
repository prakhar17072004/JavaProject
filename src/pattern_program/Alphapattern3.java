package pattern_program;

import java.util.Scanner;

public class Alphapattern3 {
  public static void alphapattern(int n) {
	int alpha =1;int space=n/2;
	int mid=n/2+1;
	char x ='A';
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=alpha;j++) {
			System.out.print(x +" ");
		}
		if(i<mid) {
			alpha+=2;
			space--;
		}
		else {
			alpha-=2;
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
	alphapattern(n);
  }
}
