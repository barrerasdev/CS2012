// Juan Barreras
// CS 2012 - 05
// L06 - Inheritance
// CIN : 401605188
    /* HardDrive is a subclass of PCPart, which has the data
    fields type and capacity.
     */
package hw05;
//Child class of PCPart
public class HardDrive extends PCPart{
    //Data fields for HardDrive
    private String type;
    private String capacity;
    //Constructor for HardDrive
    public HardDrive(String name, String brand, String partNumber, double price, String type, String capacity) {
        super(name, brand, partNumber, price);
        this.type = type;
        this.capacity = capacity;
    }
    //Return type of a HardDrive object
    public String getType() {
        return type;
    }
    //Return capacity
    public String getCapacity() {
        return capacity;
    }
    //Returns a string representation of a HardDrive object
    @Override
    public String toString() {
        return super.toString()+"\nType: "+type+"\nCapacity: "+capacity+"\nPrice: "+getPrice();
    }
}
