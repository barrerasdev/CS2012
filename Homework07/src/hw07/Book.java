// Juan Barreras
// CS 2012 - 06
// L08 - Abstract Classes
// Book is a concrete subclass of abstract class Item.
// This class is not abstract because Book objects can be created.
// It introduces two new data fields and Overrides three methods from Item
package hw07;

//Concrete subclass of Item
public class Book extends Item {
    //Data fields for Book item
    int numPages;
    String publisher;

    //Default constructor
    Book(){
        super();
        numPages = 1;
        publisher = "Default Publishing";
    }
    //Constructor which accepts all of Item's parameters + Book's Data fields
    Book(String firstname, String lastname, int year, String title, double price, int quantity, int numPages, String publisher) {
        super(firstname, lastname, year, title, price, quantity);
        this.numPages = numPages;
        this.publisher = publisher;
    }

    //Getter and Setter for publisher
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    //Overridden length method which returns numPages of a Book
    @Override
    public int length() {
        return numPages;
    }

    //Overridden toString method which represents a Book item as a string
    @Override
    public String toString() {
        return super.toString()+"\nNumber of Pages: "+numPages+"\nPublisher: "+publisher;
    }

    //Overridden equals method which checks if two books are equal by their data fields.
    @Override
    public boolean equals(Object o) {
        if ( o instanceof Book ) {
            Book book = (Book) o;
            if( name.equals(book.name) && year == book.year
                && title.equals(book.title) && price == book.price
                && quantity == book.quantity
                && numPages == book.numPages
                && publisher.equals(book.publisher)
            ){
                return true;
             }
        }
        return false;
    }
}
