package Class25;

import java.util.Iterator;
import java.util.TreeSet;

public class MapHw1 {
    public static void main(String[] args) {
     /*Create a map of a building. Store floor number and it is associated company name.
    (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map*/
//       Map<Integer, String> building = new LinkedHashMap<>();
//        building.put(1, "Google");
//        building.put(2, "Zoom");
//        building.put(3, "Google");
//        building.put(4, "Syntax");
//        building.put(5, "Amazon");
//        building.put(6, "Zoom");
//        building.put(7, "Etsy");
//
//        System.out.println(building.size());
//        for (int i = 0; i < building.size(); i++) {
//            building.replace(4,"Facebook");
//           building.remove(7);
//        }
//           System.out.println(building);


        TreeSet map = new TreeSet();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");
        Iterator it = map.iterator();
        while (it.hasNext() )
        {
            System.out.print( it.next() + " " );
        }
    }
}