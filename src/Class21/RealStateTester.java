package src.Class21;

public class RealStateTester {
    public static void main(String[] args) {
        Appartment appartment = new Appartment();
        SingleHouse singleHouse = new SingleHouse();
        Condo condo = new Condo();


        Realstate [] money = {singleHouse, appartment, condo};

        for (Realstate x : money) {
x.price();

        }
        }

    }
