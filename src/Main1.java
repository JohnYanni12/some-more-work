public class Main1 {

    int batchNum ;
   int year;
   String schoolName;

    public static void main (String [] args) {

        Main1 obj2 = new Main1();

        obj2.year=2021;
        obj2.schoolName = "Syntax";
        obj2.batchNum = 9;
        System.out.println("I am a student of batch " + obj2.batchNum + " studying at "
                + obj2.schoolName + " in the year of " + obj2.year);
}
    }
