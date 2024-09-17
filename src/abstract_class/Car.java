package abstract_class;

public abstract class Car extends Vehicle {
  int hp;
  Car(){
	  System.out.println("no argiumrnt of car");
  }
  
  Car(String name,double price,int hp){
	  super(name,price);
	  this.hp=hp;
	  
  }
  public void openGate() {
	  System.out.println("opent the gate of car");
  }
  public void playMusic() {
	  System.out.println("play music  in car");
  }
}
