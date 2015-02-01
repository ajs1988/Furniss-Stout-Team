/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.model;

import java.io.Serializable;

/**
 *
 * @author Andy
 */
public class Zipline implements Serializable {
    //code will have a key entry challenge with a time limit
    //if the player succeeds the key item is given
    private int keyPattern;
    private int keyComplete;

    public Zipline() {
    }

    
    
    public int getKeyPattern() {
        return keyPattern;
    }

    public void setKeyPattern(int keyPattern) {
        this.keyPattern = keyPattern;
    }

    public int getKeyComplete() {
        return keyComplete;
    }

    public void setKeyComplete(int keyComplete) {
        this.keyComplete = keyComplete;
    }

    @Override
    public String toString() {
        return "Zipline{" + "keyPattern=" + keyPattern + ", keyComplete=" + keyComplete + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.keyPattern;
        hash = 67 * hash + this.keyComplete;
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
        final Zipline other = (Zipline) obj;
        if (this.keyPattern != other.keyPattern) {
            return false;
        }
        if (this.keyComplete != other.keyComplete) {
            return false;
        }
        return true;
    }
    
    
}
