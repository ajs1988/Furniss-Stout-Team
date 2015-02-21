/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.control;

/**
 *
 * @author Andy
 */
public class Cell1Control {
    public int escapeSequence(int keypress) {
        if (keypress != 1) {
            return -1;
        }
        else {
            return 1;
        }
}
}
