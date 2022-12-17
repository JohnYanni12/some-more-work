package src.Class22;
public class JavawordTester {
   public static void main(String[] args) {
       HW []hw = {new JavaFile (),new WordFile(),
               new PdfFile () };
        for ( HW arr:hw) {
            arr.close();
            arr.edit();
            arr.open();
        }



    }
}