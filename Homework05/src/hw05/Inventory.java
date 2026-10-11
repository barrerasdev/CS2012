// Juan Barreras
// CS 2012 - 05
// L06 - Inheritance
// CIN : 401605188
    /* The Inventory class creates ArrayLists full of PCPart objects
    in order to be chosen from and assigned to a PC object. Using
    ArrayLists of PCPart objects, we can Initialize many PCParts
    and add them to their respective ArrayLists. Finally, we can
    print them out by iterating through the ArrayList with a for
    loop and printing their respective toString methods.
     */
package hw05;
import java.util.ArrayList;
//Inventory Class
public class Inventory {
    //Create ArrayLists of each PCPart object to serve as a selection
    // of different objects for each PCPart object.
    ArrayList<Case>cases;
    ArrayList<MotherBoard>motherBoards;
    ArrayList<Processor>processors;
    ArrayList<HardDrive>hardDrives;
    ArrayList<VideoCard>videoCards;
    ArrayList<Monitor>monitors;
    ArrayList<Memory>memories;

    //Constructor for inventory object
    public Inventory() {
        cases = new ArrayList<>();
        motherBoards = new ArrayList<>();
        processors = new ArrayList<>();
        hardDrives = new ArrayList<>();
        videoCards = new ArrayList<>();
        monitors = new ArrayList<>();
        memories = new ArrayList<>();
    }
    //Initialize 3 different objects for each PCPart
    // and add them to their respective ArrayList.
    public void initializeInventory(){
        // 3 Cases
        Case case1 = new Case("Cooler Master Masterbox",
                "Cooler Master", "MCB-Q300L-KANN-S00",
                44.99,"MicroATX Mini Tower", "Black");
        Case case2 = new Case("In Win D-Frame 2.0",
                "In Win","D-Frame 2.0 BK/GO",
                1199.00,"ATX Full Tower", "Black/Gold");
        Case case3 = new Case("Corsair iCUE 4000X RGB",
                "Corsair","CC-9011205",
                130.99,"ATX Mid Tower","White");
        cases.add(case1);
        cases.add(case2);
        cases.add(case3);

        // 3 MotherBoards
        MotherBoard motherBoard1 = new MotherBoard("Asus TUF Gaming X570-PLUS",
                "Asus","90MB1170-MVAAY0",
                188.99,"AM4","ATX");
        MotherBoard motherBoard2 = new MotherBoard("Gigabyte Z390 AORUS PRO",
                "Gigabyte","GA-Z390-AUROS-PRO-WiFi",
                189.99,"LGA1151","ATX");
        MotherBoard motherboard3 = new MotherBoard("MSI B450M PRO-M2 MAX",
                "MSI","7B84-017R",
                78.98,"AM4","Micro ATX");
        motherBoards.add(motherBoard1);
        motherBoards.add(motherBoard2);
        motherBoards.add(motherboard3);

        // 3 Processors
        Processor processor1 = new Processor("Intel Core i9-9900K",
                "Intel","BX80684I99900K",
                399.99,"3.6 GHz",8);
        Processor processor2 = new Processor("AMD Ryzen 9 3950X",
                "AMD","100-100000051WOF",
                719.99,"3.5 GHz",16);
        Processor processor3 = new Processor("Intel Core i7-5960X",
                "Intel","BX80648I75960X",
                799.99,"3 GHz",8);
        processors.add(processor1);
        processors.add(processor2);
        processors.add(processor3);

        // 3 VideoCards
        VideoCard videoCard1 = new VideoCard("GeForce RTX 3090",
                "NVIDIA","900-1G136-2510-000",
                1499.99,"24 GB","1396 MHz");
        VideoCard videoCard2 = new VideoCard("Titan V",
                "NVIDIA","900-1G500-2500-000",
                2756.99,"12GB","1200 MHz");
        VideoCard videoCard3 = new VideoCard("Radeon RX 5700 XT",
                "Radeon","RX 5700 XT 8G",
                449.99,"8 GB","1605 MHz");
        videoCards.add(videoCard1);
        videoCards.add(videoCard2);
        videoCards.add(videoCard3);

        // 3 HardDrives
        HardDrive hardDrive1 = new HardDrive("Samsung 970 Evo 1 TB",
                "Samsung","MZ-V7E1T0BW",
                168.28,"SSD","1 TB");
        HardDrive hardDrive2 = new HardDrive("Seagate BarraCuda",
                "Seagate","ST1000DM010",
                49.99, "7200RPM","1 TB");
        HardDrive hardDrive3 = new HardDrive("Western Digital Blue",
                "Western Digital","ABC-000-003",
                49.99,"5400RPM","2 TB");
        hardDrives.add(hardDrive1);
        hardDrives.add(hardDrive2);
        hardDrives.add(hardDrive3);

        // 3 Memory objects
        Memory memory1 = new Memory("Corsair Vengeance RGB",
                "Corsair","CMW32GX4M2C3200C16",
                131.99,"288-pin DIMM","2 x 16 GB");
        Memory memory2 = new Memory("Crucial Ballistix 16 GB",
                "Crucial","BL2K8G32C16U4B",
                59.99,"288-pin DIMM","2 x 8 GB");
        Memory memory3 = new Memory("Samsuing 8 GB",
                "Samsung","MV-34G3D/US",
                306.46,"240-pin DIMM","2 x 4 GB");
        memories.add(memory1);
        memories.add(memory2);
        memories.add(memory3);

        // 3 Monitors
        Monitor monitor1 = new Monitor("Samsung U28E590D",
                "Samsung","U28E590D",
                357.68,"28\"","3840 x 2160");
        Monitor monitor2 = new Monitor("Razer RAPTOR 27",
                "Razer","RZ39-02760-R3UI1",
                699.99,"27\"","2560 x 1440");
        Monitor monitor3 = new Monitor("Samsung C49RG9",
                "Samsung","LC49RG90SSNXZA",
                1199.99,"49\"","5120 x 1440");
        monitors.add(monitor1);
        monitors.add(monitor2);
        monitors.add(monitor3);
    }

    //Return a Case at a given index
    public Case getCase(int index) {
        return cases.get(index);
    }
    //Return a MotherBoard at a given index
    public MotherBoard getMotherBoard(int index) {
        return motherBoards.get(index);
    }
    //Return a Processor at a given index
    public Processor getProcessor(int index) {
        return processors.get(index);
    }
    //Return a VideoCard at a given index
    public VideoCard getVideoCard(int index) {
        return videoCards.get(index);
    }
    //Return a HardDrive at a given index
    public HardDrive getHardDrive(int index) {
        return hardDrives.get(index);
    }
    //Return a Memory at a given index
    public Memory getMemory(int index) {
        return memories.get(index);
    }
    //Return a Monitor at a given index
    public Monitor getMonitor(int index) {
        return monitors.get(index);
    }
    // Iterate through ArrayList and print each object
    public void printCases(){
        for (Case c : cases){
            System.out.println(c.toString());
            System.out.println();
        }
    }
    // Iterate through ArrayList and print each object
    public void printMotherBoards(){
        for (MotherBoard mb : motherBoards){
            System.out.println(mb.toString());
            System.out.println();
        }
    }
    // Iterate through ArrayList and print each object
    public void printProcessors(){
        for (Processor p : processors){
            System.out.println(p.toString());
            System.out.println();
        }
    }
    // Iterate through ArrayList and print each object
    public void printVideoCards(){
        for (VideoCard v : videoCards){
            System.out.println(v.toString());
            System.out.println();
        }
    }
    // Iterate through ArrayList and print each object
    public void printHardDrives(){
        for (HardDrive h : hardDrives){
            System.out.println(h.toString());
            System.out.println();
        }
    }
    // Iterate through ArrayList and print each object
    public void printMemories(){
        for (Memory m : memories){
            System.out.println(m.toString());
            System.out.println();
        }
    }
    // Iterate through ArrayList and print each object
    public void printMonitors(){
        for (Monitor m : monitors){
            System.out.println(m.toString());
            System.out.println();
        }
    }
}
