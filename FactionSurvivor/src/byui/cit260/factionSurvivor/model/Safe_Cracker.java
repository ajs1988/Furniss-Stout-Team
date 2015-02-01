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
public class Safe_Cracker implements Serializable{
    
    private double calc1;
    private double clac2;
    private double clac3;
    private int safeOpen;
    //key item is given if all 3 calculations are correct

    public Safe_Cracker() {
    }


    public int getSafeOpen() {
        return safeOpen;
    }

    public void setSafeOpen(int safeOpen) {
        this.safeOpen = safeOpen;
    }

    
    
    public double getCalc1() {
        return calc1;
    }

    public void setCalc1(double calc1) {
        this.calc1 = calc1;
    }

    public double getClac2() {
        return clac2;
    }

    public void setClac2(double clac2) {
        this.clac2 = clac2;
    }

    public double getClac3() {
        return clac3;
    }

    public void setClac3(double clac3) {
        this.clac3 = clac3;
    }

    @Override
    public String toString() {
        return "Safe_Cracker{" + "calc1=" + calc1 + ", clac2=" + clac2 + ", clac3=" + clac3 +", safeOpen=" + safeOpen + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.calc1) ^ (Double.doubleToLongBits(this.calc1) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.clac2) ^ (Double.doubleToLongBits(this.clac2) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.clac3) ^ (Double.doubleToLongBits(this.clac3) >>> 32));
        hash = 97 * hash + this.safeOpen;
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
        final Safe_Cracker other = (Safe_Cracker) obj;
        if (Double.doubleToLongBits(this.calc1) != Double.doubleToLongBits(other.calc1)) {
            return false;
        }
        if (Double.doubleToLongBits(this.clac2) != Double.doubleToLongBits(other.clac2)) {
            return false;
        }
        if (Double.doubleToLongBits(this.clac3) != Double.doubleToLongBits(other.clac3)) {
            return false;
        }
        if (this.safeOpen != other.safeOpen) {
            return false;
        }
        return true;
    }

    
    
}
