package src;
public class MaxLength {
    /*140 -Create the maxLength method that will accept String array
    of words and return the word with the largest length.
Method should visible only within same package!
**Expected Output:**
this is long*/
    String word1;
    String word2;
    String word3;
    String word4;

    public  String Max(String word1, String word2, String word3, String word4) {

        this.word1 = word1;
        this.word2 = word2;
        this.word3 = word3;
        this.word4 = word4;
        String maxLength = "";
        for (int i = 0; i < word2.length(); i++) {
            if (word1.length() > word2.length() && word1.length() > word3.length()
                    && word1.length() > word4.length()) {
                maxLength = word1;
            }
               else if (word2.length() > word1.length() && word2.length() > word3.length()
                    && word2.length() > word4.length()) {
                maxLength = word2;
            }
            else if (word3.length() > word1.length() && word3.length() > word2.length()
                    && word3.length() > word4.length()) {
                maxLength = word3;
            }
                else{
                    maxLength = word4;
                }

            }
        return (maxLength);
        }
     public static void main(String[] args) {
        MaxLength obj = new MaxLength();
         //String[] MaxLength = {};
        System.out.println(obj.Max("hey", "yolo", "hi", "this is long"));
          //should print "this is long"
     }
}
