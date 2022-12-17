//package src.Syntax;
//
//public class Overloaded3forms {
//    /*Create 1 class with a static method that has 3 overloaded forms.
//    Then call each overloaded method with specific arguments and observe result.*/
//    String name;
//    int numOfPage;
//    double prise;
//
//  static void book (String name) {
//      void printInfo (){
//          System.out.println("The book name is: " + name);
//      }
//  }
//    static void book (String name, int numOfPage) {
//        System.out.println( name + " is a great book, and has  " + numOfPage + " pages");
//      }
//    static void book (String name, int numOfbage, double price){
//        System.out.println( name + " is expensive,it cost me "+ price+ " and it is to small");
//      }
//
//    public static void main(String[] args) {
//        Overloaded3forms obj = new Overloaded3forms();
//
//       obj .name ("DTS");
//       obj .numOfPage (130);
//       obj .prise (12.60);
//
//    }
//}