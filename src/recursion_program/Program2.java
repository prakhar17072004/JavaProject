package recursion_program;

public class Program2 {
	static int x=0;
	public static void test() {
		x++;
		if(x<3) {
			System.out.println("x from if is : "+x);
			test();
		}
		else {
			System.out.println("x from else is : "+x);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("main method starts");
		test();
		System.out.println("main methods ends");
	}

}
