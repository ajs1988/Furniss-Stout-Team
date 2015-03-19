/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.model;

import byui.cit260.factionSurvivor.control.GameControl;
import static byui.cit260.factionSurvivor.model.Scene.createScenes;

/**
 *
 * @author Andy
 */
public class MapControl {
    public static byui.cit260.factionSurvivor.control.Map createMap() throws MapControlException  {
        //create the Map
        byui.cit260.factionSurvivor.control.Map map = new byui.cit260.factionSurvivor.control.Map(25, 25);
        
        //create the scenes for the game
        Scene[] scenes = createScenes();
        
        //assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }
    
}
