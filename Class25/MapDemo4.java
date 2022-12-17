package Class25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo4 {

    public static void main(String[] args) {

        HashMap<String, Double> family = new HashMap<>();
        family.put("John", 43.3);
        family.put("Mariam", 40.5);
        family.put("Nataile", 13.0);
        family.put("Adam", 11.3);
        family.put("Lily", 5.2);
        family.put("Mostafa", 90.9);
        Set<String> allKey = family.keySet();

        Iterator <String> it= allKey.iterator();
        while(it.hasNext()){
            String item = it.next();
            if (item.contains("f")){
                it.remove();

            }
        }
        System.out.println(family);
    }
}
