package Class25;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {

        Map<Integer, Person> info = new TreeMap<>();
        info.put(1,new Person("John" , "Y" , 36, 123));
        info.put(2,new Person("Tammy" , "G" , 23, 234));
        info.put(3,new Person("Nour" , "H" , 11, 765));
        info.put(4,new Person("Joe" , "X" , 8, 78));
     // var info = Person.
        for(var in : info.values()) {
            System.out.println(in.print());
        }
    }
}
