package src.Replit;

public class Replit149 {
/*1. Create Three classes (Main, A, B):
Have a method that prints out the following
For A:  "Class A"  For B:  "Class B"    Make B extend A
From your Main class create an object of the B class and call the methods. */

    static class A {
        void A() {
            System.out.println("Class A");
        }
    }
     static class B extends A {

        void printInfo() {
            super.A();


            System.out.println("Class B");
        }
    }
        public static void main(String [] args) {
            B b = new B();
            b.printInfo();
        }
    }
