/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

import byui.cit260.factionSurvivor.model.ProgramControl;
import byui.cit260.factionSurvivor.model.Player;
import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class StartProgram {

    public StartProgram() {
    }

    public void startProgram1() {
        //display the banner screen
        this.displayBanner();

        //prompt the player to enter their name and Retrieve the name for the player
        String playerName = this.getPlayerName();

        //Create and save the player object
        Player player1 = ProgramControl.createPlayer(playerName);

        //Display a personalized welcome message
        this.displayWelcomeMessage(player1);

        //Display the Main Menu.
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }

    private void displayBanner() {
        System.out.println("\n\n*******************************************");

        System.out.println("*                                         *"
                + "\n*             Faction Survivor             *"
                + "\n* This is a game made for an escape        *"
                + "\n* In this game you are an outsider dropped *"
                + "\n* into a city divided byfactions and you   *"
                + "\n* need to get out so that you can return to*"
                + "\n* your real home.                          *");

        System.out.println("*                                         *"
                + "\n* You will travel the map of the city      *"
                + "\n* looking for a way to escape and get out  *"
                + "\n* and away from the factions. Collect items*"
                + "\n* and explore the city so that you can find*"
                + "\n* your way out. Different challenges will  *"
                + "\n* be encountered. So be prepared the city  *"
                + "\n* and all those within, are out to get you!*"
                + "\n* Work hard and work fast and you just     *"
                + "\n* might make it out alive.                 *");

        System.out.println("*                                             *"
                + "\n* Good luck to you my friend and we shall  *"
                + "\n* see just how good you really are!        *");

        System.out.println("***********************************************");
    }

    public String getPlayerName() {
        boolean valid = false; //indicates if the name has been retrived
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid name has not been retrieved

            // prompt for the player's name
            System.out.println("Enter the player's name below:");

            //get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            //if the name is invalid (less than two character in length)
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; //and report again

            }
            break;
        }
        return playersName;
    }

    public void displayWelcomeMessage(Player player1) {
        System.out.println("\n\n========================================");
        System.out.println("\tWelcome to the game " + player1.getName());
        System.out.println("\tWe hope you have a lot of fun!");
        System.out.println("============================================");

    }

}
