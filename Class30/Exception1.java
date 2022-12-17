package Class30;

public class Exception1 {

    public static void main(String[] args) {
        try{
            String m = null;
            System.out.println(m.length());
        } catch (NullPointerException f){
            System.out.println("There is an error");
        }

        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        try{
            int [] s = new int[-1];

        }catch(NegativeArraySizeException k){
            System.out.println("Another error");
        }
    }
}
