package aggregation;

public class Address {
   String city;
   String state;
   int pin;
   Address(){
	   System.out.println("no argument of address");
   }
   Address(String city, String state,int pin){
	   this.city=city;
	   this.state=state;
	   this.pin=pin;
   }
}
