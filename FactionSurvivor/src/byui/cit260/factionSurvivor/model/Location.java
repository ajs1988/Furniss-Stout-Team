/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.model;

import java.io.Serializable;

/**
 *
 * @author Landon
 */
public class Location implements Serializable{
    private int row;
    private int column;
    private int explored;
    private int amountRemaining;

    public Location() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getExplored() {
        return explored;
    }

    public void setExplored(int explored) {
        this.explored = explored;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", explored=" + explored + ", amountRemaining=" + amountRemaining + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.row;
        hash = 47 * hash + this.column;
        hash = 47 * hash + this.explored;
        hash = 47 * hash + this.amountRemaining;
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.explored != other.explored) {
            return false;
        }
        if (this.amountRemaining != other.amountRemaining) {
            return false;
        }
        return true;
    }
    
    
}
