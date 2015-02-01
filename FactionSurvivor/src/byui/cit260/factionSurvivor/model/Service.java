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
public class Service implements Serializable{
    
    private int giveFood;
    private int serviceGiven;

    public Service() {
    }

    
    
    public int getGiveFood() {
        return giveFood;
    }

    public void setGiveFood(int giveFood) {
        this.giveFood = giveFood;
    }

    public int getServiceGiven() {
        return serviceGiven;
    }

    public void setServiceGiven(int serviceGiven) {
        this.serviceGiven = serviceGiven;
    }

    @Override
    public String toString() {
        return "Service{" + "giveFood=" + giveFood + ", serviceGiven=" + serviceGiven + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.giveFood;
        hash = 83 * hash + this.serviceGiven;
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
        final Service other = (Service) obj;
        if (this.giveFood != other.giveFood) {
            return false;
        }
        if (this.serviceGiven != other.serviceGiven) {
            return false;
        }
        return true;
    }
    
    
}
