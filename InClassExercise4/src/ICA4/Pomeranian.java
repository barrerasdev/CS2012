// Juan Barreras
// CS 2012 - 05
// Pomeranian is a subclass of Dog. It inherits its methods and
// Overrides them to create a unique Dog. It also has a new method
// to hunt a gopher.
package ICA4;

// Pomeranian subclass of Dog
public class Pomeranian extends Dog {
    // Constructor for Pomeranian
    public Pomeranian(String name, double weightInKg) {
        super(name, weightInKg);
    }

    // Overriding bark method
    @Override
    public String bark() {
        return "yap yap yap";
    }

    // huntGopher method to hunt a gopher
    public void huntGopher() {
        System.out.println(getName() + " digs into gopher burrow in single minded quest of prey.");
    }
}
