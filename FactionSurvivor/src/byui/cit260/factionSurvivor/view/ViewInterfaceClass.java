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
public class ViewInterfaceClass {
    public interface ViewInterface{
        
        public void display();
        public String getInput();
        public boolean doAction(Object obj);
    }
    
    public abstract class View implements ViewInterface{
        
        private String promptMessage;
        
        public View(String promptMessage) {
            this.promptMessage = promptMessage;
        }
        
        @Override
        public void display() {
        String value;
        do {

            System.out.println(this.promptMessage); // display the prompt

            value = this.getInput(); // get the user's selection
            this.doAction(value); // get first character of string


        } while (!value.equals("0")); // a selection is not "Exit"
    }
        
        @Override
        public String getInput() {
            
        boolean valid = false; //indicates if the name has been retrived
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid name has not been retrieved

            // prompt for the player's name
            System.out.println("\t\nEnter your selection below:");

            //get the name from the keyboard and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();

            if (selection.length() < 1) {//blank value entered
                System.out.println("***Invalid Selection *** Try again");
                continue;
            }
            
            break;
        }
        return selection;
    }

        public String getPromptMessage() {
            return promptMessage;
        }

        public void setPromptMessage(String message) {
            this.promptMessage = message;
        }
        
        
        }
        
    
    }
