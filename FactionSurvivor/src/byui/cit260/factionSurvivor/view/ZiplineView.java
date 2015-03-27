/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

import byui.cit260.factionSurvivor.control.ZiplineControl;
import byui.cit260.factionSurvivor.exceptions.ZiplineControlException;

/**
 *
 * @author Landon
 */
public class ZiplineView extends View {

    public ZiplineView() {
        super("\n"
                + "\nYou come upon a steep dropoff. You see a post with a line"
                + "\nleading down into the Dauntless Faction. You muster up some."
                + "\ncourage. You have a couple options.-------------------------"
                + "\nA - Attempt to Zipline Down using a rope, harness, brake, and"
                + "\n anchor.----------------------------------------------------"
                + "\n------------------------------------------------------------"
                + "\nE - Leave and go somewhere else.----------------------------");
    }

    @Override
    public boolean doAction(Object obj) {
        try {
            ZiplineControl.zipLine(1, 1, 1, 1); //attempt a try catch 
        } 
        catch (ZiplineControlException zce) {
            System.out.println(zce.getMessage());
        }
        String value = (String) obj;

        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'A': // Call Zipline Control Function
                this.displayAction();
                break;
            case 'E': // Exit to previous menu
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
private void displayAction(){
    
}
}
