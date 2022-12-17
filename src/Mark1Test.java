package src;

public class Mark1Test {

    public static void main(String[] args) {
        A1 a = new A1(77, 56, 89);
        double precentageA = a.getPercentage();
        System.out.println("student a avrage mark= " + precentageA);

        B1 b = new B1(77, 56, 89, 86);
        double precentageb = b.getPercentage();
        System.out.println("student B avrage mark= " + precentageb);
    }
}