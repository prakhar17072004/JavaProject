package recursion_program;

public class Program5 {
	public static void test(int n) {
		if(n<3) {
			System.out.println("n form if is : "+n);
			test(n+1);
			
		}
		else {
			System.out.println("n from else is : "+n);
		}
	}
	public static void main(String[] args) {
		System.out.println("main method starts");
		test(1);
		System.out.println("main method ends");
	}

}
