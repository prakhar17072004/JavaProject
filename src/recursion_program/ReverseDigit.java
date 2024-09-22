package recursion_program;

public class ReverseDigit {
	static int rem =0; static int rev = 0;
	public static void reverse(int n) {
		if(n>0) {
			rem = n%10;
			rev = rev*10+rem;
			n=n/10;
			reverse(n);
		}
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		reverse(455);
		System.out.println(rev);
		System.out.println("main ends");
	}

}
