package Class25;

import java.util.ArrayList;
import java.util.LinkedList;

public class EvenNum500 {
    public static void main(String[] args) {
    /*Create an arrayList of even numbers from 1 to 500.
    Remove any number that is divisible by 5 from that arrayList.*/

        ArrayList<Integer> num = new ArrayList<>();
//        Integer num1 = 0;
//        while (num1 <= 500){
//
//            if ((num1 % 2 == 0)) {
//                num.addAll(Collections.singleton(num1));
//            }
//            num1++;
//        }
//       Iterator<Integer> divisibleBy5 = num.iterator();
//       while(divisibleBy5.hasNext()){
//           int value = divisibleBy5.next();
//           if ( value%5==0){
//               divisibleBy5.remove();
//           }
//       }

        // Better way
//        for (int i = 2; i <= 500; i += 2) {
//            num.add(i);
//        }
//        var it = num.iterator();
//        while (it.hasNext()) {
//            Integer nums = it.next();
//            if ( nums % 5 == 0) {
//                it.remove();
//
//            }
//        }
//        System.out.println(num);

        LinkedList <String> ll= new LinkedList<>();
       long statTime = System.currentTimeMillis();
        for (int i = 0; i <1000 ; i++) {
            ll.add(0,"Test");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("LinkList"+(endTime -statTime));
       ArrayList <String> ll1= new ArrayList<>();
        long statTime1 = System.currentTimeMillis();
        for (int i = 0; i <1000 ; i++) {
            ll1.add(0,"Test");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("ArrayList" +(endTime1 -statTime1));
    }
}