public class Main2 {
    boolean isEven;
    boolean number(int num1, int num2) {

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            isEven = true;
        } else if (num1 % 2 == 0 || num2 % 2 == 0) {
            isEven = false;
        } else {
            isEven = false;
        }
        return isEven;
    }
    public static void main(String[] args) {
        Main2 obj3 = new Main2();
        boolean a = obj3.number(2,100);
        System.out.println(a);
    }
}