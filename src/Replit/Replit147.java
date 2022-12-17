package src.Replit;

public class Replit147 {

    String model;
    double price;
    int quantity;

    public Replit147(String model,double price, int quantity ) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;

    }
    void carStockValue(){
       double StockValue = price * quantity;
        System.out.println(model + " stoke Value " + StockValue);
    }

    public static void main(String[] args) {
        Replit147 obj = new Replit147("Toyota 2019", 25000, 10);
        obj.carStockValue();
        Replit147 obj1 = new Replit147("BMW 2019", 65298, 10);
        obj1.carStockValue();
    }
}
