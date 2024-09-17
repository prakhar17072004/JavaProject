package aggregation;

public class Student {
  String name;
  int rollno;
  Address a;
  Student(){
	  System.out.println("no argument of student");
	  
  }
  Student(String name,int rollno,Address a){
	  this.name=name;
	  this.rollno=rollno;
	  this.a=a;
  }
}
