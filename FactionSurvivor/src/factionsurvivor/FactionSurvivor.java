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

        //connections to other model layer sections
        Player player1 = new Player();
        Game game = new Game();
        Map map = new Map();
        Location location = new Location();
        InventoryItem inventory = new InventoryItem();
        PrisonCell prisonCell = new PrisonCell();
        GrowIt growIt = new GrowIt();
        Safe_Cracker safe_Cracker = new Safe_Cracker();
        Scene scene = new Scene();
        Service service = new Service();
        Zipline zipline = new Zipline();
        RegularScene regScene = new RegularScene();

        player1.setName("Four");
        player1.setBestTime(1.00);
        player1.setChallComplete(1);
        player1.setInventItem("bullet");

        game.setTotalTime(5.00);

        map.setColumnCount(2);
        map.setRowCount(4);

        location.setRow(3);
        location.setColumn(1);
        location.setExplored(false);
        location.setAmountRemaining(2);

        inventory.setInventoryType("survival");
        inventory.setQuantityInStock(5);
        inventory.setRequiredAmount(0);
        inventory.setKeyItem("No");

        prisonCell.setRepeat("No");
        prisonCell.setSecretToLeave("Crack");

        zipline.setKeyComplete(10);
        zipline.setKeyComplete(5);

        service.setServiceGiven(2);
        service.setGiveFood(3);

        regScene.setSymbol(7);
        regScene.setType("Water");
        regScene.setTravelTime(2.25);
        regScene.setItem("bullet");
        regScene.setDescription("Wild area");
        regScene.setBlocked(9);

        growIt.setChat1(1);
        growIt.setChat2(2);
        growIt.setChat3(3);
        growIt.setPlantGrow(4);

        scene.setDescription("lost Area");
        scene.setChallenge(6);
        scene.setTravelT(7.00);

        safe_Cracker.setCalc1(20);
        safe_Cracker.setClac2(40);
        safe_Cracker.setClac3(60);
        safe_Cracker.setSafeOpen(5);

        String playerInfo = player1.toString();
        System.out.println(playerInfo);

        String gameInfo = game.toString();
        System.out.println(gameInfo);

        String mapInfo = map.toString();
        System.out.println(mapInfo);

        String locationInfo = location.toString();
        System.out.println(locationInfo);

        String inventoryInfo = inventory.toString();
        System.out.println(inventoryInfo);

        String prisonCellInfo = prisonCell.toString();
        System.out.println(prisonCellInfo);

        String growItInfo = growIt.toString();
        System.out.println(growItInfo);

        String regSceneInfo = regScene.toString();
        System.out.println(regSceneInfo);

        String safe_CrackerInfo = safe_Cracker.toString();
        System.out.println(safe_CrackerInfo);

        String sceneInfo = scene.toString();
        System.out.println(sceneInfo);

        String serviceInfo = service.toString();
        System.out.println(serviceInfo);

        String ziplineInfo = zipline.toString();
        System.out.println(ziplineInfo);

    }
    
    public static InventoryItem[] getSortedInventoryList() {
        // get inventory list for the current game
        InventoryItem[] originalInventoryList =
                FactionSurvivor.getCurrentGame().getInventory();
        
        // clone (make a copy) originalList
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        // using a BubbleSort to sort the list of inventoryList by name
        InventoryItem tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        return inventoryList;
    }
}
