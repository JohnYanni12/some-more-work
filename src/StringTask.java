import java.util.Scanner;

public class StringTask {

    public static void main(String[] args) {
        /*Create a String that will hold a sentence. Write a program to get a new String without any spaces.*/
//         String words = "We love Java very much!";
//          String words1 = words.replace(" ", "");
//           System.out.println(words1);
//            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
///*Create a String that should be combination of letters,
//numbers and special characters. Find out how many
//Alphanumeric(abd AZ 284) characters are there in the String.*/
//
//        String alphN = "ehu^$urjHFJ2*&398GDhd*kgoe(56453";
//        for (int i = 0; i < alphN.length(); i++) {
//
//        }
//        System.out.println("The thotal number of the Alphanumeric { " + alphN + " } are " + alphN.length());
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//        /*
//        You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
//        How would you find out how many sentences are in that String?
//        How would you reverse a String word by word? for example
//        // input=>This is sentence i want to reverse
//        // output=>sihT si ecnetnes i tnaw ot esrever
//         */
//
//        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
//        String[] aa = a.split("[?]");
//
//        System.out.println("THe number of sentences found in the following:" +
//                "\nIs it saturday? Is it raining? Do we have a Java Class today?" +
//                "\nare ---> " + aa.length);
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//
///*How would you reverse a String word by word? for example
//        // input=>This is sentence i want to reverse
//        // output=>sihT si ecnetnes i tnaw ot esrever*/
//
//        String word1 = "This is sentence i want to reverse";
//        StringBuilder word = new StringBuilder(word1);
//        System.out.println(word.reverse());
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//
//        /*How would you check if String is palindrome or not? aba=> true
//        Abbc =>false*/
//        String reverse = "";
//        String word3 = "john";
//        for (int i = word3.length() - 1; i >= 0; i--) {
//            reverse += word3.charAt(i);
//        }
//        if (reverse.equals(word3)) {
//            System.out.println("It is palindrome");
//        } else {
//            System.out.println("It is NOT palindrome");
//        }
//        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
//        /*How would you swap 2 strings without a temporary variable?*/
//        String x = "john";
//        System.out.println("First word is: " + x);
//        String y = "mariam";
//        System.out.println("Second word is: " + y);
//
//        x = x + y;
//        y = x.substring(0, x.length() - y.length());
//        x = x.substring(y.length());
//
//        System.out.println("After swaping the first word is: " + x);
//        System.out.println("After swaping the first word is: " + y);
//
//        System.out.println("*************************************");
//
//        int[][] aaa = {
//                {1, 1, 2}, //sum = 4
//                {3, 1, 2}, //sum = 6
//                {3, 5, 3}, //sum = 11
//                {0, 1, 2}  //sum = 3
//        };
//
//        for (int i = 0; i < aaa.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < aaa.length - 1; j++) {
//                sum += aaa[i][j];
//            }
//            System.out.println(sum);
//        }
//        System.out.println("*************************************");
//
//        int[][] a2 = {
//                {-5, -2, -3, 7},//-3
//                {1, -5, -2, 2}, //-4
//                {1, -2, 3, -4}};//-2
//        //-3  -9  -2  5
//        int rowSum = 0;
//
//        for (int i = 0; i < a2.length; i++) {
//            int j = 0;
//            for (j = 0; j < a2.length; j++)
//                rowSum += a2[i][j];
//            if (a2[i][j] <= 0 && a2[i][j] % 2 == 0) {
//                System.out.print(a2[i][j] + " ");
//                System.out.println(" ");
//            }
//        }
//        System.out.println("*************************************");
//
//        int[][] a21 = {
//                {8, 2, 3, 4},//10
//                {5, 20, 7, 8}, //26
//                {9, 100, 101, 12}};//42
//        //15  18  21  24
//
//        for (int i = 0; i < 3; i++) {
//            int rowSum1 = 0;
//            int max = a21[i][0];
//            for (int j = 1; j < 4; j++) {
//                if (max >= a21[i][j])
//
//                    rowSum1 += a21[i][j];
//            }
//            System.out.println("The max in  row " + (i + 1) + " is: " + max);
//            System.out.println("The sum of row" + (i + 1) + " is: " + rowSum1);
//        }
//        for (int i = 0; i < 4; i++) {
//            int rowSum1 = 0;
//            for (int j = 0; j < 3; j++) {
//                rowSum1 += a21[j][i];
//
//            }
//            System.out.println("The sum of column " + (i + 1) + " is: " + rowSum1);
//        }
//
//        System.out.println("*************************************");
//// Finding the MAX number in a row in the array.
//        int[][] a22 = {
//                {8, 2, 3, 4},//10
//                {5, 20, 7, 8}, //26
//                {9, 100, 101, 12}};//42
//        int newMax = 0;
//        for (int i = 0; i < 3; i++) {
//            int rowSum1 = 0;
//            int max = 0;
//            for (int j = 0; j < 4; j++) {
//                if (a22[i][j] > max) {
//                    max = a22[i][j];
//
//                }
//            }
//            System.out.println("The max in  row " + (i + 1) + " is: " + max);

//        Scanner inp = new Scanner(System.in);
//        System.out.print("In:");
//        String word11 = inp.nextLine();
//        for (int i = 0; i < word11.length(); i +=2){
//            System.out.print(word11.charAt(i));
//
//        }
//        System.out.print("******************* ************************ ");
//        Scanner inp1 = new Scanner(System.in);
//        System.out.print("In:");
//        String word22 = inp.nextLine();
//        for (int r = 0; r < word22.length() ; r++) {
//
//            System.out.print(word22.charAt( r )+ " ");
//        }

        System.out.println("******************* ************************ ");
//        Scanner sca = new Scanner(System.in);
//        String name1 = "";
//        String name111 = "";
//        String name5 = "";
//        System.out.println("Enter 5 names:");
//        String[] namew = new String[2];
//        int r = 0;
//
//        for (String name : namew)
//
//            name111 = sca.nextLine();
//        name1 = "";
//            System.out.println(name111);







//
//        String wo1 = "Hello";
//        String wo2 =  "World";
//        StringBuilder wo = new StringBuilder(wo1.toUpperCase()+ " " + wo2.toUpperCase());
//        System.out.println(wo);

















//
//        int nums[] = { 12, 15, 16, 17, 19 };
//
//        for (int i = nums.length-1; i >0; i--) {
//
//            System.out.println(nums[i]);
//
//            int[] a = {12, 15, 11, 13, 9, 25};
//            int[] a2 = {12, 15, 11, 13, 9, 25};
//            int sum = 0;
//            for (int ii = 0; i <a.length; i++) {
//                if (a[i] % 2== a2[i ] % 5)  {
//                    sum += ii * ii;
//                }
//            }
//            System.out.println("sum = " + sum);
//            }
//        StringBuilder word = new StringBuilder("Hello Frinds");
//        StringBuilder reverse = word.reverse();
//        System.out.println(reverse);


        System.out.println("******************* ************************ ");
        /* There is a code that takes input as a String. Write
        a program that will print out only vowels of that string*/
//        Scanner inp = new Scanner(System.in);
//        System.out.println("In: ");
//        String word1 = inp.nextLine();
//        int i;
//        char ch=0;
//        for(i = 0; i < word1.length();i++) {
//            ch = word1.charAt(i);
//
//                if (ch == 'a' || ch == 'A' ||
//                    ch == 'i' || ch == 'I' ||
//                    ch == 'u' || ch == 'U' ||
//                    ch == 'E' || ch == 'e' ||
//                    ch == 'o' || ch == 'O') {
//                System.out.print(ch + " ");
//            } else {
//                System.out.print("");
//            }
//        }
    }
}