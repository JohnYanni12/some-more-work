import java.util.Scanner;

public class StringHW03 {
            public static void main(String[] args) {
/* Print out the first three characters of each element of the array,
one per line. Note: every array element must be at least 3 characters long.
 */
                String[] name = new String[5];
                Scanner sca = new Scanner(System.in);
                int i;
                System.out.println("Enter 5 names: ");
                for (i = 0; i < name.length; i++) {
                    name [i] = sca.nextLine();
                }
                    System.out.println("The names are: ");
                    for (i = 0; i <name.length; i++) {
                        System.out.println(name[i].substring(0,3));
                    }


//                String word = "We love java";
//                String [] wordSplit = word.split("");
//                for (int i =0; i<= wordSplit.length; i++){
//                    System.out.println(wordSplit.);
//                }
            }
        }