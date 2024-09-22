package recursion_program;

public class TableOfNumber {
  public static void table(int n ,int i) {
	  if(i<=10) {
		System.out.println(i+"*"+n+" = "+n*i);
		  
		  table(n,i+1);
	  }
		
		  
 
	   
	  
  }
  public static void main(String[] args) {
	 System.out.println("main method stats");
	 table(2,1);
	 System.out.println("main ends");
}
}
