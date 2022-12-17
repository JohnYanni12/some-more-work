package src.Replit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Replit203 {
    public static void main(String[] args) {

      /**Create HashMap
        add values as below
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);
        Using iterator retrieve all keys and values if the format below:
        **Expected Output:**
        Key = orange and value = 20
        Key = apple and value = 30
        Key = mango and value = 40****************/

       Map<String, Integer> map = new HashMap<>();

        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);

//        Collection<Integer> values = map.values();
//        Collection<String> keys = map.keySet();

              Iterator <String> itK = map.keySet().iterator();
              Iterator <Integer> itV = map.values().iterator();

        while(itK.hasNext()){

            String key = itK.next();
            Integer value = itV.next();

            System.out.println("Key = " + key + " and value =" + value);
        }
    }
}