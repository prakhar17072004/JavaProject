package abstract_class;

public  class ElectricCar  extends Car{
   int volt;
   ElectricCar(){
	   System.out.println("no argument constructor");
   }
   ElectricCar(String name,double price ,int hp,int volt){
	   super(name,price,hp);
	   this.volt=volt;
   }
   public void start() {
	   System.out.println("Start the car");
   }
   public void drive() {
	   System.out.println("drive the car");
   }
}
