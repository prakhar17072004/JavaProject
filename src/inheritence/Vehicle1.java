package inheritence;

public class Vehicle1 {
  String name;
  int price;
  String color;
  Vehicle1(){
	  System.out.println("without argument vechel");
  }
  Vehicle1(String name ,int price,String color){
	  this.name= name;
	  this.price=price;
	  this.color=color;
  }
}
