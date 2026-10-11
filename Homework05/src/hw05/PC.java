// Juan Barreras
// CS 2012 - 05
// L06 - Inheritance
// CIN : 401605188
    /* The PC Class is used to create a PC object using the objects
    created in the package, those objects are subclasses of PCPart,
    therefore we are building a PC object using various unique PCPart
    objects. We also create a method to compute the total cost of
    this PC and to print it out with added objects.
     */
package hw05;
//Create object PC
public class PC {
    //Use Objects we created as data fields ( child classes of PCPart )
    Case tower;
    MotherBoard motherBoard;
    Processor processor;
    VideoCard videoCard;
    HardDrive hardDrive;
    Memory memory;
    Monitor monitor;

    //Create new PC object with empty data fields
    public PC(){
        tower = null;
        motherBoard = null;
        processor = null;
        videoCard = null;
        hardDrive = null;
        memory = null;
        monitor = null;
    }
    //Return Case
    public Case getCase(){
        return tower;
    }
    //Return MotherBoard
    public MotherBoard getMotherBoard(){
        return motherBoard;
    }
    //Return Processor
    public Processor getProcessor(){
        return processor;
    }
    //Return VideoCard
    public VideoCard getVideoCard(){
        return videoCard;
    }
    //Return HardDrive
    public HardDrive getHardDrive(){
        return hardDrive;
    }
    //Return Memory
    public Memory getMemory(){
        return memory;
    }
    //Return Monitor
    public Monitor getMonitor(){
        return monitor;
    }
    //Add a Case to PC
    public void addCase(Case tower){
        this.tower = tower;
    }
    //Add a MontherBoard to PC
    public void addMotherBoard(MotherBoard motherBoard){
        this.motherBoard = motherBoard;
    }
    //Add a Processor to PC
    public void addProcessor(Processor processor){
        this.processor = processor;
    }
    //Add a VideoCard to PC
    public void addVideoCard(VideoCard videoCard){
        this.videoCard = videoCard;
    }
    //Add a HardDrive to PC
    public void addHardDrive(HardDrive hardDrive){
        this.hardDrive = hardDrive;
    }
    //Add a Memory to PC
    public void addMemory(Memory memory){
        this.memory = memory;
    }
    //Add a monitor to PC
    public void addMonitor(Monitor monitor){
        this.monitor = monitor;
    }
    //Compute the total cost by adding each objects price
    public double computeTotalCost(){

        return tower.getPrice()+
                motherBoard.getPrice()
                + processor.getPrice()
                + videoCard.getPrice()
                + hardDrive.getPrice()
                + memory.getPrice()
                + monitor.getPrice();
    }

    //Builds and returns the PC object as a string
    @Override
    public String toString(){
        return "\n"+tower.toString()+"\n\n"
                +motherBoard.toString()+"\n\n"
                +processor.toString()+"\n\n"
                +videoCard.toString()+"\n\n"
                +hardDrive.toString()+"\n\n"
                +memory.toString()+"\n\n"
                +monitor.toString();
    }
}
