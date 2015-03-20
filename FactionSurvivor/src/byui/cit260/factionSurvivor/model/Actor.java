/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Landon
 */
public enum Actor implements Serializable {
    
    EruditePrisoner ("Erudite in cell 1", 0,0),
    DauntlessPrisoner ("Dauntless in cell 1", 0,0),
    PrisonGuard ("Guard in cell 2", 0,0),
    Jeremy ("Amity member", 0,0),
    Cassie ("Amity member", 0,0),
    Billy ("Amity child", 0,0),
    DauntlessMembers ("The Dauntless group of people", 0,0),
    DauntlessOpponent ("Fighting opponent for Dauntless challenge", 0,0),
    AbnegationLeader ("Leader of Abnegation faction", 0,0),
    ServicePeople ("People you serve in Abnegation challenge", 0,0);

    private final String description;
    private final Point coordinates;

    Actor(String description, int row, int column) {
    this.description = description;
    coordinates = new Point (row, column);
}

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
}
