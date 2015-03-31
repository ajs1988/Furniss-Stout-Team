/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

import factionsurvivor.FactionSurvivor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andy
 */
public abstract class View implements ViewInterface {

    private String promptMessage;

    protected final BufferedReader keyboard = FactionSurvivor.getInFile();
    protected final PrintWriter console = FactionSurvivor.getOutFile();

    public View(String promptMessage) {

        this.promptMessage = promptMessage;
    }

    public void display() {

        String value = "";
        boolean done = false;

        do {

            System.out.println(this.promptMessage); // display the main menu

            value = this.getInput(); // get the user's selection

            done = this.doAction(value); // do action based on selection

        } while (!done);
    }

    @Override
    public String getInput() {
        boolean valid = false; //indicates if the name has been retrived
        String selection = null;
        //keyboard input stream

        while (!valid) {//while a valid name has not been retrieved

            // prompt for the player's name
            System.out.println("\t\nEnter selection below:");

            try {
                //get the name from the keyboard and trim off the blanks
                selection = this.keyboard.readLine();

            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            selection = selection.trim();
            String number = selection.trim();
            if (selection.length() < 1) {
                System.out.println("\n*** Invalid selection *** Try again");
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
