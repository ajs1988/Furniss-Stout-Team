/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.control;

/**
 *
 * @author Andy
 */
public class MapControl {

    static Map createMap() {
        //create the Map
        Map map = new Map(25, 25);
        
        //create the scenes for the game
        Scene[] scenes = createScenes();
        
        //assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);
                
        return map;
    }
    static void createScenes() {
        System.out.println("*** called createScenes() ***");
    }
    static void moveActorsToStartingLocation(Map map) {
        System.out.println("*** called moveActorsToStartingLocation() ***");

    }
}