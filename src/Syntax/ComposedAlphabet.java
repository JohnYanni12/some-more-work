package src.Syntax;

public class ComposedAlphabet {
    /*139 -Create a method that will be available to all classes in your project with following specifications:
Returns: a String Name: alphabetical
Parameters: a String called str
Purpose:
Return a string that is composed of each letter as long as the letter is later on in the composed alphabet
than its previous one.  You can assume actual parameters are lowercase.
See below examples.
Additional Info:
You can use < and > to compare characters (not Strings), where characters later on in the alphabet are "greater".  Examples:
'a' < 'b' ==> True
'a' < 'a' ==> False
'a' > 'b' ==> False
Examples:
alphabetical("hello") ==> "hlo" alphabetical("software") ==> "stwr"
alphabetical("language") ==> "lnug" **Expected Output:** hlo stwr lnug */

 String alphabetical;

 public static String word(String str) {
  String greaterL = "";
  for (int i = 0; i < str.length()-1; i++) {
   //int num = str.length();
   if (str.charAt(i) >= str.charAt(i+1)){
    greaterL = str.charAt(i)+ greaterL;
   }
  }
  return (greaterL);
   }
  public static void main (String[]args){
   System.out.println(word("heloo" ));
  }
 }



