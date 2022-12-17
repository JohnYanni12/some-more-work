package src.Replit;

public class Replit210 {
    public static void main(String[] args) {
        int a=10, b=0;
        double result;

       try {
           result = a / b;
       }
       catch (ArithmeticException ea){
           System.out.println("/ by zero");

        }
    }
}