public class Main3 {

    /*Create a method with the following specs:
Returns:``` an integer Name: sumEvenToX
Parameters: an integer called "x"
Purpose: calculate the sum of the EVEN integers from 1 to x (including x) */
    int sumEvenToX(int x) {
        int sum = 0;

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

        public static void main(String[] args) {

            Main3 obj = new Main3();
            int a = obj.sumEvenToX(5);
            System.out.println(a);

        }
}