public class moreString {

    public static void main(String[] args) {

String word = "we love java";
String wordz= word.replace(" ", "");
        System.out.println(wordz);
        String str = "eikjKBKJKf;ekj884NjjKJHkjKJBKJBL";
        System.out.println("str = " + str);
        str= str.replaceAll("[a-z,A-Z]", "");
        System.out.printf("str = %s%n", str);
        boolean isTrue = false;
        if(!isTrue);

        StringBuilder word7 = new StringBuilder("Hello Frinds");
        StringBuilder reverse = word7.reverse();
        System.out.println(reverse);

        /*
          Create a String that should be combination of letters, numbers and special characters.
         Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */

//        String Alphanumeric = "18293kjfhsuas94hfBNS&*";
//        String Alphanumeric1 = Alphanumeric.replaceAll([^a-zA-Z0-9] ,"");
//
//        int count = 0;
//        for (int i=0;i<=Alphanumeric.length(); i++){
//            count++;
//        }
//        System.out.println(count);
    }
}