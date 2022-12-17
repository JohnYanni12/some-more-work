package src.Replit;

public class Repilt166 {
//    /*Create a class Animal in which define instance variable type, constructor
//    that will initialize instance variables and 2 methods eat and sleep.
//Create a subclass Cat in which override method sleep
//Create 3 Kitten subclasses of a Cat class and override method eat
//for 1 kitten - eats milk
//for 2 kitten - eats snack
//for 3 kitten - eats everything
//In main method create object of Cat class and all 3 kittens classes and store
//into an array of Animals. Call available methods:
//**Expected Output:**
//Cat eats
//Cat sleeps a lot
//kitten1 eats milk
//kitten1 sleeps a lot
//kitten2 eats snacks
//kitten2 sleeps a lot
//kitten3 eats everything
//     */
//    void eat(){
//        System.out.println("Cat eats");
//    }
//    void sleep() {
//     System.out.println("Cat sleep a lot");
//    }
//}
//class Cat extends Repilt166{
//    void eat(){
//        super.eat();
//    }
//    void sleep() {
//        super.sleep();
//       // System.out.println("Cat sleeps a lot");
//    }
//}
//class kitten1 extends Cat {
//    void eat() {
//        System.out.println("kitten1 eats milk");
//    }
//    void sleep() {
//        System.out.println("kitten1 sleeps a lot");
//    }
//}
//class kitten2 extends Cat{
//    void eat(){
//        System.out.println("kitten2 eats snacks");
//    }
//    void sleep() {
//        System.out.println("kitten2 sleeps a lot");
//    }
//}
//class kitten3 extends Cat {
//    void eat() {
//        System.out.println("kitten3 eats everything");
//    }
//    public static void main(String[] args) {
//        Cat[] c = {new Cat(), new kitten1(), new kitten2(), new kitten3()};
//        for (int i = 0; i < c.length; i++) {
//            c[i].eat();
//            c[i].sleep();
//        }
//    }

   /* Create an instance final method that will reverse a String and return
   that new String Call method from the main method */

//    public static void main(String[] args) {
//
//
//        final String word = "hello";
//        StringBuilder word1 = new StringBuilder(word);
//        word1.reverse();
//        System.out.println(word1);


//    public final void display(){
//        String word = "hello";
//        StringBuilder word1 = new StringBuilder(word);
//        word1.reverse();
//        System.out.println(word1);
//   }
//   public static void main(String[] args) {
//       Repilt166 obj = new Repilt166();
//       obj.display();

    //  }
//    static final double avgElements(int[] a) {
//        double sum = 0;
//        double avg = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//            avg = sum / a.length;
//        }
//            return (avg);
//    }
//    public static void main(String[] args) {
//        Repilt166 obj = new Repilt166();
//        int[] a = {2, 7, 3, 8, 4};
//        System.out.println(avgElements(a)); //should print 4.8

//    boolean isEmpty;
//    public final boolean Repilt166(){
//        String a = null;
//        if(a.isEmpty());
//        this.isEmpty=isEmpty;
//        return isEmpty;
//    }
//    void printIndfo(){
//        System.out.println("Final method with boolean parameter");
//    }
//
//    String word;
//    public final String Repilt166(String word) {
//        this.word=word;
//        return word;
//    }
//    void printIndfo1(){
//        System.out.println("Final method with String parameter");
//    }
//
//    public static void main(String[] args) {
//
//        Repilt166 obj = new Repilt166();
//        obj.printIndfo1( );
//        Repilt166 obj1 = new Repilt166( );
//        obj1.printIndfo( );
//    }


    static int number;
    public static void main(String []args ) {
        Repilt166 m = new Repilt166();
        m.number=200;
        System.out.println(Repilt166.number);
        System.out.println(m.number);
}
//static int number;
//    public static void main(String[]args){
//        Repilt166 display=new Repilt166();
//        display .number=200;
//        System.out.println(Repilt166.number);
//        System.out.println(display.number);
//    }
}
