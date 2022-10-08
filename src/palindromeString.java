public class palindromeString {


    void palindromeString(String word) {
        StringBuilder wo = new StringBuilder(word);
        wo.reverse();

        if (wo.toString().equalsIgnoreCase(word)) {

            System.out.println("The word " + word + " is a palindrome");
        } else {
            System.out.println("The word (" + word + ") is NOT a palindrome");
        }
    }

    public static void main(String[] args) {

        palindromeString reword = new palindromeString();
        reword. palindromeString("Joj");

    }
}
