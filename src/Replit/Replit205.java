package src.Replit;

import java.util.HashMap;
import java.util.Iterator;

public class Replit205 {
    public static void main(String[] args) {

 /*   Create a HashMap of String.
    Add below pair to it .
"Street" = "Patrick ST"
        "Suite" = "265"
        "City" = "Vienna"
        "Zip" = "22180"
        "Country" = "United State"
    Print all the values in upper case using entrySet
**Expected Output:**
    265
    22180
    PATRICK ST
    UNITED STATE
    VIENNA*/

    HashMap<String, String> address = new HashMap();
        address.put("Street", "Patrick ST");
        address.put("Suite", "265");
        address.put("City", "Vienna");
        address.put("Zip", "22180");
        address.put("Country", "United State");

    Iterator<String> it = address.values().iterator();
        while(it.hasNext()){
        String str = it.next();
        System.out.println(str);
    }
}
}
