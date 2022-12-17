package src.Replit;

public class Replit143 {


    /*
     1. Complete the Car.java class:

Create the following variable (**Choose proper datatype**)
* make
* model
* numberOfDoors
* topSpeed
* price
following the proper naming convention for variables.
Write four constructors:
* The first constructor(with all parameters)
* A secondary constructor Have all parameters **except numberOfDoors. (**numberOfDoors value should assign to 4 inside constructor)
* A third constructor Have all parameters **except make and model .** **(**make and model value should assign to "unknown" inside constructor)
* A fourth constructor Have all parameters **except topSpeed and price**;**(**topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)
Create a display method in Cars class to print the class variable value in console.
2. Test your code with the Main.java class:
Create several Car objects using all Constructors.
then call display method with each object.
     */
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;
    public Replit143(  String make, String model, int numberOfDoors,int topSpeed, double price ) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    Replit143 (String make, String model, int topSpeed, double price) {
       // this(make ,  model,  topSpeed , price);
        this.make = make;
        this.model = model;
        numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    Replit143( int numberOfDoors,int topSpeed, double price) {
        make = "unknown";
        model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    Replit143(String make, String model, int numberOfDoors) {
      //  this(make ,  model,  topSpeed);
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        topSpeed = 90;
        price = 0;
    }
    void Car4() {
        System.out.println(make +" "+ model +" "+ numberOfDoors +" "+topSpeed +" "+ price);
    }
    public static void main(String[] args) {
        Replit143 obj = new Replit143("Toyota", "Prius", 4,120,30000);
        obj.Car4();
        Replit143 obj2 = new Replit143("Toyota", "Prius",120,30000);
        obj2.Car4();
        Replit143 obj3 = new Replit143(4,120,30000);
        obj3.Car4();
        Replit143 obj4 = new Replit143("Toyota", "Prius", 4);
        obj4.Car4();
    }
}







