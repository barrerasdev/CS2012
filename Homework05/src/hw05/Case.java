// Juan Barreras
// CS 2012 - 05
// L06 - Inheritance
// CIN : 401605188
    /* The Case class is a subclass of PCPart. It inherits the
    parameters of name, brand, part number, and price. There are
    two additional data fields which are unique to Case, type
    and color. In this subclass we introduce method overriding
    with toString, so that anytime a Case object is used with
    .toString, it prints out the original toString from PCPart
    as well as type, color, and Price. This is called run time
    polymorphism and is used in all further subclasses.
     */
package hw05;
//Child class of PCPart
public class Case extends PCPart {
    //Data fields for Case object
    private String type;
    private String color;

    //Constructor for Case object
    public Case(String name, String brand, String partNumber, double price, String type, String color) {
        super(name, brand, partNumber, price);
        this.type = type;
        this.color = color;
    }
    //Return type
    public String getType() {
        return type;
    }
    //Return color
    public String getColor() {
        return color;
    }

    //Builds and returns a String representation of Case object.
    @Override
    public String toString() {
        return super.toString() + "\nType: " + type + "\nColor: " + color + "Price: " + getPrice();
    }
}
