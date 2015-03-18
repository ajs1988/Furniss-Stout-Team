/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.model;

import byui.cit260.factionSurvivor.control.Constants;
import factionsurvivor.FactionSurvivor;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Andy
 */
public class Scene implements Serializable{
    
    private String description;
        //area description
    private int challenge;
        //challenge in location
    private double travelT;
        //travel time
    
    public static Scene[] createScenes() throws MapControlException {
        Game game = FactionSurvivor.getCurrentGame();
        
        Scene[] scenes = new Scene[Constants.NUMBER_OF_SCENES];
 
       Scene startingScene = new Scene();
       startingScene.setDescription (
                "\n You are captured by the Candor faction and thrown in prison"
                        + "Escape!!");
       scenes[sceneType.prisoncell1.ordinal()] = startingScene;
        
       Scene finishScene = new Scene();
       finishScene.setDescription (
                "\n You are captured by the Candor faction and thrown in prison"
                        + "Escape!!");
       scenes[sceneType.opengate.ordinal()] = finishScene;
       
       return scenes;
    }
    public Scene() {
    }

    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getChallenge() {
        return challenge;
    }

    public void setChallenge(int challenge) {
        this.challenge = challenge;
    }

    public double getTravelT() {
        return travelT;
    }

    public void setTravelT(double travelT) {
        this.travelT = travelT;
    }

    @Override
    public String toString() {
        return "Scene{" + "descript=" + description + ", challenge=" + challenge + ", travelT=" + travelT + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + this.challenge;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.travelT) ^ (Double.doubleToLongBits(this.travelT) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.challenge != other.challenge) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelT) != Double.doubleToLongBits(other.travelT)) {
            return false;
        }
        return true;
    }
    
    
    
}
