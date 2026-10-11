// Juan Barreras
// CS 2012 - 05
// L06 - Inheritance
// CIN : 401605188
    /* Motherboard is a child class of PCPart. it
    has data fields socket and form factor.
     */
package hw05;
//MotherBoard subclass of PCPart
public class MotherBoard extends PCPart {
    private String socket;
    private String formFactor;

    //Constructor for MotherBoard object
    public MotherBoard(String name, String brand, String partNumber, double price, String socket, String formFactor) {
        super(name, brand, partNumber, price);
        this.socket = socket;
        this.formFactor = formFactor;
    }
    //Return socket
    public String getSocket() {
        return socket;
    }
    //Return form factor
    public String getFormFactor() {
        return formFactor;
    }

    //Build and return string representing motherboard object.
    @Override
    public String toString() {
        return super.toString()+"\nSocket: "+socket+"\nFormFactor: "+formFactor+"\nPrice: "+getPrice();
    }
}
