/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;
import byui.cit260.factionSurvivor.control.GameControl;
import factionsurvivor.FactionSurvivor;
import java.util.Scanner;

/**
 *
 * @author Landon
 */
public class MainMenuView {
    private final String MENU = "\n"
            +"\n-----------------------------------"
            +"\n| Main Menu                       |"
            +"\n-----------------------------------"
            +"\nG - Start New Game"
            +"\nH - How to Play"
            +"\nC - Continue from saved game"
            +"\nS - Save Game"
            +"\nE - Exit"
            +"\n-----------------------------------";
    void displayMenu() {
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
            
        if (userInput.length() < 1 ) {
            System.out.println("Please enter a value");
                continue;
            }
            break;
        }
        return userInput;
    }
    public void doAction(char choice) {
        switch (choice) {
            case 'G': // create and start a new game
                this.startNewGame();
                break;
            case 'H': // display help menu
                this.displayHelpMenu();
                break;
            case 'C': // continue from saved game
                this.startExistingGame();
                break;
            case 'S': // save the current game
                this.saveGame();
            case 'E': // Exit the program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void startNewGame() {
                // create a new game
        GameControl.createNewGame(FactionSurvivor.getPlayer1());
                // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
      //  System.out.println("*** startNewGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenu();
       // System.out.println("*** startExistingGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** displayHelpMenu function called ***");
    }
    
}
