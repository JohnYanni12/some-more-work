package src.Replit;

public class Parent151 {
    /*Create a no-argument constructor and include the logic to print "Parent
    Constructor without argument" Create another constructor that takes one
    parameter of integer type called number. include the logic to print the
    value of the number. */
    public Parent151 (){
    }
    void rooor(){
        System.out.println("Parent Constructor without argument");
    }
    int number;
    public Parent151 (int number){
        this.number = number;
    }
    void rooor1(){
        System.out.println( number);
    }
    public static class Child151 extends Parent151 {
        /* Create a Constructor without parameter and include the logic to print
        Child Constructor without argument"
    Overload the constructor by adding one parameter of type integer
    Inside the constructor call the parameterized parent class constructor.*/
        public Child151 (){
        }
        void rooor2(){
            System.out.println("Child Constructor without argument");
        }
        Child151(int number){
            this.number=number;
            super.rooor1();
        }
    }
        public static void main(String[] args) {
            Child151 obj = new Child151();
            Child151 obj1 = new Child151(10);
            obj.rooor();
            obj1.rooor2();
    }
}




