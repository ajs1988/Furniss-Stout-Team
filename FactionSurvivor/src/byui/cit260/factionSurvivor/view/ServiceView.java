/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

import byui.cit260.factionSurvivor.control.ServiceControl;
import byui.cit260.factionSurvivor.exceptions.ServiceException;

/**
 *
 * @author Andy
 */
public class ServiceView extends View {
    /*ServiceControl person1 = new ServiceControl();
     person1.getPer1();
     ServiceControl person2 = new ServiceControl();
     person2.getPer2();
     */

    public ServiceView() {
        super("\n"
                + "\n----------------------------------------"
                + "\n| Service Challenge                    |"
                + "\n----------------------------------------"
                + "\nQuestion................................"
                + "\n........................................"
                + "\n........................................"
                + "\n........................................"
                + "\nJ - Talk to Johnny"
                + "\nS - Talk to Sarah"
                + "\nA - Give Answer"
                + "\nE - Exit to Main Menu"
                + "\n----------------------------------------");

    }

    @Override
    public boolean doAction(Object obj) {
        try {
            ServiceControl.serviceFood(1, 1, 2, 1345);
        } catch (ServiceException se) {
            System.out.println(se.getMessage());
        }

        String value2 = (String) obj;
        String value = (String) obj;
        
            int number = Integer.parseInt(value2);
            if (number != 1344) {
                System.out.println("That is Incorrect!");
            }
            if (number == 1344) {
                System.out.println("That is Correct!");
            }
        
            System.out.println("you must enter in a valid number"
                    + "or select E to exit.");
        

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
