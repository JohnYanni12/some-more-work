package src.Replit;

public class Replit148 {
    /*
    Create variables as below. - item, - price,  - quantity
Create a constructor to initialize instance variables.
Create a method with name itemTotalPrice.
write a logic to calculate the total values of items in stock. and print the result.
return the total value.
**In Main Class.**
Create two Object of ShoppingStore and pass the parameters to Constructor.
then using each object call the method itemTotalPrice.
Store the returned value of each object.
Calculate sum of both object and print the result.
Output:
Blanket Total Value 99.98
Mattress Total Value 439.18
You purchased 539.16 Today
Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,  This Keyword,
Method Creation, Mathematic Operations, method return types. */

    String item;
    double price;
    int quantity;

    public Replit148(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public double itemTotalPrice() {
        double TotalValue = price * quantity;
        System.out.println(item + " Total Value " + TotalValue);
        double itemTotalPrice;
        return (TotalValue);
    }

    public double totalSum(double TotalValue) {
        double totalSum = TotalValue + TotalValue;
        System.out.println(totalSum);
        return TotalValue;
    }
    public static void main(String[] args) {
        Replit148 obj = new Replit148("Blanket" , 10, 20);
        //obj.itemTotalPrice();
        Replit148 obj1 = new Replit148("Mattress" ,3, 41 );
        //obj1.itemTotalPrice();

        System.out.println("You purchased "+ (  obj.itemTotalPrice()+ obj1.itemTotalPrice())+" Today");
    }
    }