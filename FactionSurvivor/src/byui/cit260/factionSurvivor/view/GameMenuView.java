/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

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
        return false;
        
    }
    

   

    public void doAction(char choice) {
        switch (choice) {
            case 'C': // Open character select menu
                this.displayCharMenu();
                break;
            case 'M': // Open the coordinate entry system
                this.moveToLocation();
                break;
            case 'V': // Open the inventory to view items
                this.viewInventory();
                break;
            case 'S': // Search the current location
                this.searchLocation();
            case 'E': // Exit to main menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void displayCharMenu() {
        CharacterSelectView characterSelectView = new CharacterSelectView();
        characterSelectView.display();
    }

    private void moveToLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void searchLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
