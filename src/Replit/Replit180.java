package src.Replit;

public class Replit180 {
/* Create Class EncapsulationDemo
    create two variable as shown below.
    private String empName=John;
    private int empAge=30;
    Create only getters methods for each variable.
    Print the values of each variable as shown below.
**Expected Output:**
    Employee Name: John
    Employee Age: 30*/

    private String empName="John";
    private int empAge=30;

    public int getEmpAge() {
        return empAge;
    }

    public String getEmpName() {
        return empName;
    }
    void print (){
        System.out.println("Employee Name: "+ empName);
        System.out.println("Employee Age: "+ empAge);
    }
    public static void main(String[] args) {
        Replit180 obj = new Replit180();
        obj.print();
    }
}