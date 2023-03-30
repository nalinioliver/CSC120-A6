/* This is a stub for the Cafe class */
/**
 * @author: Nalini Oliver
 * Resources: CSC 120 TA hours on Monday, and ArrayList and Hashtable documentation that Prof Crouser linked on the github assignment.
 */
public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    /**
     * Extends the Cafe class to the Building Class, and creates variables necessary to run the Cafe class
     * @param nCoffeeOunces: Number of coffee ounces left in the cafe
     * @param nSguarPackets: Number of sugar packets left in the cafe
     * @param nCreams: Number of cream containers left in the cafe
     * @param nCups: Number of cups left in the cafe 
     * @param name: Name of the cafe
     * @param address: Address of the cafe
     * @param nFloors: Number of floors of the cafe 
     */
    public Cafe(int nCoffeeOunces, int nSguarPackets, int nCreams, int nCups, String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        System.out.println("You have built a cafe: ☕");
    }

    /**
     * Removes items from inventory everytime a coffee is sold
     * @param size: The number of ounces in the coffee that was sold
     * @param nSugarPackets: The number of sugar packets used in the coffee that was sold
     * @param nCreams: The number of cream containers that were used in the coffee that was sold
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
    }

    /**
     * Creates a new Cafe named cafe neilson, with the given parameters listed above 
     */
    public static void main(String[] args) {
        Cafe Neilson = new Cafe(7, 7, 9, 4, "Neilson", "7 Neilson Drive", 4);
    }
    
}
