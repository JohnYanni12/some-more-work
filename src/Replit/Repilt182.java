package src.Replit;

public class Repilt182 {
    /*# Encapsulation
Create the a Person class with the following:
**Class Variables**
- firstname - lastname - birthmonth - birthday - birthyear - String ssn
**Constructor**
The main constructor should take in all values and assign them to their respective private class variables
**Methods**
Create a public getters to access all the variables.
**Create a public method called formatBirthday, which will return a String composed of their birthday in
.mm/dd/yyyy format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"**
*/
    private String firstname, lastname, ssn;
    private int birthmonth, birthday, birthyear;

    public Repilt182(String firstname, String lastname, String ssn, int birthmonth, int birthday, int birthyear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSsn() {
        return ssn;
    }
    public String getFormatBirthday(int birthmonth, int birthday , int birthyear) {

       String str = (birthmonth + "/"+ birthday+ "/"+ birthyear );
        System.out.println(str);
        return str;
    }

        public int getBirthmonth () {
            return birthmonth;
        }

        public int getBirthday () {
            return birthday;
        }

        public int getBirthyear () {
            return birthyear;
        }

    public static void main(String[] args) {
        Repilt182 ob = new Repilt182("John", "Doe", "123-45-6789 ", 10, 25, 1900 );
        //ob.printInfo();
        ob.getLastname();
        System.out.println(ob.getFirstname());
        System.out.println(ob.getLastname());
        ob.getFormatBirthday(10,3,1900);
        System.out.println(ob.getSsn());
    }
}