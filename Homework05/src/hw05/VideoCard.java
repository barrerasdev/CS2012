// Juan Barreras
// CS 2012 - 05
// L06 - Inheritance
// CIN : 401605188
    /* Video Card is another subclass of the PCPart class.
    It has a memory and clock parameter and another override.
     */
package hw05;
//VideoCard is a subclass of PCPart
public class VideoCard extends PCPart {
    private String memory;
    private String coreClock;
    //Constructor for VideoCard object
    public VideoCard(String name, String brand, String partNumber, double price, String memory, String coreClock) {
        super(name, brand, partNumber, price);
        this.memory = memory;
        this.coreClock = coreClock;
    }
    //Return videocard's memory
    public String getMemory() {
        return memory;
    }
    //return coreclock
    public String getCoreClock() {
        return coreClock;
    }

    //Returns string representation of videoCard object
    @Override
    public String toString() {
        return super.toString()+"\nMemory: "+memory+"\nCoreClock: "+coreClock+"\nPrice: "+getPrice();
    }
}
