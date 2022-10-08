public class MethodClassHW {
        /*
    Create a method that will take 2 parameters as a numbers
    and prints which number is larger. */

    void twoNumbers(int number1, int number2) {
        if (number1 > number2) {
            System.out.println("Number " + number1 + " is greater than " + number2);
        } else {
            System.out.println("Number " + number2 + " is greater than " + number1);;
        }
    }

    /*Create a method that will take a number and prints
    whether the number is even or odd. */
    void evenOdd(int n) {

        if (n % 2 == 0) {
            System.out.println("Number " + n + " is even");
        } else {
            System.out.println("Number " + n + " is odd");
        }
    }
    /* Create a method that will print whether given String is palindrome or not. */

    void palindromeString(String word) {
        StringBuilder wordString = new StringBuilder();
        StringBuilder reverse = wordString.reverse();
        System.out.println(reverse);

        if (word.equals(reverse)) {

            System.out.println("The word " + word + " is a palindrome");
        } else {
            System.out.println("The word (" + word + ") is NOT a palindrome");
        }
    }


    /*Create a method that will say Hello in different language based on
    the country that will passed when method is executed */

    void country(String country) {
        switch (country) {
            case "USA" -> System.out.println("Hello");
            case "India" -> System.out.println("Namaste");
            case "Turkiye" -> System.out.println("Merhaba");
            case "Pakistan" -> System.out.println("AOA");
            case "Japan" -> System.out.println("Nihau");
        }


        }


    /* Write a method to return whether given number is prime or not?*/

   void primeNum(int num) {
        boolean isPrime = true;
        int i = 0;

        for (i = 2; i < num; i++)
            if (num % i == 0) {
                isPrime = false;
                break;
            }


        if (isPrime) {
            System.out.println(num + " Is prime");
        } else {
            System.out.println(num + " Is NOT prime");
        }

    }

        public static void main (String[]args){

            MethodClassHW obj = new MethodClassHW();
            obj.twoNumbers(4, 7);

            MethodClassHW ojb2 = new MethodClassHW();
            ojb2.evenOdd(5);

            MethodClassHW obj3 = new MethodClassHW();
            obj3.palindromeString("JOJ");

            MethodClassHW obj4 = new MethodClassHW();
            obj4.country("USA");

            MethodClassHW obj6 = new MethodClassHW();
            obj4.primeNum(11);
        }
    }
