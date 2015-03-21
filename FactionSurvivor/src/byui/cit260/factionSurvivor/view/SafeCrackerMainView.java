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
public class SafeCrackerMainView extends View {
    public SafeCrackerMainView(){
        super("\n"
            +"\n----------------------------------------"
            +"\n| SafeCracker Challenge                |"
            +"\n----------------------------------------"
            +"\nF - First computer problem"
            +"\nS - Second Computer problem"
            +"\nT - Third Computer Problem"
            +"\nC - Crack Safe Combination"            
            +"\nE - Exit to Main Menu"
            +"\n----------------------------------------");
       
    }
    @Override
    public boolean doAction(Object obj){
        
        String value = (String) obj;
        
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice) {
            case 'F': // Show character selection Tris
                this.displayFirst();
                
                break;
            case 'S': // Show Character Selection Four
                this.displaySecond();
                break;
            case 'T': // Show Character Selection Christina
                this.displayThird();
                break;
            case 'C': // Show Character Selection Eric
                this.displayCrackSafe();
                break;            
            case 'E': // Exit to previous menu
                return true;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
}

    private void displayFirst() {
        System.out.println("*** displayTris() string ***");
    }

    private void displaySecond() {
        System.out.println("*** displayTris() string ***");
    }

    private void displayThird() {
        System.out.println("*** displayTris() string ***");
    }

    private void displayCrackSafe() {
        System.out.println("*** displayTris() string ***");
    }
}