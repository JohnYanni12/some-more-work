package src.Replit;

public class Repilt144 {
    /*
    Step 1: Complete the StoreProduct.java class:
Create below instance variables. (Choose proper datatype and naming convention for variable )
* label * price  * category * hasExpiration
* stock (represent the stock quantity)
Step 2: Write three constructors:
* The main constructor( with all parameters)
* Second constructor with all parameters except category and hasExpiration (category defaults to "misc", hasExpiration defaults to false inside constructor)
* Third constructor all the parameters except category, expiration, and stock (stock default to 0 inside the constructor)
Step 3: Method for display out put.
in StoreProduct Class create a method to display the output of class variables. (Output sequence as as order of variable shown above. all in one line)
Step 4: in Main Class Create an object of StoreProduct Class with each constructors.
pass the values and then call the display method.
Step 5: Execute your application :)
Hint: each variable must be object specific
Output:Eggs 3.0 Produce true 10
Paper Towels 2.0 misc false 24
Paper Towels 2.0 null false 0 */
   String label;
   String category;
   boolean hasExpiration = true;
   double  price;
   int stock;

   Repilt144(String label,String category,boolean hasExpiration, double  price, int stock){
       this.label=label;
       this.category =category;
       this.hasExpiration= hasExpiration;
       this.price = price;
       this.stock= stock;
  }

    Repilt144(String label, double  price, int stock){
       this.label = label;
        this.price = price;
        category= "misc";
        hasExpiration = false;
        this.stock= stock;
    }

    Repilt144(String label, double  price){
        this.label = label;
        this.price = price;
        hasExpiration = false;
        stock = 0;
    }
    void display(){

        System.out.println(label +" "+ price +" "+ category +" "+hasExpiration +" "+ stock);
    }

    public static void main(String[] args) {
        Repilt144 obj = new Repilt144("Eggs", "Produce", true, 3, 10  );
        obj.display();
        Repilt144 obj1 = new Repilt144("Paper Towels",  2, 24  );
        obj1.display();
        Repilt144 obj2 = new Repilt144("Paper Towels", 2);
        obj2.display();
    }
}