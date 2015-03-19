/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.control;

import byui.cit260.factionSurvivor.model.Game;
import byui.cit260.factionSurvivor.model.InventoryItem;
import byui.cit260.factionSurvivor.model.Item;
import byui.cit260.factionSurvivor.model.Location;
import byui.cit260.factionSurvivor.model.Player;
import byui.cit260.factionSurvivor.model.Scene;
import byui.cit260.factionSurvivor.model.sceneType;
import factionsurvivor.FactionSurvivor;

/**
 *
 * @author Andy
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game(); // create new game
        FactionSurvivor.setCurrentGame(game); // save in Faction Survivor

        game.setPlayer(player); // save player in game

        //create the inventory list and save in the game
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);

        Map map = MapControl.createMap(); // create and initialize new map, mapcontrol function stil needs to be created
        game.setMap(map);

        //Move actors to starting position on the map
        MapControl.moveActorsToStartingLocation(map);
    }

    public static InventoryItem[] createInventoryList() {
        InventoryItem[] inventory
                = new InventoryItem[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem rope = new InventoryItem();
        rope.setDescription("Rope");
        rope.setQuantityInStock(0);
        rope.setRequiredAmount(0);
        inventory[Item.rope.ordinal()] = rope;
        
        InventoryItem harness = new InventoryItem();
        harness.setDescription("Harness");
        harness.setQuantityInStock(0);
        harness.setRequiredAmount(0);
        inventory[Item.harness.ordinal()] = harness;
        
        InventoryItem brake = new InventoryItem();
        brake.setDescription("Brake Mechanism");
        brake.setQuantityInStock(0);
        brake.setRequiredAmount(0);
        inventory[Item.brake.ordinal()] = brake;
        
        InventoryItem anchor = new InventoryItem();
        anchor.setDescription("Anchor");
        anchor.setQuantityInStock(0);
        anchor.setRequiredAmount(0);
        inventory[Item.anchor.ordinal()] = anchor;
        
        InventoryItem seeds = new InventoryItem();
        seeds.setDescription("Seeds");
        seeds.setQuantityInStock(0);
        seeds.setRequiredAmount(0);
        inventory[Item.seeds.ordinal()] = seeds;
        
        InventoryItem water = new InventoryItem();
        water.setDescription("Water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[Item.water.ordinal()] = water;
        
        InventoryItem fertilizer = new InventoryItem();
        fertilizer.setDescription("Fertilizer");
        fertilizer.setQuantityInStock(0);
        fertilizer.setRequiredAmount(0);
        inventory[Item.fertilizer.ordinal()] = fertilizer;
        
        InventoryItem light = new InventoryItem();
        light.setDescription("Light");
        light.setQuantityInStock(0);
        light.setRequiredAmount(0);
        inventory[Item.light.ordinal()] = light;
        
        InventoryItem shovel = new InventoryItem();
        shovel.setDescription("Shovel");
        shovel.setQuantityInStock(0);
        shovel.setRequiredAmount(0);
        inventory[Item.shovel.ordinal()] = shovel;
        
        InventoryItem astones = new InventoryItem();
        astones.setDescription("Abnegation Stones");
        astones.setQuantityInStock(0);
        astones.setRequiredAmount(1);
        inventory[Item.astones.ordinal()] = astones;
        
        InventoryItem cscales = new InventoryItem();
        cscales.setDescription("Candor Scales");
        cscales.setQuantityInStock(0);
        cscales.setRequiredAmount(1);
        inventory[Item.cscales.ordinal()] = cscales;
        
        InventoryItem ewater = new InventoryItem();
        ewater.setDescription("Erudite Water");
        ewater.setQuantityInStock(0);
        ewater.setRequiredAmount(1);
        inventory[Item.ewater.ordinal()] = ewater;
        
        InventoryItem dflame = new InventoryItem();
        dflame.setDescription("Dauntless Flame");
        dflame.setQuantityInStock(0);
        dflame.setRequiredAmount(1);
        inventory[Item.dflame.ordinal()] = dflame;
        
        InventoryItem aplant = new InventoryItem();
        aplant.setDescription("Amity Plant");
        aplant.setQuantityInStock(0);
        aplant.setRequiredAmount(1);
        inventory[Item.aplant.ordinal()] = aplant;
        
        return inventory;     
    }
    
    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location [][] locations = map.getlocations();
        
        //start point
        locations[0][0].setScene(scenes[sceneType.dauntless.ordinal()]);
        locations[0][1].setScene(scenes[sceneType.street.ordinal()]);
        locations[0][2].setScene(scenes[sceneType.park.ordinal()]);
        locations[0][3].setScene(scenes[sceneType.forest.ordinal()]);
        locations[0][4].setScene(scenes[sceneType.citygate.ordinal()]);
        
        locations[1][0].setScene(scenes[sceneType.street.ordinal()]);
        locations[1][1].setScene(scenes[sceneType.prisoncell2.ordinal()]);
        locations[1][2].setScene(scenes[sceneType.candorhq.ordinal()]);
        locations[1][3].setScene(scenes[sceneType.prisoncell1.ordinal()]);
        locations[1][4].setScene(scenes[sceneType.alley.ordinal()]);
        
        locations[2][0].setScene(scenes[sceneType.meetinghouse.ordinal()]);
        locations[2][1].setScene(scenes[sceneType.street.ordinal()]);
        locations[2][2].setScene(scenes[sceneType.erudite.ordinal()]);
        locations[2][3].setScene(scenes[sceneType.busstop.ordinal()]);
        locations[2][4].setScene(scenes[sceneType.park.ordinal()]);
        
        locations[3][0].setScene(scenes[sceneType.trainstation.ordinal()]);
        locations[3][1].setScene(scenes[sceneType.alley.ordinal()]);
        locations[3][2].setScene(scenes[sceneType.house.ordinal()]);
        locations[3][3].setScene(scenes[sceneType.street.ordinal()]);
        locations[3][4].setScene(scenes[sceneType.abnegation.ordinal()]);
        
        locations[4][0].setScene(scenes[sceneType.forest.ordinal()]);
        locations[4][1].setScene(scenes[sceneType.street.ordinal()]);
        locations[4][2].setScene(scenes[sceneType.amity.ordinal()]);
        locations[4][3].setScene(scenes[sceneType.house.ordinal()]);
        locations[4][4].setScene(scenes[sceneType.meetinghouse.ordinal()]);

        
        
        
    }
    public static InventoryItem[] getSortedInventoryList() {
        // get inventory list for the current game
        InventoryItem[] originalInventoryList =
                FactionSurvivor.getCurrentGame().getInventory();
        
        // clone (make a copy) originallist
        InventoryItem[] inventoryList = originalInventoryList.clone();
        
        // using a BubbleSort to sort the list of inventoryList by name
        InventoryItem tempInventoryItem;
        for (int i = 0; i< inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j+1].getDescription())>0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        return inventoryList;
    }
}
