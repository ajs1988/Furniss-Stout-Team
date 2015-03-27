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

        
        Scene alleyScene = new Scene();
        alleyScene.setDescription(
                "\n You come across a dark mysterious alley.");
        alleyScene.setMapSymbol(" Al ");
        scenes[sceneType.alley.ordinal()] = alleyScene;

        
        Scene streetScene = new Scene();
        streetScene.setDescription(
                "\n A dusty abandoned street.");
        streetScene.setMapSymbol(" St ");
        scenes[sceneType.street.ordinal()] = streetScene;
        
        
        Scene parkScene = new Scene();
        parkScene.setDescription(
                "\n A slighty maintained park. Looks like it hasn't been"
                        + "used in years.");
        parkScene.setMapSymbol(" Pk ");
        scenes[sceneType.park.ordinal()] = parkScene;
        
        
        Scene forestScene = new Scene();
        forestScene.setDescription(
                "\n A thick cover of trees and shrubberies.");
        forestScene.setMapSymbol(" Ft ");
        scenes[sceneType.forest.ordinal()] = forestScene;
        
        
        Scene busstopScene = new Scene();
        busstopScene.setDescription(
                "\n A rundown booth with a creaky bench.");
        parkScene.setMapSymbol(" Bs ");
        scenes[sceneType.busstop.ordinal()] = busstopScene;
        
        Scene trainstationScene = new Scene();
        trainstationScene.setDescription(
                "\n Here is a old subway station with rusted tracks and a"
                    + "few smelly bums.");
        trainstationScene.setMapSymbol(" Ts ");
        scenes[sceneType.trainstation.ordinal()] = trainstationScene;
        
        
        Scene meetinghouseScene = new Scene();
        meetinghouseScene.setDescription(
                "\n A community building. You hear people inside, probably this"
                        + "faction's political leaders.");
        meetinghouseScene.setMapSymbol(" Mh ");
        scenes[sceneType.meetinghouse.ordinal()] = meetinghouseScene;
        
        
        Scene houseScene = new Scene();
        houseScene.setDescription(
                "\n A humble dwellingplace. The paint is falling off the house"
                        + "somebody needs to fix this place up.");
        houseScene.setMapSymbol(" Hs ");
        scenes[sceneType.house.ordinal()] = houseScene;
        
        
        Scene prisoncell2Scene = new Scene();
        prisoncell2Scene.setDescription(
                "\n You awake to find yourself in jail... again you immediately"
                        + "start looking around for a way out. You notice a"
                        + "guard walking up and down the cell block. He seems to"
                        + "be holding a multitool and you also notice a fair"
                        + "sized crack in the wall.");
        prisoncell2Scene.setMapSymbol(" C2 ");
        scenes[sceneType.prisoncell2.ordinal()] = prisoncell2Scene;
        
        
        Scene abnegationScene = new Scene();
        abnegationScene.setDescription(
                "\n You arrive at the Abnegation community. Here lives a people"
                        + "dedicated to service. Everybody here seems kind and"
                        + "doesn't seem to want to cause any trouble for you."
                        + "You might consider talking to a few people.");
        abnegationScene.setMapSymbol(" AG ");
        scenes[sceneType.abnegation.ordinal()] = abnegationScene;
        
        
        Scene candorhqScene = new Scene();
        candorhqScene.setDescription(
                "\n Here lives the law of New Gettysburg. You best watch your"
                        + "step. You wouldn't want to get put back in prison."
                        + "You sneak around looking for something useful. You"
                        + "notice what seems to be a statue of a dragon and you"
                        + "decide to go and take a few of its metal scales off"
                        + "of it. As soon as you do the alarm goes off and you"
                        + "run out of the building.");
        candorhqScene.setMapSymbol(" HQ ");
        scenes[sceneType.candorhq.ordinal()] = candorhqScene;
        
        
        Scene dauntlessScene = new Scene();
        dauntlessScene.setDescription(
                "\n You've arrived into the dauntless faction. Your arrival is"
                        + "met by some challenging stares. These people don't"
                        + "seem to mess around. It seems any one of them could"
                        + "take you on in a fight. They all seem excited about"
                        + "some 'trial' You decide to look for someone who's in"
                        + "charge around here. Maybe they could help you escape.");
        dauntlessScene.setMapSymbol(" DL ");
        scenes[sceneType.dauntless.ordinal()] = dauntlessScene;
        
        
        Scene amityScene = new Scene();
        amityScene.setDescription(
                "\n You arrive into an open field with several workers nearby."
                        + "Everybody seems friendly and cheerful. They ask what"
                        + "your business is and you, tell them of your troubles"
                        + "They take you to their leader and you start"
                        + "conversing with him.");
        amityScene.setMapSymbol(" AF ");
        scenes[sceneType.amity.ordinal()] = amityScene;
        
        
        Scene eruditeScene = new Scene();
        eruditeScene.setDescription(
                "\n You infiltrate the Erudite headquarters. You know that they"
                        + "store a special water here that you need to leave."
                        + "You sneak around till you find a safe. On the safe is"
                        + "a sign that says only the smartest will be able to "
                        + "crack this safe and retrieve the contents.");
        eruditeScene.setMapSymbol(" ER ");
        scenes[sceneType.erudite.ordinal()] = eruditeScene;
        
        
        Scene citygateScene = new Scene();
        citygateScene.setDescription(
                "\n Here is where you will make your escape. All you have to do"
                        + "is find all the factions special items to unlock the"
                        + "way to freedom.");
        citygateScene.setMapSymbol(" CG ");
        scenes[sceneType.park.ordinal()] = citygateScene;
        
        
        
        
        
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
