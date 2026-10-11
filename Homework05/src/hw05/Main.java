// Juan Barreras
// CS 2012 - 05
// L06 - Inheritance
// CIN : 401605188
    /* In the main class, the objects that have been created are used to
    represent a PC builder program. I initialize Inventory and PC classes
    to create a PC object using the PCParts objects in Inventory. The user
    is prompted with a selection menu in order to add PCPart objects to a
    new PC. While the PC is under the required amount of parts, the user will
    be prompted to continue adding parts. Once enough parts are added, a user
    May display their newly created PC and the total price. If a user wishes
    to end early, they may also exit the program at any time.
     */
package hw05;
import java.util.Scanner;
// Main Class
public class Main {
    static PC pc = new PC();
    static Inventory inventory = new Inventory();
    //PC parts integer counts how many PCParts are created. This is important because
    // if a user tries to display a receipt before having enough PCParts, it will end
    // the program due to NullPointer.
    // It is also important because it allows the program to loop through the Inventory
    // menu and Part selection menu, while preventing the user from adding more than
    // the required amount of objects.
    private static int pcParts;

    public static void main(String[] args) {
        inventory.initializeInventory();
        while (pcParts < 8){
            displayMenu();
            menuChoice();
        }
    }

    //Menu choice gets an input from the user and handles it with getChoice method
    //At this point, we are at the selection menu, EX. 1. Case 2. Motherboard
    //If 1 is chosen, it is sent to getChoice.
    public static void menuChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        getChoice(choice);
    }

    //Get Choice handles the int menuChoice received and puts it through a
    // switch numbered 1-9, representing all the options of the menu.
    public static void getChoice(int i){
        if( i < 10 && i > 0) {
            switch (i) {
                //If user chooses option 1 from menu, display the cases and have user
                //Choose from our 3 options created in Inventory class.
                case 1:
                    inventory.printCases();
                    Scanner scanner1 = new Scanner(System.in);
                    int choice1 = scanner1.nextInt();
                    //After the user chooses a Case, it is added to PC object and a
                    //Confirmation message is given.
                    if(choice1 < 3) {
                        pc.addCase(inventory.getCase(choice1));
                        System.out.println("Case added");
                        pcParts++;
                    }
                    //Since there is only 3 of each object, there needs to be validation
                    else {
                        System.out.println("Invalid Choice");
                    }
                    break;
                    //The same goes for the rest of the PCPart objects
                case 2:
                    inventory.printMotherBoards();
                    Scanner scanner2 = new Scanner(System.in);
                    int choice2 = scanner2.nextInt();
                    if(choice2 < 3) {
                        pc.addMotherBoard(inventory.getMotherBoard(choice2));
                        System.out.println("Mother board added");
                        pcParts++;
                    }
                    else {
                        System.out.println("Invalid Choice");
                    }
                    break;
                case 3:
                    inventory.printProcessors();
                    Scanner scanner3 = new Scanner(System.in);
                    int choice3 = scanner3.nextInt();
                    if(choice3 < 3) {
                        pc.addProcessor(inventory.getProcessor(choice3));
                        System.out.println("Processor added");
                        pcParts++;
                    }
                    else {
                        System.out.println("Invalid Choice");
                    }
                    break;
                case 4:
                    inventory.printVideoCards();
                    Scanner scanner4 = new Scanner(System.in);
                    int choice4 = scanner4.nextInt();
                    if(choice4 < 3) {
                        pc.addVideoCard(inventory.getVideoCard(choice4));
                        System.out.println("Video card added");
                        pcParts++;
                    }
                    break;
                case 5:
                    inventory.printHardDrives();
                    Scanner scanner5 = new Scanner(System.in);
                    int choice5 = scanner5.nextInt();
                    if(choice5 < 3) {
                        pc.addHardDrive(inventory.getHardDrive(choice5));
                        System.out.println("Hard drive added");
                        pcParts++;
                    }
                    else {
                        System.out.println("Invalid Choice");
                    }
                    break;
                case 6:
                    inventory.printMemories();
                    Scanner scanner6 = new Scanner(System.in);
                    int choice6 = scanner6.nextInt();
                    if(choice6 < 3) {
                        pc.addMemory(inventory.getMemory(choice6));
                        System.out.println("Memory added");
                        pcParts++;
                    }
                    else {
                        System.out.println("Invalid Choice");
                    }
                    break;
                case 7:
                    inventory.printMonitors();
                    Scanner scanner7 = new Scanner(System.in);
                    int choice7 = scanner7.nextInt();
                    if(choice7 < 3) {
                        pc.addMonitor(inventory.getMonitor(choice7));
                        System.out.println("Monitor added");
                        pcParts++;
                    }
                    else {
                        System.out.println("Invalid Choice");
                    }
                    break;
                //If the user tries to display their receipt and has the required amount of PCParts,
                //The total price and complete PC object will be printed out, and the program will end
                case 8:
                    if ( pcParts == 7 ){
                        System.out.println("Your New PC: ");
                        System.out.println(pc.toString());
                        System.out.println("\nTotal Price:");
                        System.out.println(pc.computeTotalCost());
                        System.exit(0);
                    }
                    //Validation in case not enough parts
                    else{
                        System.out.println("Add more parts");
                    }
                    break;
                //If the user wants to end the program at any time, they may quit.
                case 9:
                    System.exit(0);
            }
        }
        else {
            System.out.println("Invalid Choice");
        }
    }

    //Method to print out inventory menu
    public static void displayMenu(){
        System.out.println();
        System.out.println(
                "Build your PC, Enter any number to get started" +
                "\n1: Case"+
                "\n2: Motherboard"+
                "\n3: Processor "+
                "\n4: Video Cards"+
                "\n5: Hard Drives"+
                "\n6: Memories"+
                "\n7: Monitors"+
                "\n8: Display Receipt"+
                "\n9: Exit");
    }
}
