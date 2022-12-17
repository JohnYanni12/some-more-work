package src.Syntax;

public class Hours {
    private String name;
    private String breed;
    int age;
    private  double weight;
     String color;

    /*
            Create a horse class
            have 5 fields of your choice
            create constructor and getter setter methods for this class
            atleast write one coniditon inside setter class
             */
        public Hours (String name, String breed, int age, double weight, String color) {
            setName(name);
            setBreed(breed);
            setAge(age);
            setWeight(weight);
            setColor(color);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name.isEmpty()){
                System.out.println("Name can't be empty");
            }
            else{
                this.name = name;
            }
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            if(breed.length()> 24) {
                System.out.println("Breed must not be more than 24 letters!");
            }
            else{
                this.breed = breed;
            }
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age > 20){
                System.out.println("Age cnn not be greater than 20 years old");
            }
            else if(age < 0){
                System.out.println("Age cnn not be negative ");
            }
            else{
                this.age = age;
            }
        }

        public double getWeight() {
            return weight;
        }
    public void setWeight(double weight) {

            if (weight > 1000){
                System.out.println("Weight can not be greater than 1000 pounds");
            }
            else if(weight < 0){
                System.out.println("Weight cnn not be negative ");
            }
            else{
                this.weight = weight;
            }
    }
            public void setColor(String color) {
                this.color = color;
            }
        public String getColor() {
            return color;
        }
        void print(){
            System.out.println("Hours Name: " + name+ ", Age: " + age + ", Weight: " + 765 + ", Color: " + color + ", and Breed: " + breed  );
        }
    }
class HoursTest{
    public static void main(String[] args) {
        Hours h = new Hours("Bi1ly", "BestBreed", 13, 400, "Black");
        h.print();
       h.getColor();
       h.getAge();

    }

}