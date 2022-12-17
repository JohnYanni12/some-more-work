package src.Replit;

public class Replit142 {
    /*
     1. Complete the SyntaxTechnologies class:** Include the following class variables: * schoolName(String)
     * batch(int) * year(int) * lastDayOfClass(String) Write two constructors: * non-argument constructor
     * parameterized constructor Create method to display values of instance variables.
     **2. In Main Class:** Create two different objects of the SyntaxTechnologies class using bothconstructors and call display method. **Expected Output:*
     null 0 0 null Syntax 6 2020 07/30/2020*/

    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    Replit142() {
        String schoolName= "Syntax";
        int batch= 6;
        int year= 2020;
        String lastDayOfClass = "07/730/2020";
        }


    Replit142(String schoolName, int batch, int year, String lastDayOfClass) {

        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;

     // public void display {
          //  System.out.println();
       // }
    }
    public static void main(String[] args) {
        Replit142 obj = new Replit142();
        System.out.print(obj.schoolName + " " + obj.year + " " +obj.batch + " "+ obj.lastDayOfClass );
//        System.out.print(obj.batch);
//        System.out.print(obj.lastDayOfClass);
        Replit142 obj1 = new Replit142 ("Syntax", 6,2020,"07/730/2020" );
        System.out.print(obj1.schoolName + " " + obj1.year + " " +obj1.batch + " "+ obj1.lastDayOfClass );
//        System.out.print(obj1.schoolName);
//        System.out.print(obj1.year);
//        System.out.print(obj1.batch);
//        System.out.print(obj1.lastDayOfClass);


    }
}