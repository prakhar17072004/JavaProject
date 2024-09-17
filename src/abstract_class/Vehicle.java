package abstract_class;

public abstract class Vehicle {
  String name;
  double price;
  Vehicle(){
	  System.out.println("no argumnent constructor");
  }
  Vehicle(String name,double price){
	  this.name=name;
	  this.price=price;
  }
  public abstract void start();
  public abstract void drive();
  public void stop() {
	  System.out.println("Vehicle stop");
  }
  public void accelearation() {
	  System.out.println("Vehicle Accelerate");
  }
  
  
}
