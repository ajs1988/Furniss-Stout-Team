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
public class AmityView extends View {
    public AmityView(){
        super("\n"
            +"\n----------------------------------------"
            +"\n| Amity Challenge                 |"
            +"\n----------------------------------------"
            +"\nJ - Talk to Jeremy"
            +"\nC - Talk to Cassie"
            +"\nP - Grow Plant(Amity Challenge)"           
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
                this.displayJeremy();
                break;
            case 'F': // Show Character Selection Four
                this.displayCassie();
                break;
            case 'P': // Show Character Selection Christina
                this.displayGrowPlant();
                break;
            case 'E': // Exit to previous menu
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
}

    private void displayJeremy() {
         System.out.println("*** displayTris() string ***");
    }

    private void displayCassie() {
         System.out.println("*** displayTris() string ***");
    }

    private void displayGrowPlant() {
         System.out.println("*** displayTris() string ***");
    }
}