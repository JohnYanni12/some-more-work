package src.Replit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Replit207 {
 /*   Create Hash Map.
    add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
    Using EntrySet print the key and values pairs using iterator only
    replace with below key THREE--> ASEL and key FIVE-->SUMAIR
    Using EntrySet print the key and values pairs using iterator only
            OUTPUT
```
    HashMap Before Replace :
    FIVE : EEE
    ONE : AAA
    FOUR : DDD
    TWO : BBB
    THREE : CCC
------------------
    HashMap After Replace :
    FIVE : SUMAIR
    ONE : AAA
    FOUR : DDD
    TWO : BBB
    THREE : ASEL*/


    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        System.out.println("HashMap Before Replace :");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> k = it.next();
            System.out.println(k.getKey() + " : " + k.getValue());
        }
        System.out.println("------------------");
        System.out.println("HashMap After Replace :");

        Iterator<Map.Entry<String, String>> itt = map.entrySet().iterator();
        while (itt.hasNext()) {

            Map.Entry<String, String> kk = itt.next();
            if (kk.getKey().equalsIgnoreCase("FIVE")) {
                kk.setValue("SUMAIR");
            }
            if (kk.getKey().equalsIgnoreCase("THREE")) {
                kk.setValue("ASEL");
                }
            System.out.println(kk.getKey() + " : " + kk.getValue());
        }
    }
}