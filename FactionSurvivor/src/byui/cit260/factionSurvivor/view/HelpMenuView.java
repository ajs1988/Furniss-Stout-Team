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
public class HelpMenuView extends View {

    public HelpMenuView(){
    super("\n"
            + "\n-----------------------------------"
            + "\n| Help Menu                       |"
            + "\n-----------------------------------"
            + "\nG - What is the Goal?"
            + "\nM - How to Move"
            + "\nK - Key Items"
            + "\nI - Inventory Help"
            + "\nE - Exit to Main Menu"
            + "\n-----------------------------------");

    }
    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
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
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
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