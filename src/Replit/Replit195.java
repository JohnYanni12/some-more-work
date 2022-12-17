package src.Replit;

import java.util.HashSet;
import java.util.Iterator;

public class Replit195 {

    /*Create the HashSet with list of Integers add the below numbers for the list
        111
        111
        111
        999
        999
        999
    Print elements one by one.
**Expected Output**
            999
            111*/

    public static void main(String[] args) {

        HashSet<Integer> number = new HashSet<>();
        number.add(111);
        number.add(111);
        number.add(111);
        number.add(999);
        number.add(999);
        number.add(999);

        Iterator<Integer> num = number.iterator();
        while(num.hasNext()){
            int n = num.next();
            System.out.println(n);
        }
    }
}