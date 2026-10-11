// Juan Barreras
// CS 2012 - 05
// This class is a parent class of Pomeranian and PitBull.
// It allows for the creation of Dogs that can inherit the methods created here.

package ICA4;
// Dog parent class
public class Dog {
    // Dog variables
    private String name;
    private double weightInKg;

    // Constructor for Dog
    public Dog(String name, double weightInKg) {
        this.name = name;
        this.weightInKg = weightInKg;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    // toString method
    @Override
    public String toString() {
        return "Dog{name='" + name + "', weightInKg=" + weightInKg + "}";
    }

    // Bark method to return a bark
    public String bark() {
        return "woof";
    }
}
