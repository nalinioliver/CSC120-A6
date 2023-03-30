public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    /**
     * Sets necessary parameters to make a new building, including ways to check to make an input for each parameter is given
     * @param name: Name of the building 
     * @param address: Address of the building
     * @param nFloors: Number of floors of the building 
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * "Gets" the name of the building
     * @return: The name of the building
     */
    public String getName() {
        return this.name;
    }

    /**
     * "Gets" the address of the building
     * @return: The address of the building
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * "Gets" the number of floors of the building
     * @return: The number of floors of the building
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * Creates a string that describes the inputted information for the building
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    /**
     * Creates a new building called ford hall, including the parameters dsescribed above, then prints out this building information
     */

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
