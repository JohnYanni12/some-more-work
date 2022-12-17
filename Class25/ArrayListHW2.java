package Class25;

import java.util.ArrayList;

public class ArrayListHW2 {

    public static void main(String[] args) {

        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Orange");
        drinks.add("Mint");
        drinks.add("Fanta");
        drinks.add("Pepsi");
        drinks.add("cola");
        drinks.add("Coffee");

//        Iterator<String>iterator = drinks.iterator();
//        int count = 0;
//        while(iterator.hasNext()){
//            String items = iterator.next();
//            if(items.contains("e") || items.contains("a")){
//                drinks.set(count, "Water");
//            }
//            count++;
//        }


        //Another Way -------->
        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a") || drinks.get(i).contains("e")){
                drinks.set(i, "Water");
            }
        }
        System.out.println(drinks);
    }
}