//package src.Syntax;
//
//public class UserClass {
//    /*Write program: userClass  that has a constructor that initializes instance
//    variable name and mobile number. Create a subclass  userInfo that will have user
//    address variable and it also being initialized through constructor call.
//    Print users name, mobile number and address in userDetails method. Test your code.*/
//
//    class  UserClass1 {
//       public  String name;
//       public  int num;
//
//        UserClass1(String name, int num) {
//            this.name = name;
//            this.num = num;
//        }
//    }
//    class UserInfo extends UserClass1 {
//
//        String address;
//        UserInfo(String name, int num, String address){
//            super(name, num);
//        }
//    }
//        public void main(String[] args) {
//            UserInfo info = new UserInfo("john", 90);
//        }
//    }