// Juan Barreras
// CS 2012

//The Main class demonstrates the functions of the Zoo class
// It creates a new Zoo and Displays the initial list of animals
// Then, it adds additional 5 animals using Zoo's addNewAnimals method
// Finally, it displays the new animals in the zoo and counts total animals.
package hw09;
public class Main {
    public static void main(String[] args) {
        // Create a new zoo
        Zoo myZoo = new Zoo();

        // Print the initial list of animals
        System.out.println("Initial list of animals (10 animals):");
        myZoo.printAnimals();
        System.out.println("Total animals: " + myZoo.getAnimalCount());

        // Add new animals to the zoo
        myZoo.addNewAnimals();

        // Print the updated list of animals
        System.out.println("\nAdd 5 Animals(15 animals):");
        myZoo.printAnimals();

        //Print animal count
        System.out.println("Total animals: " + myZoo.getAnimalCount());
    }
}
