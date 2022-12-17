package src.Replit;

public class Replit179 {

   /* Encapsulation
    Create Class EncapsulationDemo that will have 2 variables empName and empAge;
    Create the getter/setter methods for each variable.
    In Main Class and main method
    Using setter methods assign the values as "Mario" and "32"
    Using getter methods print the values as below outputs.
 **Expected Output:**
    Employee Name: Mario
    Employee Age: 32*/

    String empName;
    int empAge;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
    void print(){
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Age: " + empAge);
    }

    public static void main(String[] args) {
        Replit179 r = new Replit179();

      // r.empName = Mario;
      r.setEmpName("Mario");
      r.setEmpAge(32);
      r.print();
    }
}