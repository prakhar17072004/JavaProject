package recursion_program;

public class CountDigit {
	static int count =0;
	public static void count(int n) {
		if(n>0) {
			count++;
			n=n/10;
			
			count(n);
			
		}
		
	}
	public static void main(String[] args) {
		System.out.println("main starts ");
		count(451);
		System.out.println(count);
		System.out.println("main ends");
		
	}

}
