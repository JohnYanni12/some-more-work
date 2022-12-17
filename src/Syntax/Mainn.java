package src.Syntax;
public class Mainn {
    /*
    Write a method header on line two with the following specs:
Returns: a String Name: thirdLetter
Parameters: a String called s
Then complete the method by programming the following behavior
Returns every 3rd letter of the String s,
starting from the first letter.
See below examples.
Examples:
thirdLetter("hello there") ==> "hltr"
thirdLetter("technology") ==> "thly"
     */
    String s;

    //String thirdLetter = "";
    public static String thirdLetter(String s) {
        String str = s;
        int count = 0;
        String str1 = "";
        for (int i = 0; i < str.length(); i += 3) {
            str1 += String.valueOf(str.charAt(i));
        }
        return (str1);
    }
    public static void main(String[] args) {
        Mainn thirdLetter = new Mainn();
        System.out.println (thirdLetter("hello there")); //"hltr"
        System.out.println (thirdLetter("technology")); //"thly"

    }

}

