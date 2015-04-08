/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

import byui.cit260.factionSurvivor.control.GameControl;
import byui.cit260.factionSurvivor.exceptions.MapControlException;
import factionsurvivor.FactionSurvivor;
import java.util.Scanner;

/**
 *
 * @author Landon
 */
public class MainMenuView extends View {

    public MainMenuView() {
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

    public boolean doAction(Object obj) {

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
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        try {
            // create a new game
            GameControl.createNewGame(FactionSurvivor.getPlayer1());
        } catch (MapControlException mce) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " +mce.getMessage());
        }
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        //  System.out.println("*** startNewGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
        // System.out.println("*** startExistingGame function called ***");
    }

    private void startExistingGame() {
        this.console.println("*** saveGame function called ***");
    }

    private void saveGame() {
        System.out.println("\n\nEnter the file path for file where the game"
                + "is to be saved");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(FactionSurvivor.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.diplay("MainMenuView", ex.getMessage());
        }
    }

}
