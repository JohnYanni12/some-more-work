package src.Replit;

import java.util.Iterator;
import java.util.LinkedList;

public class Replit189 {

    public static void main(String[] args) {
        /*Create a Linked List that will store Integer Objects from 50-100.
        Once Linked List is created remove all numbers that are not divisible by 3.
        Print Linked List
                **Expected Output** [51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]*/

        LinkedList <Integer> nums = new LinkedList<>();
        int count = 50;
        while (count <=100) {
                nums.add(count);
                count++;
        }
     Iterator<Integer> num = nums.iterator();
        while(num.hasNext()){
            Integer number = num.next();
          if (number % 3 !=0){
              num.remove();
          }
        }
        System.out.println(nums);
   }
}