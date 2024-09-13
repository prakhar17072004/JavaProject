package inheritence;

public class Employ extends Jspider {
  Employ(){
	  super("prakhar");
	  System.out.println("Employ with no arguments");
  }
  Employ(int x){
	  super();
	  System.out.println("Employ with arguments "+x);
  }
}
