// Juan Barreras
// CS 2012 - 05
// CIN : 401605188
package inClassExercise2;
// Cupcake class extends portion and has data fields radius and height with a toString method
public class Cupcake extends Portion {
    double radius;
    double height;
    //Constructor for Cupcake object
    public Cupcake(double radius, double height) {
        this.radius = radius;
        this.height = height;
        // Calories are found by multiplying volume( pi * r^2 * h ) by 4.
        calories = 4 * ( Math.PI * (radius * radius) * height);
    }
    //Getters
    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }
    public double getCalories() {
        return calories;
    }
    //toString method
    @Override
    public String toString(){
        return "Cupcake with a volume of "+(Math.PI * radius * radius * height)+" and "+calories+" calories.";
    }
}
