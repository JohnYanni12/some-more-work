package src.Replit;

public class Replit150 {
    /*
    1. Create four classes (Person, Employee, Student, Retiree)
* Have properties
For Person: fistname(String)
For Person: lastName(String)
For Person: age(int)
For Employee: salary(int)
For Student: grade(int)
For Retiree: seniorActivity(String)
At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output
Create multilevel inheritance: Person --> Employee --> Student --> Retiree
From your Main class create objects of the Employee, Student and Retiree classes and call the print method.
**Expected Output:**
```
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour
     */
    static class Person {
        String fistname;
        String lastName;
        int age;

        public Person(String fistname, String lastName, int age) {
            this.fistname = fistname;
            this.lastName = lastName;
            this.age = age;
        }
    }
    static class Employee extends Person {
        int salary;

        public Employee(String fistname, String lastName, int age, int salary) {
            super(fistname, lastName, age);
            this.salary = salary;
        }

        public Employee(String fistname, String lastName, int age) {
            super(fistname, lastName, age);
        }


        void printInfo() {
            System.out.println(fistname + " " + lastName + " " + age + " " + salary);
        }
    }
    static class Student extends Employee {
        int grade;
        public Student(String fistname, String lastName, int age) {
            super(fistname, lastName, age);
            grade = 15;
        }

        void printInfo() {
            System.out.println(fistname + " " + lastName + " " + age + " " + grade);
        }
    }
        static class Retiree extends Student {
            String seniorActivity;

            public Retiree(String fistname, String lastName, int age, String seniorActivity) {
                super(fistname, lastName, age);
                this.seniorActivity = seniorActivity;
            }

            void printInfo() {
                System.out.println(fistname + " " + lastName + " " + age + " " + seniorActivity);
            }
        }

    public static void main(String[] args) {
        Employee emp = new Employee("Joe" , "Smith" , 35, 35000 );
        Student stu = new Student("Adam",  "Smith", 15);
        Retiree ret = new Retiree("Frank",  "Smith", 15 ,"tour");
        emp.printInfo();
        stu.printInfo();
        ret.printInfo();
    }
}