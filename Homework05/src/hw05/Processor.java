// Juan Barreras
// CS 2012 - 05
// L06 - Inheritance
// CIN : 401605188
    /*Processor is another subclass of PCPart, and it
    has coreClock and coreCount data fields.
     */
package hw05;
// Processor is a subclass of PCPart
public class Processor extends PCPart{
    private String coreClock;
    private int coreCount;
    //Constructor for Processor object
    public Processor(String name, String brand, String partNumber, double price, String coreClock, int coreCount) {
        super(name, brand, partNumber, price);
        this.coreClock = coreClock;
        this.coreCount = coreCount;
    }
    //Return coreclock
    public String getCoreClock() {
        return coreClock;
    }
    //Return coure count
    public int getCoreCount() {
        return coreCount;
    }

    //Returns string representation of Processor object
    @Override
    public String toString() {
        return super.toString() + "\nCore Clock: " + coreClock + "\nCore Count: " + coreCount+"\nPrice: "+getPrice();
    }
}
