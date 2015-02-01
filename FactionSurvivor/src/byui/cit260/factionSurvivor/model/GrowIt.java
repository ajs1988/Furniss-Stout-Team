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
public class GrowIt implements Serializable{
    public int chat1;
    public int chat2;
    public int chat3;
    public int plantGrow;

    public GrowIt() {
    }
    
    

    public int getChat1() {
        return chat1;
    }

    public void setChat1(int chat1) {
        this.chat1 = chat1;
    }

    public int getChat2() {
        return chat2;
    }

    public void setChat2(int chat2) {
        this.chat2 = chat2;
    }

    public int getChat3() {
        return chat3;
    }

    public void setChat3(int chat3) {
        this.chat3 = chat3;
    }

    public int getPlantGrow() {
        return plantGrow;
    }

    public void setPlantGrow(int plantGrow) {
        this.plantGrow = plantGrow;
    }

    @Override
    public String toString() {
        return "GrowIt{" + "chat1=" + chat1 + ", chat2=" + chat2 + ", chat3=" + chat3 + ", plantGrow=" + plantGrow + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.chat1;
        hash = 37 * hash + this.chat2;
        hash = 37 * hash + this.plantGrow;
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
        final GrowIt other = (GrowIt) obj;
        if (this.chat1 != other.chat1) {
            return false;
        }
        if (this.chat2 != other.chat2) {
            return false;
        }
        if (this.chat3 != other.chat3) {
            return false;
        }
        if (this.plantGrow != other.plantGrow) {
            return false;
        }
        return true;
    }
    
    
}
