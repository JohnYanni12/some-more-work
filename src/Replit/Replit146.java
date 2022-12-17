package src.Replit;

public class Replit146 {


 String name;
String lastName;
int employeeId;
String startDate;
int salary;

 Replit146(){

 }

 public Replit146(String name, String lastName, int employeeId, String startDate, int salary) {
  this.name = name;
  this.lastName = lastName;
  this.employeeId = employeeId;
  this.startDate = startDate;
  this.salary = salary;
 }

 void printInfo(){
  System.out.println(name + " "+lastName + " "+employeeId + " "+startDate + " "+salary);

 }

 public static void main(String[] args) {
  Replit146 obj = new Replit146("Joe","Smith",12345,"01/01/1970",35000);
  obj.printInfo();
  Replit146 obj1 = new Replit146();
  obj1.printInfo();
 }
}
