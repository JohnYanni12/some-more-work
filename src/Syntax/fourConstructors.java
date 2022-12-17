package src.Syntax;

public class fourConstructors {

    /*Write a java class that have 4 constructors with 4 different access
    levels of constructors(private,public,default,protected) and create 4 objects of this class:
    1 - inside same class;
    2 - from outside the class;
    3 - from different class inside different package  and observe result.
     */

    public fourConstructors (String fname, int age){
        System.out.println("public");
    }

    private fourConstructors (String dogName){
        System.out.println("private");
    }

    fourConstructors (){
        System.out.println("default");
    }

    protected fourConstructors(boolean isTrue){
        System.out.println("protected");


    }

    public static void main(String[] args) {

        new fourConstructors("john");
        new fourConstructors("john", 89);

        new fourConstructors();
        new fourConstructors(true);
    }
}
