public class ArraySum {

    /*Create a method that will accept an array as parameters and will return a
    sum of all elements from that array. Method should be visibly
    only within same package and accessible by the creating an instance of the class.*/

    int sumArray (int [] arr){
 int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /*Create a method that will take a String as a parameter and returns reversed String.
     Method should be available to all classes within your project and accessible by class name.
     */

   public static String name (String word) {
        StringBuilder word1 = new StringBuilder(word);
        word1.reverse();
        String h = String.valueOf(word1);

        return (h);
    }

    /*Create a method that will accept a String as a parameter and return a
    new String that consist only of vowels. Method should be
    available inside the class only where it was declared and executed
    by calling it is name.*/

   private static String str (String nStr){
       String newStr = nStr.replaceAll("[^aeiouAEOIU]", "");

        return newStr;
    }

    public static void main(String[] args) {

        ArraySum obj = new ArraySum();
        int [] arr = {1,4,5,6,7,8,5,3,};
        System.out.println(obj.sumArray(arr));

        ArraySum obj1 = new ArraySum();
        //String word = "I love Java";
        System.out.println(obj1.name("I love Java"));

        System.out.println(str("hello"));

        }
    }
