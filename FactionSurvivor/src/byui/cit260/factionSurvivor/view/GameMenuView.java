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
public class GameMenuView {
    
        private final String MENU = "\n"
            + "\n-----------------------------------"
            + "\n| Game Menu                       |"
            + "\n-----------------------------------"
            + "\nC - Choose a Character"
            + "\nM - Move to new Location"
            + "\nV - View Inventory"
            + "\nS - Search Location"
            + "\nE - Exit"
            + "\n-----------------------------------";


    void displayGameMenu() {
            char selection = ' ';
        do {

            System.out.println(MENU); // display the main menu

            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string

            this.doAction(selection); // do action based on selection

        } while (selection != 'E'); // a selection is not "Exit"
    }

    public String getInput() {
        boolean valid = false; //indicates if the name has been retrived
        String userInput = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid name has not been retrieved

            // prompt for the player's name
            System.out.println("Enter input:");

            //get the name from the keyboard and trim off the blanks
            userInput = keyboard.nextLine();
            userInput = userInput.trim();

            if (userInput.length() < 1) {
                System.out.println("Please enter a value");
                continue;
            }
            break;
        }
        return userInput;
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
        characterSelectView.displayCharMenu();
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
