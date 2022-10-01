public class StringHw1 {

    public static void main(String[] args) {
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

        }
    }
