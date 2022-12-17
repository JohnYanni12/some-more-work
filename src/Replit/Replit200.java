package src.Replit;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Replit200 {
    public static void main(String[] args) {
      /*  Create A Map that will preserve an order of entry objects
        Add below pairs :
        "Street" = "Patrick ST"
        "Suite" = "265"
        "City" = "Vienna"
        "Zip" = "22180"
        "Country" = "United State"
        Print all values of from the map
        **Expected Output:**
        Patrick ST
        265
        Vienna
        22180
        United State*/

        LinkedHashMap<String, String> address = new LinkedHashMap<>();
        address.put("Street", "Patrick ST");
        address.put("Suite", "265");
        address.put("City", "Vienna");
        address.put("Zip", "22180");
        address.put("Country", "United State");
        Collection<String> values=address.values();

        Iterator <String> it = values.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str+ " ");
        }

    }
}
