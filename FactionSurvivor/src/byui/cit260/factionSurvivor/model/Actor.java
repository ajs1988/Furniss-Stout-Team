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
    
    EruditePrisoner ("Erudite in cell 1"),
    DauntlessPrisoner ("Dauntless in cell 1"),
    PrisonGuard ("Guard in cell 2"),
    Jeremy ("Amity member"),
    Cassie ("Amity member"),
    Billy ("Amity child"),
    DauntlessMembers ("The Dauntless group of people"),
    DauntlessOpponent ("Fighting opponent for Dauntless challenge"),
    AbnegationLeader ("Leader of Abnegation faction"),
    ServicePeople ("People you serve in Abnegation challenge");

    private final String description;
    private final Point coordinates;

    Actor(String description) {
    this.description = description;
    coordinates = new Point (1,1);
}

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }
}
