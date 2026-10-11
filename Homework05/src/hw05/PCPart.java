// Juan Barreras
// CS 2012 - 05
// L06 - Inheritance
// CIN : 401605188
    /* The PCPart class is the parent class of the Case, MotherBoard,
     HardDrive, VideoDrive, Processor, Memory, and Monitor subclasses.
     It builds a base object PCPart with four parameters that the
     child classes will inherit. This is hierarchical inheritance,
     because multiple subclasses inherit the PCPart base class.
     */
package hw05;
// Create PCPart parent class
public class PCPart {
    //Create data fields
    private String name;
    private String brand;
    private String partNumber;
    private double price;

    //Constructor for PCPart object
    public PCPart(String name, String brand, String partNumber, double price) {
        this.name = name;
        this.brand = brand;
        this.partNumber = partNumber;
        this.price = price;
    }
    //Returns name
    public String getName() {
        return name;
    }
    //Returns brand
    public String getBrand() {
        return brand;
    }
    //Returns part number
    public String getPartNumber() {
        return partNumber;
    }
    //Returns price
    public double getPrice() {
        return price;
    }

    //Builds and returns a String format of a PCPart object
    @Override
    public String toString() {
        return "Name: "+name+"\nBrand: "+brand+"\nPart#: "+partNumber;
    }
}
