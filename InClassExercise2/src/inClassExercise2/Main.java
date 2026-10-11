// Juan Barreras
// CS 2012 - 05
// CIN : 401605188
package inClassExercise2;
import java.util.Random;
//Main Class
public class Main {
    // Main method which creates random for randomization and a Customer
    public static void main(String[] args) {
        Random random = new Random();
        Customer customer = new Customer();
        //Counts for pancakes and cupcakes ate
        int cupcakesAte = 0;
        int pancakesAte = 0;
        //Feeds customer while calories are under 10,000
        while (customer.caloriesAte < 10000){
            //Boolean to switch between cupcake and pancake randomly
            boolean eatPancake = random.nextBoolean();
            //Feeds pancake
            if (eatPancake){
                customer.eat(new Pancake(Math.random()*8));
                pancakesAte++;
            }
            //Feeds cupcake
            else{
                customer.eat(new Cupcake((Math.random()*8),Math.random()*1));
                cupcakesAte++;
            }
        }
        // Explodes customer after 10,000 calories
        System.out.println("Customer Exploded after eating "+cupcakesAte+" cupcakes and "+ pancakesAte+" pancakes");

    }
}