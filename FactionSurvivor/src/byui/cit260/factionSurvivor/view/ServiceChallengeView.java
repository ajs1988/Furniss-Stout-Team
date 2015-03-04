/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class ServiceChallengeView {
    private final String MENU = "\n"
            +"\n----------------------------------------"
            +"\n| Service Challenge                  |"
            +"\n----------------------------------------"
            +"\nT - Talk to Tom"
            +"\nA - Talk to Anna"
            +"\nJ - Talk to John"
            +"\nL - Talk to Leader"
            +"\nS - Save Game"            
            +"\nE - Exit to Previous Menu"
            +"\n----------------------------------------";
       void displayServiceMenu() {
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
            
            // prompt for the Player's input
            System.out.println("Enter input:");
            
            //get the input from the keyboard and trim off the blanks
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
            case 'T': // Show character selection Tris
                this.talkTom();
                
                break;
            case 'A': // Show Character Selection Four
                this.talkAnna();
                break;
            case 'J': // Show Character Selection Christina
                this.talkJohn();
                break;
            case 'L': // Show Character Selection Eric
                this.talkLeader();
                break;
            case 'S': // Show Character Selection Natalie
                this.saveGame();             
            
            case 'E': // Exit to previous menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
}

    private void talkTom() {
        System.out.println("*** you talked to Tom ***");
    }

    private void talkAnna() {
        System.out.println("*** you talked to Anna ***");
    }

    private void talkJohn() {
        System.out.println("*** you talked to John ***");
    }

    private void talkLeader() {
        
        
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
}
