package src.Syntax;

public class OverloadHw2Programming {
    /*Create a class named 'Programming'. While creating an object of the class,
    if nothing is passed to it, then the message "I love programming languages" should be printed.
    If some String is passed to it, then in place of "programming languages" the value
    variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.*/

 String languages;

 public OverloadHw2Programming (){
  System.out.println("I love programming languages");
 }

    public OverloadHw2Programming (String languages) {
     this.languages = languages;
     System.out.println("I love " + languages);
    }

 public static void main(String[] args) {
new OverloadHw2Programming ();
  new OverloadHw2Programming ( "java");
 }
}
