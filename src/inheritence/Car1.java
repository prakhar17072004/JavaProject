package inheritence;

public class Car1 extends Vehicle1 {
  int hp;
  int stroks;
  
  Car1(){
	  System.out.println("without argument");
  }
  Car1(String name,int price,String color,int hp,int stroks){
	  //super(name,price,color);
	  super.name=name;
	  super.price=price;
	  super.color=color;
	  this.hp=hp;
	  this.stroks=stroks;
	 System.out.println(name);
	 System.out.println(price);
	 System.out.println(color);
	 System.out.println(hp);
	 System.out.println(stroks);
	
  }
  
}
