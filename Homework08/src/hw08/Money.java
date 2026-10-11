// Juan Barreras
// CS 2012 - 06
// 401605188
package hw08;
//Money Class
public class Money implements Comparable<Money>,Calculable<Money>{
    //Data fields
    public int dollars;
    public int cents;

    //Constructor for Money
    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    //Implementing Calculable's add
    @Override
    public Money add(Money other) {
        if(this.cents + other.cents > 99) {
            int newCents = (this.cents + other.cents)%100;
            int newDollars = this.dollars + other.dollars+(newCents+100)/100;
            return new Money(newDollars, newCents);
        }
        return new Money(this.dollars + other.dollars, this.cents + other.cents);
    }

    //Implementing Calculable's subtract
    @Override
    public Money subtract(Money other) {
        int newDollars;
        int newCents;

        // If cents in 'this' is less than 'other', borrow 1 dollar (i.e., 100 cents)
        if (this.cents < other.cents) {
            newDollars = this.dollars - other.dollars - 1; // Borrow 1 dollar
            newCents = (this.cents + 100) - other.cents;   // Add 100 cents before subtraction
        } else {
            newDollars = this.dollars - other.dollars;     // Normal dollar subtraction
            newCents = this.cents - other.cents;           // Normal cent subtraction
        }

        return new Money(newDollars, newCents);
    }


    // Implementing Comparable''s compareTo
    @Override
    public int compareTo(Money other) {
        if (this.dollars < other.dollars){
            return -1;
        }
        if (this.dollars > other.dollars){
            return 1;
        }
        if (this.cents < other.cents){
            return -1;
        }
        if (this.cents > other.cents){
            return 1;
        }
        return 0;
    }

    // Adding a toString method
    @Override
    public String toString() {
        return String.format("$%d.%02d",dollars,cents);
    }
}
