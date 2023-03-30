/* This is a stub for the House class */
import java.util.ArrayList;

/**
 * @author: Nalini Oliver
 * Resources: CSC 120 TA hours on Monday, and ArrayList and Hashtable documentation that Prof Crouser linked on the github assignment.
 */

public class House extends Building {
  private ArrayList<String> residents; 
  private boolean hasDiningRoom;

  /**
   * Extends the House class to the Building Class, and creates variables necessary to run the House class
   * @param hasDiningRoom: Determines whether there is a dining room present in the house (true or false)
   * @param name: Name of the house 
   * @param address: Address of the house 
   * @param nFloors: Number of floors in the house 
   */
  public House(boolean hasDiningRoom, String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }

  /**
   * States whether the house has a dining room 
   * @return: Either "true" or "false" regarding whether the house has a dining room
   */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /**
   * "Gets" the number of residents inside the house based on the size of the previously established array
   * @return: Number of residents, as defined by the size of the array
   */
  public int nResidents() {
    return this.residents.size();
  }

  /**
   * Adds the name of the new resident that has moved in to the house by removing it from the array list
   * @param name: The name of the new resident 
   */
  public void moveIn(String name) {
    this.residents.add(name);
  }

  /**
   * Removes the name of the resident that has moved out of the house by removing it from the array list 
   * @param name: Name of the resident that has moved out 
   */
  public void moveOut(String name) {
    this.residents.remove(name);
  }
  
  /**
   * States whether someone in the house is a resident 
   * @param person: Identifier for specific resident 
   * @return: Either "true" or "false" depending on whether the person is a resident of the house
   */
  public boolean isResident(String person) {
    return this.residents.contains(person);
  }

  /**
   * Creates a new house named Talbot, with the given parameters listed above 
   */

  public static void main(String[] args) {
    House Talbot = new House(false, "talbot", "25 Prospect Street", 4);
  }

}