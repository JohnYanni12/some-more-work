package src.Replit;

import java.util.HashMap;
import java.util.Map;

public class Replit206 {
    public static void main(String[] args) {

/*    # Hash Map
    Create a Hash Map of String pairs
    add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
    Using entry set print key and values pairs using loop
    Remove below from Map
    "ONE"
    "FOUR"
    Using entry set print key and values pairs using loop
**Expected Output:**
    HashMap Before Remove :
    FIVE : EEE
    ONE : AAA
    FOUR : DDD
    TWO : BBB
    THREE : CCC
---   ---   ---   ---   ---   ---
    HashMap After Remove :
    FIVE : EEE
    TWO : BBB
    THREE : CCC*/
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        System.out.println("HashMap Before Remove :");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("-------------------");
        System.out.println("HashMap After Remove :");
            map.keySet().removeIf(x -> x.equalsIgnoreCase("one")
                                    || x.equalsIgnoreCase("Four"));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
        }
      //  StringBuilder sb=new StringBuilder("Syntax"); sb.append("Solutions"); System.out.println(sb);
        StringBuffer sb = new StringBuffer("Hello");sb.append("World");System.out.println(sb);

    }

}