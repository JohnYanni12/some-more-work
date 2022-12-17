package src.Replit;

public class Main155 {
    static class A {
        public A() {
        }



        void print() {
            System.out.println("I");
        }
    }

    static class B extends A {
        void print1() {
            super.print();
            System.out.println("am");
        }
    }
        static class C extends B {
            C() {
            }

            void print2() {
                super.print1();
                System.out.println("a tester");
            }
        }
    public static void main(String[] args) {
       C c = new C();
        c.print2();
    }
}






