// Juan Barreras
// CS 2012 - 05
// In Class Exercise 5

// The Address Class creates Address objects which we attach to a Person
// Object to represent a Person with a home address. We Override Cloneable
// methods in order to clone Address objects and compare them.
package ica5;
//Address Class implements Cloneable
public class Address implements Cloneable {
    // Data fields
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;
    //Constructor for Address object
    public Address(int streetNumber, String streetName, String city, String state) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }

    // Override clone method to clone Address object
    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should never happen
        }
    }

    // Override equals method to compare Address objects
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Address)) return false;
        Address address = (Address) other;
        return streetNumber == address.streetNumber &&
                streetName.equals(address.streetName) &&
                city.equals(address.city) &&
                state.equals(address.state);
    }

    //Override toString method to display Address as String
    @Override
    public String toString() {
        return streetNumber + " " + streetName + " " + city + ", " + state;
    }
}