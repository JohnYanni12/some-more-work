package src.Replit;

import java.util.ArrayList;
import java.util.Iterator;

public class Replit187 {
/*    Create an array list to type String.
    Add these values below to your arraylist
    hi
    yo
    sup
    yolo
    boop
    Remove 1, 3, 5 element from an array
    print remained values one by one in one line
**Expected Output:**
    yo yolo*/

        public static void main(String[] args) {
            ArrayList<String> words = new ArrayList<>();

            words.add("hi");
            words.add("yo");
            words.add("sup");
            words.add("yolo");
            words.add("boop");

            Iterator<String> word = words.iterator();
            for (int i = 1; i < words.size(); i += 2) {

                System.out.print(words.get(i) + " ");
            }
        }
}
