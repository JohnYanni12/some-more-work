package src.Replit;
import java.util.LinkedList;

public class Replit192 {
    public static void main(String[] args) {
/**        Create an Linked List that will store all prime numbers from 1 to 100
        Step 1. Create a method that will identify wether number is prime or not
        Step 2. Add all prime numbers into Linked List
        Print Linked List:
**Expected Output:*[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]*/
        LinkedList <Integer> PrimeNums = new LinkedList<>();

        for (int numberToCheck = 2; numberToCheck <= 100; numberToCheck++) {
            boolean isPrime = true;
            for (int factor = 2; factor <= numberToCheck/2 ; factor++) {
                if (numberToCheck % factor == 0) {
                    isPrime = false;
                }
            }
                if(isPrime) {
                    PrimeNums.add(numberToCheck);
                }
            }
        System.out.println(PrimeNums);
    }
}