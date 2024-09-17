package aggregation;

public class Driver {
  public static void main(String[] args) {
	Address a1 = new Address("Ayodhya","UP",224001);
	Student s1 = new Student("Prakhar",12,a1);
	System.out.println(s1.name);
	System.out.println(s1.rollno);
	System.out.println(s1.a.city);
	System.out.println(s1.a.pin);
	System.out.println(s1.a.state);
	s1=null;
	System.out.println(a1.city);
}
}
