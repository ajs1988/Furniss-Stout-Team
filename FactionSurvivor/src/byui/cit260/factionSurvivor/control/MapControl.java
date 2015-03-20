/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.control;

import byui.cit260.factionSurvivor.exceptions.MapControlException;
import byui.cit260.factionSurvivor.model.Actor;
import byui.cit260.factionSurvivor.model.Game;
import byui.cit260.factionSurvivor.model.Location;
import byui.cit260.factionSurvivor.model.Map;
import byui.cit260.factionSurvivor.model.Scene;
import byui.cit260.factionSurvivor.model.sceneType;
import factionsurvivor.FactionSurvivor;

/**
 *
 * @author Andy
 */
public class MapControl {
    
    static Map createMap() throws MapControlException {
        //create the Map
        Map map = new Map(25, 25);

        //create the scenes for the game
        Scene[] scenes = createScenes();

        //assign scenes to locations
        MapControl.assignScenesToLocations(map, scenes);
        moveActorsToStartingLocation(map);
        return map;
    }
    
    public static Scene[] createScenes() throws MapControlException {
        Game game = FactionSurvivor.getCurrentGame();
        
        Scene[] scenes = new Scene[Constants.NUMBER_OF_SCENES];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "\n You are captured by the Candor faction and thrown in prison"
                + "Escape!!");
        startingScene.setMapSymbol(" ST ");
        scenes[sceneType.prisoncell1.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\n You turn the key and the wall slowly slides apart."
                + "Freedom!!");
        finishScene.setMapSymbol(" FN ");
        scenes[sceneType.opengate.ordinal()] = finishScene;
        
        return scenes;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

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
    
    static void moveActorsToStartingLocation(Map map) throws MapControlException {
        if (map == null) {
            throw new MapControlException("map is null");
        }
        // for every actor
        // get the actor and 
        Actor[] actors = Actor.values();
        Location[][] locations = map.getLocations();
        for (Actor actor : actors) {
            // put actor into the starting location in the locations array
          
           Location location = locations[actor.getCoordinates().x][actor.getCoordinates().y];
           location.getActors().add(actor);
            
        }
        
    }
}
