package composition;

public class Car {
  String name;
  Engine e = new Engine(180);
  Car(){
	  System.out.println("no argument cosntructor in car");
  }
  Car(String name){
	  this.name=name;
  }
  Car(String name ,Engine e){
	  this.name=name;
	  this.e=e;
  }
}
