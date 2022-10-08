public class StringHw1 {

    void hw(){
        System.out.println("Hello World");

    }



    public static void main(String[] args) {
StringHw1 obj = new StringHw1();
obj.hw();


        /*Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters,
print the character in the middle of the String. */
        String word= "April";

        if (!word.isEmpty()) {
            for (int i = 0; i < word.length(); i++) {

                if (word.length()% 2==0)

                    System.out.println(word.charAt (word.length()/2-1));

                else if (word.length()% 2==1)
                {
                    System.out.println(word.charAt (word.length()/2));
                }

            }
        }

            String str="hello";
            int length=str.length();
            if(!str.isEmpty()&&length%2!=0&&length>=3) {

                int middleIndex=length/2;
                System.out.println(str.charAt(middleIndex));
            }



            String name = "dad";
            StringBuilder stringBuilder = new StringBuilder(name);
           StringBuilder name1 = stringBuilder.reverse();
            if (stringBuilder.toString().equals(name)){
            System.out.println("it is palindrome");
        } else{
            System.out.println("it is Not palindrome");
        }

    }
    }
