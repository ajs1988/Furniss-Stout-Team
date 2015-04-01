/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factionsurvivor;

import byui.cit260.factionSurvivor.model.Actor;
import byui.cit260.factionSurvivor.model.Game;
import byui.cit260.factionSurvivor.model.GrowIt;
import byui.cit260.factionSurvivor.model.InventoryItem;
import byui.cit260.factionSurvivor.model.Location;
import byui.cit260.factionSurvivor.model.Map;
import byui.cit260.factionSurvivor.model.Player;
import byui.cit260.factionSurvivor.model.PrisonCell;
import byui.cit260.factionSurvivor.model.RegularScene;
import byui.cit260.factionSurvivor.model.Safe_Cracker;
import byui.cit260.factionSurvivor.model.Scene;
import byui.cit260.factionSurvivor.model.Service;
import byui.cit260.factionSurvivor.model.Zipline;
import byui.cit260.factionSurvivor.view.StartProgram;
import byui.cit260.factionSurvivor.view.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andy
 */
public class FactionSurvivor {

    private static Game currentGame = null;
    private static Player player1 = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //open character stream files for end user input and output
            FactorSurvivor.inFile = new BufferedReader(new InputStreamReader(System.in));

            FactorSurvivor.outFile = new PrintWriter(System.out, true);
                                                    //System.out may need to be changed to this.console
            String filePath = "log.txt";
            FactionSurvivor.logFile = new PrintWriter(filePath);

        } catch (Exception e) {
            System.out.println(":Exception: " + e.toString() + "\n Cause: " + e.getCause() + "\nMessge: " + e.getMessage());
            // may need to change and call errormessage view display 
        } finally {

            try {
                if (FactionSurvivor.inFile != null) {
                    FactionSurvivor.inFile.close();
                }

                if (FactionSurvivor.outFile != null) {
                    FactionSurvivor.outFile.close();
                }

                if (FactionSurvivor.logFile != null) {
                    FactionSurvivor.outFile.close();
                }

            } catch (IOException ex) {
                System.out.println("Error closing files");
                return; // may need to change to display ErrorView.display() method
            }

        }

//start program view
        //start program view
        StartProgram startProgram = new StartProgram("");

        startProgram.startProgram1();

        try {
            startProgram.display();
        } catch (Throwable te) {
            System.out.println(te.getMessage()); // may need to use ErrorView.display
            te.printStackTrace();               // Gets static error when i try to use ErrorView display
            startProgram.display();
        }

        //connections to other model layer sections
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        FactionSurvivor.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        FactionSurvivor.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        FactionSurvivor.logFile = logFile;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        FactionSurvivor.currentGame = currentGame;
    }

    public static Player getPlayer1() {
        return player1;
    }

    public static void setPlayer1(Player player1) {
        FactionSurvivor.player1 = player1;
    }
}
