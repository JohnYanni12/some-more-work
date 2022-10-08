package src.Syntax;

public class Students {

    /*Write a java Class Students that have a constructor
    which takes students name and 3 subject grades. Inside your
    class also have a method to Calculate Average Grade. Test Student class
    for 5 different students with different marks. Your program should print
    an average mark of each students name.
     NOTE: please use different names for instance and local variables.
     */

    public Students(String name, int math, int coding, int reading){



        double avreage = (math + coding + reading) /3;
        System.out.println("students name: " + name +
                ", Average Grade "+avreage);
    }

}
