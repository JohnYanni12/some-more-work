package src.Replit;

public class Replit178 {

    private String empName;
    private int empAge;
    public  Replit178 (String empName, int empAge) {
        setEmpName(empName);
        setEmpAge (empAge);

    }
        public void setEmpName (String empName){
            this.empName = empName;
        }

        public void setEmpAge ( int empAge){
            this.empAge = empAge;
        }

        public String getEmpName () {
            return empName;
        }

        public int getEmpAge () {
            return empAge;
        }

        void print(){
            System.out.println("Employee Name: " + empName );
            System.out.println("Employee Age: " + empAge );
        }

    public static void main(String[] args) {
        Replit178 r = new Replit178("John" , 30);

        r.print();

    }
}
