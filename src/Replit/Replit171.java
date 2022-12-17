//package src.Replit;
//
//public abstract class Replit171 {
//
//    public void m1() {
//    }
//
//    String name;
//
//    public void m1(String name) {
//        this.name = name;
//    }
//
//    class Child extends Replit171 {
//        @Override
//        public void m1(String name) {
//            super.m1(name);
//        }
//
//        void print() {
//            System.out.print("m1 with parameters");
//        }
//
//        public void m1() {
//        }
//
//
//        void printInfo() {
//            System.out.print("m1 without parameters");
//        }
//
//        public static void main(String[] args) {
//            Replit171 p = new Child();
//            p.m1();
//            Replit171 a = new Child();
//            a.m1("Java");
//        }
//    }
//}