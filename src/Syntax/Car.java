package src.Syntax;

public class Car {
    int carPrice;
}
class Truck extends Car {

    int weight;
    double calculateSalePrice() {
        if (weight > 2000) {
            double SalePrice = carPrice * 0.9;
            return SalePrice;
        } else {
            double SalePrice = carPrice * 0.8;
            return SalePrice;
        }
    }
}
class Sedan extends Car {
    double length;

    double calculateSalePrice( double length, double carPrice ) {

        this.length=length;

        if (length > 20) {
            double SalePrice = carPrice * 0.95;
            return SalePrice;
        } else {
            double SalePrice = carPrice * 0.9;
            return SalePrice;
        }
    }

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.weight = 2220;
        truck.carPrice = 434565;
        double p =  truck.calculateSalePrice();
        System.out.println("Truck prise is: " + p);

        Sedan sedan = new Sedan();
        double pp = sedan.calculateSalePrice(9, 40000);
        System.out.println("Sedan prise is: " + pp);
        }
    }