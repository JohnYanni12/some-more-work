package Class25;

import java.util.HashMap;
import java.util.Map;

public class MapHw3 {
    /*Create a map of Best Buy store. Place
    item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
    Retrieve all keys and values from a Best Buy map using EntrySet.*/
    public static void main(String[] args) {
        Map<Integer, String> BestBuy = new HashMap<>();
        BestBuy.put(7664847 , "Printer");
        BestBuy.put(3612484 , "Ink");
        BestBuy.put(1232154 , "Iphone 14");
        BestBuy.put(86742 , "Samsung TV");
        BestBuy.put(9900123 , "Speaker");
        BestBuy.put(6484743 , "Canon Camera");
      var items = BestBuy.entrySet();
        System.out.println(items);
    }
}
