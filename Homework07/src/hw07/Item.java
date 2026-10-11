// Juan Barreras
// CS 2012 - 06
// L08 - Abstract Classes
// This is an abstract parent class used to create item objects.
// It is abstract because no Item objects should be created, it
// will only serve as an Inheritance parent class.

package hw07;
//Abstract class Item is a parent class of Book and CD
abstract class Item {
    //Data fields
    String name;
    int year;
    String title;
    double price;
    int quantity;

    //Default Constructor
    Item() {
        name = "John Doe";
        year = 9999;
        title = "Test Title";
        price = 1.00;
        quantity = 10;
    }

    //Constructor which accepts each data field as a parameter
    Item(String firstname, String lastname, int year, String title, double price, int quantity) {
        //Initializes data fields
        this.name = firstname + " " + lastname;
        this.year = year;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    //Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Getter and Setter for year
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //Getter and setter for title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    //Getter and setter for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //Getter and setter for quanitity
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //toString method which returns formatted Item as String
    public String toString(){
        return "\nName: "+name + "\nYear: " + year + "\nTitle " + title + "\nPrice: " + price + "\nQuantity " + quantity;
    }

    //Abstract length method we use in Book and Java which returns integer
    public abstract int length();

    //Overridden abstract equals() method
    @Override
    public abstract boolean equals(Object o);
}
