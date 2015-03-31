/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

import byui.cit260.factionSurvivor.control.SafeCrackerControl;
import byui.cit260.factionSurvivor.exceptions.SafeCrackerException;

/**
 *
 * @author Andy
 */
public class SafeCracker3View extends View {
    public SafeCracker3View(){
        super("\n"
            +"\n----------------------------------------"
            +"\n| Third computer problem                 |"
            +"\n----------------------------------------"
            +"\nQuestion................................"
            +"\n........................................"
            +"\n........................................"
            +"\n........................................"            
            +"\nE - Exit to Main Menu"
            +"\n----------------------------------------");
       
    }
    @Override
    public boolean doAction(Object obj){

        try {
            SafeCrackerControl.clac3(10);
        }
        catch(SafeCrackerException sce) {
            System.out.println(sce.getMessage());
        }

        
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'A': // Show character selection Tris
                this.displayAnswer();
                
                break;
            case 'E': // Exit to previous menu
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
}

    private void displayAnswer() {
       System.out.println("*** displayTris() string ***");
    }
}
