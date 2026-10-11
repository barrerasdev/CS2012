// Juan Barreras
// CS 2012 - 05
// CIN : 401605188
package inClassExercise2;
// Pancake class which extends portion and has data field radius
public class Pancake extends Portion{
    double radius;
    //Constructor for Pancake object
    public Pancake(double radius) {
        // It finds calorie count of a Pancake by doing 10 * area of pancake(pi * radius ^ 2)
        calories = (10 * (Math.PI * (radius * radius)));
        this.radius = radius;
    }
    //Getters
    public double getRadius() {
        return radius;
    }
    public double getCalories(){
        return calories;
    }
    //ToString method
    @Override
    public String toString(){
        return "Pancake with radius of "+radius+" and "+calories+" calories.";
    }
}
