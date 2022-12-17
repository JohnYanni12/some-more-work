package Class25;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListHW1 {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("joy");
        words.add("love");
        words.add("Self control");
        words.add("Peace");
        words.add("Kindness");
        var iterater  = words.iterator();
        Iterator<String> NoE = words.iterator();
        while(NoE.hasNext()){
            if(NoE.next().endsWith("e")) {
                NoE.remove();
            }
        }
        System.out.println(words);
    }
}