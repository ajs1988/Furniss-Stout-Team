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
        public MapView() {
        super("Enter the row as a number 0-4, then enter a column as a number 0-4 to move to a location on the map"); 
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