package encapsulation;

import java.util.Scanner;

public class Employ {
	private int server_pin=2233;
 String name;
 int id;
 double salary;
 
 public void setName(String name) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the pin to  set name ");
	 int user_pin=sc.nextInt();
	 if(user_pin==server_pin) {
		System.out.println("Validation successful and name set");
		this.name=name;
	 }
	 else {
		 System.out.println("Invalid pin");
	 }
	 
 }
 public void getName() {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the pin to  get name ");
	 int user_pin=sc.nextInt();
	 if(user_pin==server_pin) {
		 System.out.println("Validation successful and name get");
		 System.out.println("Name of Employ is :"+name);
		 
	 }
	 else {
		 System.out.println("Invalid Pin for name get");
	 }
	 
 }
 public void setId(int id) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the pin to set id ");
	 int user_pin= sc.nextInt();
	 if(user_pin==server_pin) {
		 System.out.println("Validation is successful and id is set");
		 this.id=id;
	 }
	 else {
		 System.out.println("Invalid pin");
	 }
	 
 }
 public void getId() {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the pin to get id");
	 int user_pin= sc.nextInt();
	 if(user_pin==server_pin) {
		 System.out.println("Validation is successful and id is get");
		 System.out.println("Id of Employ is : "+id);
		 
		 
	 }
	 else {
		 System.out.println("Invalid pin for id");
	 }
	 
 }
 public void setSalary(double salary) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the pin to set salary");
	 int user_pin=sc.nextInt();
	 if(user_pin==server_pin) {
		 System.out.println("Validation is Successful and salary is set");
		 this.salary = salary;
		 
	 }
	 else {
		 System.out.println("Invalid pin");
	 }
 }
 public void getSalary() {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the pin to get Salary ");
	 int user_pin= sc.nextInt();
	 if(user_pin==server_pin) {
		 System.out.println("Validation is Successful and salary is get ");
		 System.out.println("Salary is :"+salary);
	 }
	 else {
		 System.out.println("invlid pin");
	 }
 }
}
