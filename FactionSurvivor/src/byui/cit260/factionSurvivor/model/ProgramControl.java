/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.model;

import factionsurvivor.FactionSurvivor;

/**
 *
 * @author Andy
 */
public class ProgramControl {

    public static Player createPlayer(String playerName) {
        if (playerName == null) {
            return null;
        }
        Player player1 = new Player();
        player1.setName(playerName);

        FactionSurvivor.setPlayer1(player1); // save the player

        return player1;
    }

}
