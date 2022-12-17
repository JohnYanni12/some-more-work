package src.Syntax;

public class ReplirMain {

    /*Declare a static variable **number** that will hold an integer value:
Access **number** from the main method and assign value to it.
Create an Object of the class, access **number** in a nonstatic way and assing value of 200.
Print out **number** using class name and using instance
     */


//    public static int num;
//    public ReplirMain (int num){
//
//        this.num = num;
//    }
//    public void printInfo (){
//        System.out.println(num);
//
//    }
//
//    public static void main(String[] args) {
//
//        ReplirMain obj = new ReplirMain(200);
//        obj.printInfo();


    /* Create a variable that will hold the count of all instances of the Main class
        Create 3 Object of the class and print value of the count variable;*/

    int nn;
    int num;
  //  int num1;
    public static int count = 0;

    public int ReplirMain(int nn, int num) {

        this.nn = nn;
        this.num = num;
       // this.num1 = num1;
        count++;
        return count;
    }

public void print(){
    System.out.println(nn + " "+ num);
}

    public static void main(String[] args) {
        ReplirMain obj = new ReplirMain();
        obj.ReplirMain(14,200);
        ReplirMain obj1 = new ReplirMain();
        obj1.ReplirMain(40,90);
        ReplirMain obj3 = new ReplirMain();
        obj3.ReplirMain(401,990);
        System.out.println(ReplirMain.count);
    }
}