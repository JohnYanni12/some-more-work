import java.util.Scanner;
public class babyName {
    public static void main(String[] args) {
        /*
        Write a program that reads two people's first names and if they expecting boy or girl?
Based on the input suggests a name for a baby: Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
         */
        Scanner sca = new Scanner(System.in);

        System.out.print("Please enter the father's first name: ");
        String Fname =sca.nextLine();

        System.out.print("Please enter the mother's first name: ");
        String Mname =sca.nextLine();

        System.out.print("What are you expecting? boy or girl? : ");
        String gender =sca.nextLine();

        if (gender.equalsIgnoreCase("boy")){
           String FirstHname1 = Fname.substring(0,Fname.length()/2);
           String SecongHname1 = Mname.substring(Mname.length()/2);
            System.out.println("Suggested baby boy name "+ FirstHname1 +SecongHname1 );
        }

        else if (gender.equalsIgnoreCase("girl")) {
            String SecondHname1 = Fname.substring(Fname.length()/2);
            String FirstHname1 = Mname.substring(0, Mname.length()/2);
            System.out.println("Suggested baby girl name " + FirstHname1 + SecondHname1);
        }
    }
}
