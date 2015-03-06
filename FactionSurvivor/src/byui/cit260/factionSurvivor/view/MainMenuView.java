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
public class MainMenuView extends View {

    public MainMenuView(){
     super("\n"
            + "\n-----------------------------------"
            + "\n| Main Menu                       |"
            + "\n-----------------------------------"
            + "\nG - Start New Game"
            + "\nH - How to Play"
            + "\nC - Continue from saved game"
            + "\nS - Save Game"
            + "\nE - Exit"
            + "\n-----------------------------------");
    }
    

    

   @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
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
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(FactionSurvivor.getPlayer1());
        // display the game menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
        //  System.out.println("*** startNewGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
        // System.out.println("*** startExistingGame function called ***");
    }

    private void startExistingGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** displayHelpMenu function called ***");
    }

}
