// Juan Barreras
// CS 2012 - 05
// In Class Exercise 5

// The Person class creates Person objects that are both Cloneable
// and Comparable. It overrides the methods from Cloneable and
// Comparable and uses data fields to represent a person. Address
// objects are a data field attached to Person objects.
package ica5;
// Person implements Cloneable and Comparable
public class Person implements Cloneable, Comparable<Person> {
    //Data fields
    private String name;
    private Address address;

    // Constructor for Person
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Clone Person
    @Override
    public Person clone() {
        try {
            Person cloned = (Person) super.clone();
            cloned.address = address.clone(); // Deep copy of address
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Should never happen
        }
    }

    // Boolean method to compare Person
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Person)) return false;
        Person person = (Person) other;
        return name.equals(person.name) && address.equals(person.address);
    }

    // Override compareTo to compare Person objects
    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.name); // Lexicographic order by name
    }

    // Overriding toString to make Person object into String
    @Override
    public String toString() {
        return name + " resides at " + address;
    }
}

