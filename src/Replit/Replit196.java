package src.Replit;

import java.util.HashSet;
import java.util.Iterator;

public class Replit196 {

    public static void main(String[] args) {
/*        Create a Set and below values to it.
[third, first, second]
        Print HashSet and then remove all the elements from Hashset and print it again.
**Expected Output:**
[third, first, second]
[]*/
        HashSet<String> words = new HashSet<>();
        words.add("third");
        words.add("first");
        words.add("second");

        System.out.println(words);
        Iterator<String> it = words.iterator();
        while (it.hasNext()) {

            if (!it.next().isEmpty()) {
                it.remove();
            }
        }
        System.out.println(words);
    }
}