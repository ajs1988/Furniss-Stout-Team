/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.control;

import byui.cit260.factionSurvivor.exceptions.ZiplineControlException;

/**
 *
 * @author Andy
 */
public class ZiplineControl throws ZiplineControlException {
    public boolean zipLine(int harness, int rope, int brake, int anchor){

        if (harness != 1 || rope != 1 || brake != 1 || anchor != 1) {
            throw new ZiplineControlException("You are missing 1 or more required items.");
        }
        return harness == 1 && rope == 1 && brake == 1 && anchor == 1;
    }
    }
    
