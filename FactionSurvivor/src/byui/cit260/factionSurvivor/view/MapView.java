/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

import byui.cit260.factionSurvivor.control.MapControl;
import java.util.Scanner;

/**
 *
 * @author Landon
 */
public class MapView extends View {
        public class MapView() {
        super("Enter the row as a number 1-4, then enter a column as a number 1-4 to move to a location on the map"); 
}
        String sym1 = String starter [0][0];
        
    public void displayTheMap(sym1, sym2, sym3, sym4, sym5, sym6, sym7, sym8, sym9, sym10, sym11, sym12, sym13, sym14, sym15, sym16, sym17, sym18, sym19, sym20, sym21, sym22, sym23, sym24, sym25){
       System.out.println("\n---------------------------------------------");
       System.out.println("\nWelcome to new G");
       System.out.println("\n---------------------------------------------");
       System.out.println("\n     |  1 |  2 |  3 |  4 |  5 |     ");
       System.out.println("\n------------------------------------");
       System.out.println("\n 1  | "+ sym1 +" | "+ sym2 +" | "+ sym3 +" | "+ sym4 +" | "+ sym5 +" |");
       System.out.println("\n-----------------------------------");
       System.out.println("\n 2  | "+ sym6 +" | "+ sym7 +" | "+ sym8 +" | "+ sym9 +" | "+ sym10 +" |");
       System.out.println("\n-----------------------------------");
       System.out.println("\n 3  | "+ sym11 +" | "+ sym12 +" | "+ sym13 +" | "+ sym14 +" | "+ sym15 +" |");
       System.out.println("\n-----------------------------------");
       System.out.println("\n 4  | "+ sym16 +" | "+ sym17 +" | "+ sym18 +" | "+ sym19 +" | "+ sym20 +" |");
       System.out.println("\n-----------------------------------");
       System.out.println("\n 5  | "+ sym21 +" | "+ sym22 +" | "+ sym23 +" | "+ sym24 +" | "+ sym25 +" |");
       System.out.println("\n-----------------------------------");
    }
        
@Override
public boolean doAction(Object obj) {
String value = (String) obj;
value = value.toUpperCase();
char choice = value.charAt(0);
return false;
}
doAction(char choice) {
    

}
}