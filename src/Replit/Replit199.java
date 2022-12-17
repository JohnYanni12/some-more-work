package src.Replit;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Replit199 {

    public static void main(String[] args) {
     /**   Create a Set collection in which you want to preserve an order of inserted String Objects.
        Add the below values
                - null
                - Sohil
                - Diego
                - Alijon
                - Asel
                - Sumair
        Print values 1 by 1 using loop and Iterator*/
        Set<String> names = new LinkedHashSet<>();
        names.add("null");
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");

        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String str = it.next();
                    System.out.println(str);
        }

        for(String name:names) {
            System.out.println(name);
        }
        }
    }