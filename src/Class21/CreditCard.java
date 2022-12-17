package src.Class21;
public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
    Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    Call the method by creating an object of each of the three classes.*/
    double balance = 230000;
    double interest = 0.03;

    void calculateInterest() {
        System.out.println(interest * balance/100);
    }
    static class Visa extends CreditCard{
        void calculateInterest() {
            System.out.println((interest * balance) / 0.023);
        }
    }
    static class AX extends CreditCard {
        void calculateInterest() {
            System.out.println((interest / 0.11) * balance);
        }
    }
        public static void main(String[] args) {
            CreditCard cc = new CreditCard();
            cc.calculateInterest();

            Visa visa = new Visa();
            visa.calculateInterest();

            AX ax = new AX();
            ax.calculateInterest();
    }
}








