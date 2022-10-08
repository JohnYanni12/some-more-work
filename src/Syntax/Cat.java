package src.Syntax;

public class Cat {

    private String name;
    private String breed;
    private int age;
    private double weight;


   public Cat(String catName, String catBreed, int catAge, double catWeight) {
      // System.out.println("I don't like cats");
       name = catName;
       age = catAge;
       breed = catBreed;
       weight = catWeight;
   }
    public void ptintInfo(){

        System.out.println("name: " + name+ " breed: "+ breed
        + " age: "+ age + " weight: " + weight);
    }
}
