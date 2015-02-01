/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Andy
 */
public class Player implements Serializable{
    
    private String name;
    private double bestTime;
    private String inventItem;
        //inventory up to this point
    private int challComplete;
        //number of challenges completed

     public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        
    public double getBestTime() {
        return bestTime;
    }

    public void setBestTime(double bestTime) {
        this.bestTime = bestTime;
    }
    
    public String getInventItem() {
        return inventItem;
    }

    public void setInventItem(String inventItem) {
        this.inventItem = inventItem;
    }

    public int getChallComplete() {
        return challComplete;
    }

    public void setChallComplete(int challComplete) {
        this.challComplete = challComplete;
    }
     
   
    
    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + "inventItem=" + inventItem + "challComplete=" + challComplete + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.name);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.bestTime) ^ (Double.doubleToLongBits(this.bestTime) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.inventItem);
        hash = 71 * hash + this.challComplete;
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bestTime) != Double.doubleToLongBits(other.bestTime)) {
            return false;
        }
        if (!Objects.equals(this.inventItem, other.inventItem)) {
            return false;
        }
        if (this.challComplete != other.challComplete) {
            return false;
        }
        return true;
    }

    
    
}
