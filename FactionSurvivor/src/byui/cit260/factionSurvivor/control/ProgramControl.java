/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.control;

import byui.cit260.factionSurvivor.model.Player;

/**
 *
 * @author Landon
 */
public class ProgramControl {
    public static Player createPlayer(String playersname) {
        Player player1 = new Player();
        player1.setName(playersname);
        
        return player1;

//        System.out.prinln("\n***** createPlayer function called *****");
    }

}
