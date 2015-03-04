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
public class HelpMenuView {

    private final String MENU = "\n"
            + "\n-----------------------------------"
            + "\n| Help Menu                       |"
            + "\n-----------------------------------"
            + "\nG - What is the Goal?"
            + "\nM - How to Move"
            + "\nK - Key Items"
            + "\nI - Inventory Help"
            + "\nE - Exit to Main Menu"
            + "\n-----------------------------------";

    void displayHelpMenu() {
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
            case 'G': // what is the goal?
                this.displayGoal();
                break;
            case 'M': // display help menu
                this.displayMoveInstruct();
                break;
            case 'K': // continue from saved game
                this.displayListKey();
                break;
            case 'I': // save the current game
                this.displayInventoryHelp();
            case 'E': // Exit to main menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void displayGoal() {
        System.out.println("*** displayGoal() string ***");
    }

    private void displayMoveInstruct() {
        System.out.println("*** displayMoveInstruct() string ***");
    }

    private void displayListKey() {
        System.out.println("*** displayListKey() string ***");
    }

    private void displayInventoryHelp() {
        System.out.println("*** displayInventoryHelp() string ***");
    }
}