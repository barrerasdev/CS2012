// Juan Barreras
// CS 2012 - 05
// PitBull is a subclass of Dog. It inherits its mehthods and
// Overrides the toString method. It also has a new data field
// for its mouth capacity and a new method to attack.
package ICA4;

// PitBull subclass of Dog
public class PitBull extends Dog {
    // Additional variable
    private double mouthCapacityInGrams;

    // Constructor
    public PitBull(String name, double weightInKg, double mouthCapacityInGrams) {
        super(name, weightInKg);
        this.mouthCapacityInGrams = mouthCapacityInGrams;
    }

    // Getter and Setter for mouthCapacityInGrams
    public double getMouthCapacityInGrams() {
        return mouthCapacityInGrams;
    }

    public void setMouthCapacityInGrams(double mouthCapacityInGrams) {
        this.mouthCapacityInGrams = mouthCapacityInGrams;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "PitBull{name='" + getName() + "', weightInKg=" + getWeightInKg() +
                ", mouthCapacityInGrams=" + mouthCapacityInGrams + "}";
    }

    // Attack method for pitbull
    public void attack() {
        System.out.println(getName() + " rips its victim to shreds with its vicious jaws.");
        // Increase weight by mouthCapacityInGrams converted to kg
        setWeightInKg(getWeightInKg() + mouthCapacityInGrams / 1000);
    }
}
