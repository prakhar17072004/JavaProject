package inheritence;

public class Fruit {
  Fruit(){
	  System.out.println("friut constructor with no argument");
  }
  {
	  System.out.println("Non static block of fruit class");
  }
  static{
	  System.out.println("Static block of fruit class");
  }
Fruit(int x){
	System.out.println("Fruit constructor with argument " +x);
}
}
