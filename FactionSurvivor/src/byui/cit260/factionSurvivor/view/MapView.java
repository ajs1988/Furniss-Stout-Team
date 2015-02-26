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
public class MapView {
        do {
        public String getrowInput(String []. args) {
        boolean valid = false; //indicates if the name has been retrived
        String userInput = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        if (userInput.length == 1) {
            // convert strings to numbers
            int rowInput = (Int.valueOf(args[0])).intValue(); 
            
        while (!valid) {//while a valid name has not been retrieved

            // prompt for the player's name
            System.out.println("Enter input:");

            //get the name from the keyboard and trim off the blanks
            userInput = keyboard.nextLine();
            userInput = userInput.trim();

            if ( userInput.length() < 1) {
                System.out.println("Please enter a value");
                continue;
            }
            break;
        }
        return userInput;
        }
        
                public String getcolumnInput() {
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
        
        public void doAction() {
            
        }
            
        }
}
}
}
