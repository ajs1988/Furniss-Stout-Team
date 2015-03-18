/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.control;

import static byui.cit260.factionSurvivor.control.MapControl.createScenes;
import byui.cit260.factionSurvivor.model.Location;
import java.io.Serializable;

/**
 *
 * @author Andy
 */
public class Map implements Serializable{
    private int rowCount;
    private int columnCount;
    private Location[][] locations;

    public Map() {
    }
        public Map(int rowCount, int columnCount) {
        if (rowCount < 1 || columnCount < 1) {
            System.out.println("The number of rows and columns must be > 0");
            return;
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        // create 2-D array for Locations objects
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                // create and initialize new Location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setExplored(false);
                
                // assign the Location object to the current position in array
                locations[row][column] = location;
        }
    }   

    }
    Location[][] getlocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
