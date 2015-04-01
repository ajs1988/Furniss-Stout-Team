/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class CharacterSelectView extends View {
    
    public CharacterSelectView(){
        super("\n"
            +"\n----------------------------------------"
            +"\n| Character Menu                  |"
            +"\n----------------------------------------"
            +"\nT - Tris (the Brave)"
            +"\nF - Four (the Stern)"
            +"\nC - Christina (the Blunt)"
            +"\nR - Eric (the Douchebag)"
            +"\nN - Natalie (the Mother)"            
            +"\nE - Exit to Main Menu"
            +"\n----------------------------------------");
       
    }
    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'T': // Show character selection Tris
                this.displayTris();
                
                break;
            case 'F': // Show Character Selection Four
                this.displayFour();
                break;
            case 'C': // Show Character Selection Christina
                this.displayChristina();
                break;
            case 'R': // Show Character Selection Eric
                this.displayEric();
                break;
            case 'N': // Show Character Selection Natalie
                this.displayNatalie();
            case 'E': // Exit to previous menu
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
}

    private void displayTris() {
        this.console.println("*** displayTris() string ***");    }
            
    private void displayFour() {
        this.console.println("*** displayFour() string ***");
    }

    private void displayChristina() {
        this.console.println("*** displayChristina() string ***");
    }

    private void displayEric() {
        this.console.println("*** displayEric() string ***");
    }

    private void displayNatalie() {
        this.console.println("*** displayNatalie() string ***");
    }
       
}
