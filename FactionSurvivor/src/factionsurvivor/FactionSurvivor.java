/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factionsurvivor;

import byui.cit260.factionSurvivor.model.Actor;
import byui.cit260.factionSurvivor.model.Game;
import byui.cit260.factionSurvivor.model.Inventory;
import byui.cit260.factionSurvivor.model.Location;
import byui.cit260.factionSurvivor.model.Map;
import byui.cit260.factionSurvivor.model.Player;
import byui.cit260.factionSurvivor.model.PrisonCell;

/**
 *
 * @author Andy
 */
public class FactionSurvivor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Player player1 = new Player();
        Game game = new Game();
        Actor actor = new Actor();
        Map map = new Map();
        Location location = new Location();
        Inventory inventory = new Inventory();
        PrisonCell prisonCell = new PrisonCell();
        
        player1.setName("Four");
        player1.setBestTime(1.00);
      
        game.setTotalTime(5.00);
        game.setNumPeople(6);
        
        actor.setActor("Farmer");
        
        map.setColumnCount(2);
        map.setRowCount(4);
        
        location.setRow(3);
        location.setColumn(1);
        location.setExplored(3);
        location.setAmountRemaining(2);
        
        inventory.setInventoryType("survival");
        inventory.setQuantityInStock(5);
        inventory.setRequiredAmount(0);
        inventory.setKeyItem("No");
        
        prisonCell.setRepeat("No");
        prisonCell.setSecretToLeave("Crack");
        
        String playerInfo = player1.toString();
        System.out.println(playerInfo);
      
        String gameInfo = game.toString();
        System.out.println(gameInfo);
        
        String actorInfo = actor.toString();
        System.out.println(actorInfo);
        
        String mapInfo = map.toString();
        System.out.println(mapInfo);
        
        String locationInfo = location.toString();
        System.out.println(locationInfo);
        
        String inventoryInfo = inventory.toString();
        System.out.println(inventoryInfo);
        
        String prisonCellInfo = prisonCell.toString();
        System.out.println(prisonCellInfo);
    }
    
}
