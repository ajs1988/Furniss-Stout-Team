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

/**
 *
 * @author Andy
 */
public class FactionSurvivor {

    private static Game currentGame = null;
    private static Player player1 = null;

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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //start program view
        StartProgram startProgram = new StartProgram("");
        startProgram.startProgram1();
        
        try {
            startProgram.display();
        }
        catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgram.display();
        }

    }
}
