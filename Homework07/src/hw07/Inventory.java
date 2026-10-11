// Juan Barreras
// CS 2012 - 06
// L08 - Abstract Classes
// The Inventory Class serves as an inventory of Items and
// is used to create methods in order to display an inventory,
// count a total of items, and calculate total prices of items.

package hw07;
import java.util.ArrayList;

//Inventory class
public class Inventory {
    //Default constructor
    Inventory() {}

    //Displays all items (CDs and Books) by iterating through ArrayList
    public String displayAllItems(ArrayList<Item> items) {
        String result = "";
        int itemCount = 0;
        for (Item item : items) {
            itemCount++;
            result += "\n\nItem #"+itemCount+":"+item.toString();
        }
        return result;
    }

    //Displays all Books by iterating through ArrayList
    public String displayAllBooks(ArrayList<Book> books) {
        String result = "";
        int bookCount = 0;
        for (Book book : books) {
            bookCount++;
            result += "\n\nBook #"+bookCount+":"+book.toString();
        }
        return result;
    }

    //Displays all CDs by iterating through ArrayList
    public String displayAllCDs(ArrayList<CD> cds) {
        String result = "";
        int cdCount = 0;
        for (CD cd : cds) {
            cdCount++;
            result += "\n\nCD #"+cdCount+":"+cd.toString();
        }
        return result;
    }

    //Calculates total cost of all items (CDs and Books) int using getPrice
    public double totalCost(ArrayList<Item> items) {
        double result = 0;
        for (Item item : items) {
            result += item.getPrice();
        }
        return result;
    }

    //Returns number of books by iterating through an ArrayList and using a count integer
    public int numBooks(ArrayList<Book> books) {
        int result = 0;
        for (Book book : books) {
            result++;
        }
        return result;
    }

    //Returns number of CDs by iterating through an ArrayList and using a count integer
    public int numCDs(ArrayList<CD> cds) {
        int result = 0;
        for (CD cd : cds) {
            result++;
        }
        return result;
    }



}
