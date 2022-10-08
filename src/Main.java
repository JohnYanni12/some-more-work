import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public String year;

    public static void main(String[] args) {
        /*Write a Java program to get the character at the given index within the String
         */

        String name = "John Gayed";
        String l1 = name.substring(0);
        String l2 = name.substring(7, 8);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(name.substring(9));

        /*2. Write a Java program to get the character
        (Unicode code point) at the given index within the String */
        String name1 = "w3resource";
        int ll1 = name1.codePointAt(name.length() - 1);
        System.out.println(ll1 / 2 + 1);
        System.out.println(ll1);
        char[] charArr = name1.toCharArray();
        System.out.println(Arrays.toString(charArr));
        //char [] newArr = charArr;
        String lArr = "";
        for (int i = name1.length() - 1; i >= 0; i--) {
            System.out.print(name1.charAt(i));
        }
        String lol = "kfpwoeifv 857031929520209485";
        System.out.println(lol.replaceAll("[0-6]", "john"));

        /*Write a Java program to compare a given string to the specified character sequence*/

        String st = "ywam org";
        String st1 = "Ywam.org";
        String[] arr = st.split(" ");
        System.out.println(Arrays.toString(arr));

        if (st.equals(st1)) {
            System.out.println(st + " is equals to " + st1);
        } else {
            System.out.println(st + " is NOT equals to " + st1);
        }
        /*Validate if the string ends with "u" prints the boolean value accordingly.*/
        String s1 = "hello how are you";

        for (int i = 0; i < s1.length() - 1; i++) {
        }
        if (s1.charAt(s1.length() - 1) == 'u') {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //Validate if the string ends with "world" prints the boolean value accordingly.

        String lastWord = s1.substring(s1.lastIndexOf(" " )+1);
        if (lastWord.equals("world")){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

//Validate if the string ends with "are" prints the boolean value accordingly.

            if (s1.equals("are")) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
       // Validate if the string ends with "you" prints the boolean value accordingly.

        if (lastWord.equals("you") ){

                System.out.println("True");
            } else {
                System.out.println("False");
            }




            System.out.println("*******************************");
            String str = "abracadabra alakazam";
            String target1 = "dab";
            String target2 = "ABRA";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'c') {
                    System.out.println(j);
                }
            }
//- Print out the position of the first occurrence of " ".
            int fPosition = str.indexOf(target1) ;
    System.out.println(fPosition);
    System.out.println("*******************************");

        String i = "I love Java classes at Syntax";

        System.out.println(i.substring(12,i.length()-1));
        System.out.println(i.substring(0,11 ));

        System.out.println("*******************************");

        Scanner sca = new Scanner(System.in);
        System.out.print("Enter a long word please: ");
        String input= sca.nextLine();
       // for (int k= 0; k<= input.length(); k++)
        System.out.println(input.substring(0,3));

        System.out.print("Enter any programming language: ");
        String language = sca.nextLine();

        if(language.equalsIgnoreCase("Java") ){
            System.out.print("Java is a programming language");
        }
        else if (language.equalsIgnoreCase("c")){
            System.out.print("C is a procedural programming language");
        }
        else if (language.equalsIgnoreCase("c++")) {
            System.out.print("C++ is a middle-level programming language");
        }
        else{
            System.out.print("Doesn't match any programming language");
        }
}

    public void year() {
    }

    public void schoolName() {
    }

    public void batchNum() {
    }
}
