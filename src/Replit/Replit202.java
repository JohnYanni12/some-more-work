package src.Replit;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Replit202 {

    public static void main(String[] args) {

      /*  Create Map in which we want to store keys in Ascending order
        Add the below values
        1 item = apple
        2 item = banana
        3 item = pear
        4 item = tomato
        5 item = mango
        6 item: kiwi
        Extract all keys and its values and print them in the format below:
        **Expected Output:**
        Key is 1 item and values is apple
        Key is 2 item and values is banana
        Key is 3 item and values is pear
        Key is 4 item and values is tomato
        Key is 5 item and values is mango
        Key is 6 item and values is kiwi*/

        LinkedHashMap<String, String> items = new LinkedHashMap<>();
        items.put("1 item",  "apple");
        items.put("2 item",  "banana");
        items.put("3 item",  "pear");
        items.put("4 item",  "tomato");
        items.put("5 item",  "mango");
        items.put("6 item",  "kiwi");

        //Iterator<Map.Entry<String, String>> it= items.entrySet().iterator();
        Iterator<String> itK = items.keySet().iterator();
        Iterator<String> itV = items.values().iterator();

        while(itK.hasNext()){
            String key = itK.next();
            String value = itV.next();

            System.out.println( "Key is " + key +" and values is "+  value);
        }
    }
}