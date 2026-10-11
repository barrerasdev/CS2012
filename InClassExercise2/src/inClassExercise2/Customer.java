// Juan Barreras
// CS 2012 - 05
// CIN : 401605188
package inClassExercise2;
// Customer class with a data field caloriesAte
public class Customer {
    double caloriesAte;
    //Default Constructor
    public Customer() {}
    //Eat method for pancake
    public void eat(Pancake pancake) {
        System.out.println("Customer has eaten a " +pancake);
        //Adds pancakes calories to caloriesAte
        caloriesAte+=pancake.calories;
    }
    //Eat methhod for Cupcake
    public void eat(Cupcake cupcake) {
        System.out.println("Customer has eaten a "+cupcake);
        //Adds cupcakes calories to caloriesAte
        caloriesAte+=cupcake.calories;
    }
}
