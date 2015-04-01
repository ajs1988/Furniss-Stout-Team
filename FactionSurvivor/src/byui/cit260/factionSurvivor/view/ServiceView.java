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
public class ServiceView extends View {
    public ServiceView(){
        super("\n"
            +"\n----------------------------------------"
            +"\n| Service Challenge                    |"
            +"\n----------------------------------------"
            +"\nQuestion................................"
            +"\n........................................"
            +"\n........................................"
            +"\n........................................"
            +"\nJ - Talk to Johnny"
            +"\nS - Talk to Sarah"
            +"\nE - Exit to Main Menu"
            +"\n----------------------------------------");
       
    }
    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'J': // Show character selection Tris
                this.displayJohnny();
                break;
            case 'S': // Show Character Selection Four
                this.displaySarah();
                break;            
            case 'E': // Exit to previous menu
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
}

    private void displayJohnny() {
        this.console.println("*** displayTris() string ***");
    }

    private void displaySarah() {
        this.console.println("*** displayTris() string ***");
    }
}
