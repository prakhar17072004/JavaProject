package upcasting_downcasting;

public class VehicleDriver {
  public static void main(String[] args) {
//	  using downcasting we are able to access parent and child both and where using upcasting only we able to access only parent class and not able to 
//	  access speciel members of child class
	Vehicle v1= new Bike();
	Bike b1 =( Bike)v1;
	Vehicle v2= new Bus();
	Bus b2=(Bus)v2;
	Vehicle v3= new Car();
	Car c1=(Car)v3;
	Vehicle v4= new ElectricCar();
	ElectricCar e1=(ElectricCar)v4;
	
	System.out.println(b1.u);
	System.out.println(b1.w);
	System.out.println(b2.u);
	System.out.println(b2.w);
	System.out.println(c1.u);
	System.out.println(c1.w);
	System.out.println(v1.u);
	System.out.println(v1.w);
	System.out.println(b1.a);
	System.out.println(b1.b);
	System.out.println(b2.x);
	System.out.println(b2.y);
	System.out.println(c1.k);
	System.out.println(c1.t);
	System.out.println(e1.p);
	System.out.println(e1.q);


	
}
}
