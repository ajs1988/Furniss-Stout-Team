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
 * @author Landon
 */
public class PrisonCell implements Serializable{
    private String repeat;
    private String secretToLeave;

    public PrisonCell() {
    }

    
    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    public String getSecretToLeave() {
        return secretToLeave;
    }

    public void setSecretToLeave(String secretToLeave) {
        this.secretToLeave = secretToLeave;
    }

    @Override
    public String toString() {
        return "PrisonCell{" + "repeat=" + repeat + ", secretToLeave=" + secretToLeave + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.repeat);
        hash = 59 * hash + Objects.hashCode(this.secretToLeave);
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
        final PrisonCell other = (PrisonCell) obj;
        if (!Objects.equals(this.repeat, other.repeat)) {
            return false;
        }
        if (!Objects.equals(this.secretToLeave, other.secretToLeave)) {
            return false;
        }
        return true;
    }
    
    
}
