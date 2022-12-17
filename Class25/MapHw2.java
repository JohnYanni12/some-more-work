package Class25;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapHw2 {
    /*Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop and iterator.*/
    public static void main(String[] args) {


        Map<String,String> countries = new TreeMap<>();
        countries.put("Egypt","Cairo");
        countries.put("USA","Washington");
        countries.put("France","Paris");
        countries.put("England","London");
        countries.put("Holland","Amsterdam");
        countries.put("Jordon","Aman");

        Iterator <Map.Entry<String,String>> it = countries.entrySet().iterator();
        System.out.println("Printing all keys and values using iterator: ");
        System.out.println(countries);

        System.out.println("-----------------------");

        var country = countries.entrySet();
        System.out.println("Printing all keys and values using for each loop:");
        for (var str : country){

            System.out.print(str + "  ");
        }
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Printing all values using iterator: ");

        Iterator <String> value = countries.values().iterator();
        while (value.hasNext()){
            var v = value.next();
            System.out.print(v + "  ");
        }
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Printing all values using for each loop: ");
        var countryValues = countries.values();
        for ( String v :countryValues){
            System.out.print (v + "  ");
        }
    }
}
