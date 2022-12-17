package src.Replit;

public class Replit181 {
/*    # Encapsulation
    Create Class Account
    Create the below variables:

- acc_no;
- name;
- email;
- double amount;

    Create the getter/setter methods for each variable. In Main Class and the main method.
    Using setter methods assign the values as:
    acc_no = 7560504000
    name = Sumair
    email = sumair@syntax.com
    amount = 50000.0
    Using getter methods print the values as below output.
**Expected Output:**
            7560504000 Sumair sumair@syntax.com 50000.0*/

    long acc_no;
    String name;
    String email;
    double amount;

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount =amount;
    }

    void print() {
        System.out.println(acc_no + " " + name + " " + email + " " + amount);
    }

    public static void main(String[] args) {
        Replit181 obj = new Replit181();
        obj.acc_no = 7560504000l;
        obj.amount = 50000.0;
        obj.email = "sumair@syntax.com";
        obj.name = "Sumair";

        obj.print();
    }
}