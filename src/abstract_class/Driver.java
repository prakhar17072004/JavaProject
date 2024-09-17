package abstract_class;

public class Driver {
 public static void main(String[] args) {
	Vehicle v1 = new ElectricCar("Tesla",230000,120,230);
	v1.start();
	v1.drive();
	v1.stop();
	v1.accelearation();
	
	//do downcasting//
	Car c1 = (Car)v1;
	c1.openGate();
	c1.playMusic();
}
}
