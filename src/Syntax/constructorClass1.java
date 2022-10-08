package src.Syntax;
public class constructorClass1 {


    /*Write a java class that will have a constructor: one with parameters and second without any parameters.
        Create a separate Test class where you will execute both of the constructors 1 by 1.
         */
//
    private String fName;
    private String lName;
   public constructorClass1(String fName, String lName) {

    System.out.println(fName + lName + " \"With parameters\"");

    }
   public constructorClass1() {
            int num = 1;
       System.out.println(num + " \"Without a parameters\"");


        }
    }
