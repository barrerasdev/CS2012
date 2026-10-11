// Juan Barreras
// CS 2012 - 05
// The main class demonstrates our PitBull and Pomeranian
// Classes. It creates a PitBull and a Pomeranian and
// displays their methods and details.
package ICA4;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Create a PitBull
        PitBull pitBull = new PitBull("Fifi", 30.0, 500.0);

        // Call methods on PitBull instance
        System.out.println(pitBull.getName());
        System.out.println(pitBull.getWeightInKg());
        System.out.println(pitBull.bark());
        //Attack and update weight
        pitBull.attack();
        System.out.println("New weight after attack: " + pitBull.getWeightInKg());
        System.out.println(pitBull); // Display PitBull details

        // Create a Pomeranian
        Pomeranian pomeranian = new Pomeranian("Thor", 3.5);

        // Call methods on Pomeranian instance
        System.out.println(pomeranian.getName());
        System.out.println(pomeranian.getWeightInKg());
        //Bark and hunt gopher
        System.out.println(pomeranian.bark());
        pomeranian.huntGopher();
        System.out.println(pomeranian); //Display Pomeranian details
    }
}
