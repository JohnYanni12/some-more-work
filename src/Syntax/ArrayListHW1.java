package src.Syntax;

import java.util.ArrayList;

public class ArrayListHW1 {

    public static void main(String[] args) {

        ArrayList <String> names = new ArrayList<>();
        names.add("john");
        names.add("mariam");
        names.add("Natoo");
        names.add("Adam");
        names.add("Lily");
        System.out.println(names);
        System.out.println(names.isEmpty());
        System.out.println(names.size());
        System.out.println(names.contains("Lily"));

        ArrayList<String> a = new ArrayList<>();
        a.add("Egypt");
        a.add("USA");
        System.out.println(a);

        ArrayList<String> a_names=new ArrayList<>();
        a_names.addAll(names);
        a_names.addAll(a);
        System.out.println(a_names);
        a_names.removeAll(a);
       a_names.clear();
        System.out.println(a_names);
    }
}