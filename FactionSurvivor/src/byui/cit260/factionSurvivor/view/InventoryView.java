/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

/**
 *
 * @author Andy
 */
public class InventoryView extends View {
    
    
    public InventoryView(){
        super("\n"
            +"\n----------------------------------------"
            +"\n| Inventory                     |"
            +"\n----------------------------------------"
            +"\nR - Rope                         /1"
            +"\nH - Harness                      /1" 
            +"\nB - Brake mechanism              /1" 
            +"\nA - Anchor                       /1" 
            +"\nS - Seeds                        /1" 
            +"\nW - Water                        /1" 
            +"\nF - Fertilizer                   /1" 
            +"\nL - Light                        /1" 
            +"\nO - Shovel                       /1" 
            +"\nN - Abnegation Stones            /1" 
            +"\nC - Candor Scales                /1" 
            +"\nU - Erudite Water                /1" 
            +"\nD - Dauntless Flame              /1" 
            +"\nM - Amity Plant                  /1"
            +"\nE - Exit to Game Menu"
            +"\n----------------------------------------");
       
    }
    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'R': // Show character selection Tris
                this.displayRope();
                break;
            case 'H': // Show character selection Tris
                this.displayHarness();
                break;
            case 'B': // Show character selection Tris
                this.displayBrake();
                break;    
            case 'A': // Show character selection Tris
                this.displayAnchors();
                break;
            case 'S': // Show character selection Tris
                this.displaySeeds();
                break;
            case 'W': // Show character selection Tris
                this.displayWater();
                break;
            case 'F': // Show character selection Tris
                this.displayFertilizer();
                break;
            case 'L': // Show character selection Tris
                this.displayLight();
                break;
            case 'O': // Show character selection Tris
                this.displayShovel();
                break;
            case 'N': // Show character selection Tris
                this.displayAbnega();
                break;
            case 'C': // Show Character Selection Four
                this.displayCondor();
                break;
            case 'U': // Show Character Selection Christina
                this.displayErudite();
                break;
            case 'D': // Show Character Selection Eric
                this.displayDaunt();
                break;
            case 'M': // Show Character Selection Natalie
                this.displayAmity();
            case 'E': // Exit to previous menu
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
}

    private void displayRope() {
        this.console.println("*** thick line or cord made to support a person ***");
    }

    private void displayHarness() {
        this.console.println("*** Personal device to secure a person to a rope ***");
    }

    private void displayBrake() {
        this.console.println("*** Device used to stop a person while in a zipline ***");
    }

    private void displayAnchors() {
        this.console.println("*** Hooks or devices used to secure rope for use ***");
    }

    private void displaySeeds() {
        this.console.println("*** What plant will they grow into? ***");
    }
    private void displayWater() {
        this.console.println("*** Liquid of life for many things ***");
    }

    private void displayFertilizer() {
        this.console.println("*** It stinks but plants love it ***");
    }

    private void displayLight() {
        this.console.println("*** A UV light almost as good as the sun ***");
    }

    private void displayShovel() {
        this.console.println("*** Dig, Dig, Dig, but you aren't in a mine. yet... ***");
    }

    private void displayAbnega() {
        this.console.println("*** Ornate stones used to choose the Abnegation as your faction.***");
    }

    private void displayCondor() {
        this.console.println("*** The scales used to choose Condor as your faction***");
    }

    private void displayErudite() {
        this.console.println("*** Pure water used to choose Erudite as your faction. ***");
    }

    private void displayDaunt() {
        this.console.println("*** Flames frommthe coals used in choosing dauntless as your faction. ***");
    }

    private void displayAmity() {
        this.console.println("*** Amity plant used in choosing Amity as your faction ***");
    }
}
