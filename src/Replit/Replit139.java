package src.Replit;

public class Replit139 {
    /* Create a method that will be available to all classes in your project with following specifications:
     Returns: a String Name: alphabetical
     Parameters: a String called str
     Purpose: Return a string that is composed of each letter as long as the letter is later on in the composed
     alphabet than its previous one.  You can assume actual parameters are lowercase.
     See below examples.
     Additional Info: You can use < and > to compare characters (not Strings), where characters later on in the
     alphabet are "greater".  Examples:
             'a' < 'b' ==> True
         'a' < 'a' ==> False
         'a' > 'b' ==> False
     Examples: alphabetical("hello") ==> "hlo" ------ alphabetical("software") ==> "stwr"
     alphabetical("language") ==> "lnug"
     **Expected Output:**```
     hlo
     stwr
     lnug*/
    public static String alphabetical(String str) {

        String newStr = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                newStr = newStr + str.charAt(i);
            }
        }
        System.out.println(newStr);
        return newStr;
    }

    public static void main(String[] args) {
        Replit139 obj = new Replit139();
        obj.alphabetical("Hello");
        obj.alphabetical("software");
        obj.alphabetical("language");
    }
}
