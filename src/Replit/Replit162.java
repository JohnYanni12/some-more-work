package src.Replit;

public class Replit162 {
/*Overload static method and then execute both overloaded methods.
**Expected Output:**
static method without parameter
* static method with int parameter */
    static void A(){
        System.out.println("static method without parameter");
    }
    int num;
    static void  A(int num){
        int number = num;
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args) {
        Replit162.A();
        Replit162.A(10);

    }
}
