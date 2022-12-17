package src.Syntax;

public class AcssesModifiers {
        /*For you to do:

Please create methods with different access modifiers (one for each access modifier)
 and call them properly in main method one by one
In each method write the logic accordingly like for private method write the logic in the
println Statement as "This is Private Method" accordingly for rest of the methods that have
different access modifiers should be a total of 4 outputs, please make sure they are in the
same order that is printed below.
**Expected Output:**
This is Private Method
This is Default Method
This is Protected Method
This is Public Method
*/

    // String word;

    private void AcssesModifiers1() {
        System.out.println("This is Private Method");
    }

    void AcssesModifiers2() {
        System.out.println("This is Default Method");
    }

    protected void AcssesModifiers3() {
        System.out.println("This is Protected Method");
    }

    public void AcssesModifiers4() {
        System.out.println("This is Public Method");
    }

    String name;
    String city;
    String nameOSchool;
    int batchNumber;

    public void display1(String name, String city, String nameOSchool, int batchNumber) {

        this.batchNumber = batchNumber;
        this.name = name;
        this.city = city;
        this.nameOSchool = nameOSchool;
//        void printInfo() {
            System.out.println("My name is " + name + " and I live in " + city + ". I study at " + nameOSchool + " in batch " + batchNumber);

    }




    public static void main(String [] args) {

                AcssesModifiers obj = new AcssesModifiers();
                obj.AcssesModifiers1();
                obj.AcssesModifiers2();
                obj.AcssesModifiers3();
                obj.AcssesModifiers4();

/*137 For you to do
In main class please declared the variables using different access modifiers that will hold value for:
- name
- city
- name of the school
- batch number
Create a method to display details in following format:
My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_
Assign values to the variables and execute method display
**Expected Output:**
My name is John and I live in Miami. I study at Syntax in batch 9*/

            AcssesModifiers obj1 = new AcssesModifiers();
            obj1.display1("John", "Rochester", "Syntax", 9);

        }
}

