package src.Replit;

import java.util.LinkedList;

public class Replit190 {
    public static void main(String[] args) {

/*    Create Linked List that will store first 10 numbers of fibonacci series
    Print number from Linked List 1 by 1 all in 1 line
**Expected Output:** 0 1 1 2 3 5 8 13 21 34*/
        int firstnum = 0;
        int secondnum = 1;
        int n = 10;
        LinkedList<Integer> nums = new LinkedList<>();
        for (int i = 1; i <= n; ++i) {
            int nextTerm = firstnum + secondnum;
            nums.add(firstnum);
            firstnum = secondnum;
            secondnum = nextTerm;
        }
        System.out.println(nums);
    }
}