/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

import byui.cit260.factionSurvivor.control.SafeCrackerControl;
import byui.cit260.factionSurvivor.exceptions.SafeCrackerException;
import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class SafeCracker2View extends View {
    public SafeCracker2View(){
        super("\n"
            +"\n----------------------------------------"
            +"\n| Second computer problem               |"
            +"\n----------------------------------------"
            +"\nQuestion................................"
            +"\n........................................"
            +"\n........................................"
            +"\n........................................"           
            +"\nE - Exit to Main Menu"
            +"\n----------------------------------------");
       
    }
    public Double getDoubleNumber() {
            Double number = null;
            
            while (number==null) {
                String value = this.getInput();
                value= value.trim().toUpperCase();
                
                if (value.equals("E"))
                    break;
                try {
                //parse and convert number from text to a double
                number = Double.parseDouble(value);
                }
                catch (NumberFormatException nf) {
                    System.out.println("\nYou must enter a valid number."
                    +" Try again or enter E to exit.");
                }
                    }
            return number;
        }
    @Override
    public boolean doAction(Object obj){
        
        
         System.out.println("Please enter your answer with one decimal place.");
        String userinput=getInput();
        double number= Double.parseDouble(userinput);
        try {
            SafeCrackerControl.clac2(number);
        }
        catch (SafeCrackerException sce) {
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