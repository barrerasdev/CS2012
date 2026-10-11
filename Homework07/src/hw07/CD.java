// Juan Barreras
// CS 2012 - 06
// L08 - Abstract Classes
// CD is a concrete subclass of abstract class Item.
// This class is not abstract because CD objects can be created.
// It introduces two new data fields and Overrides three methods from Item
package hw07;

//Concrete subclass of CD
public class CD extends Item {
    //Data fields for CD
    int runningLength;
    String label;

    //Default constructor
    CD(){
        super();
        runningLength = 1;
        label = "";
    }

    //Constructor which accepts all of Item's parameters + CD's Data fields
    CD(String firstname, String lastname, int year, String title, double price, int quantity, int runningLength, String label) {
        super(firstname, lastname, year, title, price, quantity);
        this.runningLength = runningLength;
        this.label = label;
    }

    //Getter and setter for label
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    //Overridden length method which returns runningLength
    @Override
    public int length() {
        return runningLength;
    }

    //Overridden toString method which returns CD as a String
    @Override
    public String toString() {
        return super.toString()+"\nRunning Length: " + runningLength +" minutes"+ "\nLabel: "+ label;
    }

    //Checks if two CDs are equal by their data fields.
    @Override
    public boolean equals(Object o) {
        if ( o instanceof CD ) {
            CD cd = (CD) o;
            if( name.equals(cd.name) && year == cd.year
                    && title.equals(cd.title) && price == cd.price
                    && quantity == cd.quantity
                    && runningLength == cd.runningLength
                    && label.equals(cd.label)
            ){
                return true;
            }
        }
        return false;
    }
}
