// Juan Barreras
// CS 2012

//The Zoo class has methods that manipulate an Arraylist
//that acts as a Zoo object. The methods are implemented
// and demonstrated in Main. package hw09;
package hw09;
import java.util.ArrayList;
public class Zoo {
    //Declare ArrayList
    private ArrayList<String> animals;

    public Zoo() {
        // Initial list of 10 animals
        animals = new ArrayList<>();
        animals.add("Giraffe");
        animals.add("Zebra");
        animals.add("Penguin");
        animals.add("Kangaroo");
        animals.add("Panda");
        animals.add("Crocodile");
        animals.add("Flamingo");
        animals.add("Polar Bear");
        animals.add("Koala");
        animals.add("Hippo");
    }

    // Method to print all animals in the zoo
    public void printAnimals() {
        System.out.println("Animals in the Zoo:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }

    // Method to add more animals to the zoo
    public void addNewAnimals() {
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
    }

    public int getAnimalCount() {
        return animals.size();
    }
}
