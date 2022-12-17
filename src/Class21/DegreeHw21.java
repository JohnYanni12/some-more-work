package src.Class21;

public class DegreeHw21 {
    /*Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need
     high school diploma"".
     Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override
     method 'getPrerequisite'.
     Call the method by creating an object of each of the three classes.*/

    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}
    class Bachelors extends DegreeHw21 {
    void getPrerequisite() {
            System.out.println("I got a Bachelors degree");
        }
    }
    class Masters extends DegreeHw21 {
        void getPrerequisite() {
            System.out.println("I got a master degree");
        }


    public static void main(String[] args) {
        DegreeHw21 degree = new DegreeHw21();
        degree.getPrerequisite();
        Bachelors degree1 = new Bachelors();
        degree1.getPrerequisite();
        Masters degree2 = new Masters();
        degree2.getPrerequisite();
    }
}