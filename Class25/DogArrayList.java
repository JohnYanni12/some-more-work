package Class25;

import java.util.ArrayList;

public class DogArrayList {

    public static void main(String[] args) {

        ArrayList <Dog> dogs = new ArrayList<>();
        //New way(Faster way)
        dogs.add(new Dog("jac", "black", "BullDog"));
        dogs.add(new Dog("tommy", "brown", "German"));
        dogs.add(new Dog("Rex", "yellow", "Husky"));

        //Old Way
/*      Dog dog1 = new Dog("jac", "black", "BullDog");
        Dog dog2 = new Dog("tommy", "brown", "German");
        Dog dog3 = new Dog("Rex", "yellow", "Husky");
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);*/

        System.out.println(dogs);
    }
}
