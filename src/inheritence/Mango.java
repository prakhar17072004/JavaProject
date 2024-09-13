package inheritence;

public class Mango extends Fruit{
	
	static {
		System.out.println("static block of mango");
	}
	
  Mango(){
	 
	  System.out.println("Mango consturctor no arguments");
  }
  Mango(String name){
	  super(23);
	  System.out.println("Mango constructor with arguments " +name);
  }
  {
	  System.out.println("Non static block of mango");
  }
}
