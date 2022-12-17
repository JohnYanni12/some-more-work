package Class25;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MapHw6 {
   /* Create the collection that will store single uniques Objects of a String type in which order is preserved.
    Write a logic to concatenate all string from the collection.*/
    public static void main(String[] args) {
        Set<String> obj = new LinkedHashSet<>();
        obj.add("I");
        obj.add("Love");
        obj.add("To");
        obj.add("Drink");
        obj.add("Water");

        Iterator<String> it = obj.iterator();
        while (it.hasNext()) {
            String word = it.next();
            System.out.print(word + " ");
        }
    }
}