// Juan Barreras
// CS 2012 - 05
// L06 - Inheritance
// CIN : 401605188
    /* Memory is another subclass of the parent class PCPart.
    It has data fields formFactor and modules.
     */
package hw05;
//Memory subclass of PCPart
public class Memory extends PCPart {
    private String formFactor;
    private String modules;
    //Constructor for Memory object
    public Memory(String name, String brand, String partNumber, double price, String formFactor, String modules) {
        super(name, brand, partNumber, price);
        this.formFactor = formFactor;
        this.modules = modules;
    }
    //Return form factor
    public String getFormFactor() {
        return formFactor;
    }
    //Return modeules
    public String getModules() {
        return modules;
    }

    //Build and return string representing a Memory object
    @Override
    public String toString() {
        return super.toString()+"\nForm Factor: "+formFactor+"\nModules: "+modules+"\nPrice: "+getPrice();
    }
}
