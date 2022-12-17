package Class25;

import java.util.Map;
import java.util.TreeMap;

public class MapHw5 {

    /*Create a Map that will store Employee name and salary. Write a logic to retrieve
    an employee who gets the highest salary. Output should be in the below format
    John Smith=$100000*/

    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();
        map.put("John Smith", 129080);
        map.put("William Fireman", 56000);
        map.put("Nano Artgas ", 320098);
        map.put("Martin Adamson", 654643);
        map.put("Ramoon Katalles", 170000);

//        Iterator <Integer> it = map.values().iterator();
        var v = map.keySet();
        var str = "";
        int max = 0;
        for(var maxN:v){
           if (map.get(maxN)>max ){
              max = map.get(maxN);
              str = maxN;
           }
        }
        System.out.println( str + " = $"+ max);
    }
}