public class reverseString {

    public static void main(String[] args) {
        /*
        Create a String and print it in reverse order
        (Sunday → yadnuS).
         */
        String name1 = "Friday";
        String reName= "";
        for (int  i = name1.length ()-1 ; i >= 0; i--){
            reName += name1.charAt(i);
        }
        System.out.println(reName);
    }
}
