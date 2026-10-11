// Juan Barreras
// CS 2012-05
// In Class Exercise 5

// This class serves as a main class which creates two Address and two Person objects
// in order to compare them using the methods in Person and Address.
// it also creates a clonedPerson clone and demonstrates whether the clonedPerson is
// actually cloned using .equals method.
package ica5;
//Main Class
public class Main {
    public static void main(String[] args) {
        // Create Person person1 " John Doe "
        Address address1 = new Address(123, "Maple Street", "Springfield", "IL");
        Person person1 = new Person("John Doe", address1);

        // Create Person person2 " Jane Smith "
        Address address2 = new Address(456, "Oak Avenue", "Shelbyville", "IL");
        Person person2 = new Person("Jane Smith", address2);

        // Print original persons
        System.out.println("Original Persons:");
        System.out.println(person1);
        System.out.println(person2);

        // Clone person1 and display Person
        Person clonedPerson = person1.clone();
        System.out.println("\nCloned Person:");
        System.out.println(clonedPerson);

        // Compare and check equality of person1 and clonedPerson
        System.out.println("\nAre person1 and clonedPerson equal? " + person1.equals(clonedPerson));
        System.out.println("Comparing person1 and person2: " + person1.compareTo(person2));
    }
}