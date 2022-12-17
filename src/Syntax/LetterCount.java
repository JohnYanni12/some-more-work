package src.Syntax;
public class LetterCount {
  /*  133- Create a static method with the following specs:
    Returns:            ```
    an integer Name:countA Parameters: a String called s
    Purpose: count the number of occurrences of 'a' or 'A' within s
    Examples:
    countA("aaa") ==> 3     countA("aaBBdf8k3AAadnklA") ==> 6
    Hint: How do you write a for loop to loop through every letter of a string?  You've done this multiple times already :)
*/
    String s;
    public static int LetterCount (String s) {
       int count = 0;
        char[] lettersInArray = s.toCharArray();

        for (int i = 0; i < s.length(); i++){
            if(lettersInArray[i] == 'a' || lettersInArray[i] == 'A')
            count++;
            }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(LetterCount (("aaBBdf8k3AAadnklA"))) ;
    }
}
