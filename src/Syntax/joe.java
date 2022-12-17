//package src.Syntax;
//
//public class joe {
////
////    public static void main(String[] args) {
////        joe ll = new joe();
////        ll.CensorLetter("iowewercmnwer", 'w');
////      //  System.out.println;
////    }
////    String  aa = "";
////    public String CensorLetter(String a, char b) {
////
////        char[] fro = a.toCharArray();
////        for (int i = 0; i < a.length(); i++) {
////            if (fro[i] == b) {
////            }
////        }
////        return (aa);
////    }
//
//    /*Parent class create 4 methods with different level of access modifiers. In each method print "I am parent public/protected/default/private method".*/
//
//    public void print() {
//        System.out.println("I am parent public method");
//    }
//
//    protected void print1() {
//        System.out.println("I am parent protected method");
//    }
//
//
//    void print2() {
//        System.out.println("I am parent default method");
//    }
//
//   static void print3() {
//        System.out.println("I am parent private method");
//    }
//}
//    class Child extends joe {
//
//        void printInfo() {
//            super.print();
//            super.print1();
//            super.print2();
//            super.print3();
//        }
//    }
//    class Main {
//        public static void main(String[] args) {
//
//            Child c = new Child();
//            c.printInfo();
//        }
//    }