// Juan Barreras
// CS 2012 - 05
// L06 - Inheritance
// CIN : 401605188
    /* Monitor is another subclass of PCPart with
    data fields screen size and resolution
     */
package hw05;
//Monitor subclass of PCPart
public class Monitor extends PCPart {
    private String screenSize;
    private String resolution;

    //Constructor for monitor object
    public Monitor(String name, String brand, String partNumber, double price, String screenSize, String resolution) {
        super(name, brand, partNumber, price);
        this.screenSize = screenSize;
        this.resolution = resolution;
    }
    //Return screensize
    public String getScreenSize() {
        return screenSize;
    }
    //Return resolution
    public String getResolution() {
        return resolution;
    }


//Return string representation of a Monitor object
    @Override
    public String toString() {
        return super.toString()+"\nScreen Size: "+screenSize+"\nResolution: "+resolution+"\nPrice: "+getPrice();
    }
}
