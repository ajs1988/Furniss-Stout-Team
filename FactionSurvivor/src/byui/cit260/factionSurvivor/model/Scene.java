/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.model;

import factionsurvivor.FactionSurvivor;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Andy
 */
public class Scene implements Serializable{
    
    private String descript;
        //area description
    private int challenge;
        //challenge in location
    private double travelT;
        //travel time
    
    private static Scene[] createScenes() throws MapControlException {
        Game game = FactionSurvivor.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
       Scene startingScene = new Scene();
       startingScene.setDescription (
                "\n You are captured by the Candor faction and thrown in prison"
                        + "Escape!!");
       finishScene.setMapSymbol (" FN ");
       finishScene.SetBlocked(false);
       finishScene.setTravelTime(Double.POSITIVE_INFINITY);
       scenes[SceneType.finish.ordinal()] = finishScene;
    }
    public Scene() {
    }

    
    
    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
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
        return "Scene{" + "descript=" + descript + ", challenge=" + challenge + ", travelT=" + travelT + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.descript);
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
        if (!Objects.equals(this.descript, other.descript)) {
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
