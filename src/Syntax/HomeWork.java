package src.Syntax;

public class HomeWork {

    /*Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */

    String name;
    String address;

    public HomeWork(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Address: " + address);
    }

    public static void main(String[] args) {

        HomeWork obj = new HomeWork("john Yanni", "1234 my street, SW");

        obj.displayInfo();
    }

        }



