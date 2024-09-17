package composition;

public class Driver {
  public static void main(String[] args) {
	Car c1 = new Car("Tata");
	System.out.println("Car object ref"+c1);
	System.out.println("Car engine obj ref"+c1.e);
	System.out.println("car name is "+c1.name);
	System.out.println("car engine hp"+c1.e.hp);
	c1.e.start();
	//c1=null;
	
	System.out.println("======================================");
	Car c4=new Car("Creata" ,new Engine(300));
	System.out.println("Car object ref"+c4);
	System.out.println("Car engine obj ref"+c4.e);
	System.out.println("car name is "+c4.name);
	System.out.println("car engine hp"+c4.e.hp);
	c4.e.start();
}
}
