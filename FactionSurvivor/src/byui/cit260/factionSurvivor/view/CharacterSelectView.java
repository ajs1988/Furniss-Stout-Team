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
public class CharacterSelectView {
    private final String MENU = "\n"
            +"\n----------------------------------------"
            +"\n| Character Menu                  |"
            +"\n----------------------------------------"
            +"\nT - Tris (the Brave)"
            +"\nF - Four (the Stern)"
            +"\nC - Christina (the Blunt)"
            +"\nR - Eric (the Douchebag)"
            +"\nN - Natalie (the Mother)"            
            +"\nE - Exit to Main Menu"
            +"\n----------------------------------------";
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
                this.displayTris();
                break;
            case 'F': // Show Character Selection Four
                this.displayFour();
                break;
            case 'C': // Show Character Selection Christina
                this.displayChristina();
                break;
            case 'R': // Show Character Selection Eric
                this.displayEric();
                break;
            case 'N': // Show Character Selection Natalie
                this.displayNatalie();
            case 'E': // Exit to previous menu
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
}

    private void displayTris() {
        System.out.println("*** displayTris() string ***");    }

    private void displayFour() {
        System.out.println("*** displayFour() string ***");
    }

    private void displayChristina() {
        System.out.println("*** displayChristina() string ***");
    }

    private void displayEric() {
        System.out.println("*** displayEric() string ***");
    }

    private void displayNatalie() {
        System.out.println("*** displayNatalie() string ***");
    }
       
}
