package src.Replit;

import java.util.ArrayList;
import java.util.Scanner;

public class Replit188 {
/* Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line
Numbers in: 4
            62
            8
            5
            4
            **Expected Output:**
            4 62 8 5 4 ```*/

    public static void main(String[] args) {

        System.out.println("Please enter 5 numbers: ");
        ArrayList<Integer> nums = new ArrayList<>();
        int count=0;
        while (count <5) {
            Scanner scanner = new Scanner(System.in);
            Integer n = scanner.nextInt();
            count++;
            nums.add(n);
           // Iterator<Integer> num = nums.iterator();
            for (int i = 0; i < nums.size(); i++) {

            }
        }
        System.out.println(nums);
    }
}