package src.Replit;

public class Replit145 {

String dogName;
double dogWeight;
static String dogBreed = "Mutt";

    Replit145(String dogName, double dogWeight,String dogBreed ){
       this.dogName = dogName;
       this.dogWeight = dogWeight;
    }

    Replit145(String dogName,double dogWeight){
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }
    void printInfo(){
        System.out.println(dogName + " " + dogBreed + " "+dogWeight);
    }

    public static void main(String[] args) {
        Replit145 obj = new Replit145("Tarzan", 50, dogBreed);
        obj.printInfo();
        Replit145 obj1 = new Replit145("Lucy", 10, dogBreed);
        obj1.printInfo();
    }
}