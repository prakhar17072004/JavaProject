package recursion_program;

public class Palindrom {
    static int rev=0; static int rem =0; 
    public static void palindrome(int n) {
    	
    	if(n>0) {
    		
        	rem = n%10;
        	rev = (rev*10)+rem;
        	n=n/10;
        	palindrome(n);
        	
    	}
    	
    		
    	
    	
    }
    public static void main(String[] args) {
		System.out.println("main starts ");
		int n=151;
		palindrome(n);
		System.out.println(rev);
		if(rev==n) {
			System.out.println("no. is plaindrome");
		}
		else {
			System.out.println("no. is not plaindrome");
		}
		
		System.out.println("main ends");
	}
    
}
