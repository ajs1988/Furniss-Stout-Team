/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

import byui.cit260.factionSurvivor.control.GameControl;
import byui.cit260.factionSurvivor.model.InventoryItem;
import byui.cit260.factionSurvivor.model.Location;
import byui.cit260.factionSurvivor.model.Map;
import java.util.Scanner;

/**
 *
 * @author Landon
 */
public class GameMenuView extends View {
    
    public GameMenuView(){
        super("\n"
            + "\n-----------------------------------"
            + "\n| Game Menu                       |"
            + "\n-----------------------------------"
            + "\nC - Choose a Character"
            + "\nM - Move to new Location"
            + "\nV - View Inventory"
            + "\nS - Search Location"
            + "\nE - Exit"
            + "\n-----------------------------------");
    }
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'C': // Open character select menu
                this.displayCharMenu();
                break;
            case 'M': // Open the coordinate entry system
                this.displayMap();
                break;
            case 'V': // Open the inventory to view items
                this.viewInventory();
                break;
            case 'S': // Search the current location
                this.searchLocation();
            case 'E': // Exit to main menu
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void displayCharMenu() {
        CharacterSelectView characterSelectView = new CharacterSelectView();
        characterSelectView.display();
    }

    private void displayMap() {
        
        Map map = new Map();
        Location[][] locations = map.getLocations();
        
        System.out.println( "---------------------------------------"
                            +"\n      Welcome to New Gettysburg       "
                            +"\n--------------------------------------"
                            +"\n     |  1 |  2 |  3 |  4 |  5 |");
        
        for (int row = 0; row < 5; row++) {
            System.out.println("-----------------------------------");
            System.out.println(row);
            for (int column = 0; column < 5; column++) {
                // create and initialize new Location object instance
                System.out.println(" | ");
                 // assign the Location object to the current position in array
                Location location = new location();
                locations[row][column] = location;
                    
                    if (Location.getExplored() == true) {
                        
                    }
                   else { 
                        System.out.println("??");
                    }
                    System.out.println(" |");
            }
        }
        System.out.println("-----------------------------------");
    }

    private void viewInventory() {
        // get the sorted list of inventory items for the current game
        InventoryItem[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nInventory Items");
        System.out.println("Description" + "\t" +
                "Required" + "\t" +
                "In Stock");
        
        for (InventoryItem inventoryItem : inventory) {
            // DISPLAY the description, the required amount and amount in stock
            System.out.println(inventoryItem.getDescription() + "\t  " +
                               inventoryItem.getRequiredAmount() + "\t  " +
                               inventoryItem.getQuantityInStock());
        }
    }

    private void searchLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
