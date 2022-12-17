//package src.Replit;
//
//public class Replit164 {
//    class Parent {
//        void hello() {
//            System.out.println("method in Parent class");
//        }
//    }
//    class Child1 extends Parent {
//        void hello() {
//            System.out.println("method in Child1 class");
//        }
//    }
//    class Child2 extends Parent {
//        void hello() {
//            System.out.println("method in Child2 class");
//        }
//    }
//    class Child3 extends Parent {
//        void hello() {
//            System.out.println("method in Child3 class");
//        }
//    }
//    public static void main(String[] args) {
//        Parent c1 = new Child1();
//        Parent c2 = new Child2();
//        Parent c3 = new Child3();
//        Parent[] c = {new Child1(), new Child2(), new Child3()};
//        for (int i = 0; i < c.length; i++) {
//            c[i].hello();
//            c[i].hello();
//            c[i].hello();
//        }
//    }
//}