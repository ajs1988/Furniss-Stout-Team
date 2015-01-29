/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factionsurvivor;

import byui.cit260.factionSurvivor.model.Player;

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
        
        player1.setName("Four");
        player1.setBestTime(1.00);
        
        String playerInfo = player1.toString();
        System.out.println(playerInfo);
    }
    
}
