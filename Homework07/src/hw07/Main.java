// Juan Barreras
// CS 2012 - 06
// L08 - Abstract Classes
// The main class demonstrates the functionality of the inventory class as
// well as creates instances of books and cds, adding them to their respective
// ArrayLists in order to be displayed, counted, and calculate cost.

package hw07;
import java.util.ArrayList;

//Main Class
public class Main {
    //Main Method
    public static void main(String[] args) {
        //Call Test Method
        testMethod();
    }
    //Test Method populates and tests the functionality of inventory
    public static void testMethod(){
        //Initialize Inventory
        Inventory inventory = new Inventory();
        //Initialize ArrayLists
        ArrayList<Item> items = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<CD> cds = new ArrayList<>();

        //Create 5 instances of Boooks
        Book book1 = new Book("Don Miguel", "Ruiz", 1997, "The Four Agreements", 12.95, 18, 160, "Amber-Allen Publishing");
        Book book2 = new Book("James", "Clear", 2018, "Atomic Habits", 16.20, 15, 320, "Avery");
        Book book3 = new Book("Robert", "Kiyosaki", 1997, "Rich Dad Poor Dad", 7.99, 22, 336, "Plata Publishing");
        Book book4 = new Book("Robert", "Greene", 1998, "The 48 Laws of Power", 15.99, 11, 452, "Penguin Books");
        Book book5 = new Book("Eckhart", "Tolle", 1997, "The Power of Now", 11.99, 7, 236, "New World Library");

        //Add to items ArrayList
        items.add(book1);
        items.add(book2);
        items.add(book3);
        items.add(book4);
        items.add(book5);

        //Add to books ArrayList
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        //Create 5 instances of a CD object
        CD cd1 = new CD("Kanye", "West", 2016, "The Life of Pablo", 14.99, 38, 66, "GOOD Music");
        CD cd2 = new CD("Playboi", "Carti", 2017, "Playboi Carti", 11.99, 24, 57, "Interscope Records");
        CD cd3 = new CD("Lil Uzi", "Vert", 2020, "Eternal Atake", 13.99, 34, 62, "Atlantic Records");
        CD cd4 = new CD("Travis", "Scott", 2018, "Astroworld", 12.99, 45, 58, "Cactus Jack Records");
        CD cd5 = new CD("Tay", "K", 2017, "SantanaWorld", 9.99, 27, 21, "RCA Records");

        //Add to items ArrayList
        items.add(cd1);
        items.add(cd2);
        items.add(cd3);
        items.add(cd4);
        items.add(cd5);

        //Add to cds ArrayList
        cds.add(cd1);
        cds.add(cd2);
        cds.add(cd3);
        cds.add(cd4);
        cds.add(cd5);

        //Demonstrate all methods from Inventory class
        System.out.println("All Items:"+inventory.displayAllItems(items));
        System.out.println("All Books: "+inventory.displayAllBooks(books));
        System.out.println("All CDs: "+inventory.displayAllCDs(cds));
        System.out.println("\nCost of all items: $"+inventory.totalCost(items));
        System.out.println("Number of Books: "+inventory.numBooks(books));
        System.out.println("Number of CDs: "+inventory.numCDs(cds));

    }
}
