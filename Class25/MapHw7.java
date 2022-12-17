package Class25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MapHw7 {
    /*Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers*/
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(8);
        numbers.add(9);
        numbers.add(1);
        numbers.add(4);
        numbers.add(7);
        numbers.add(2);

        int count = 0;
        Iterator <Integer> it = numbers.iterator();
        while(it.hasNext()){
            int num =it.next();
            count += num;
        }
        System.out.println(count);
        }
    }