/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.view;

import factionsurvivor.FactionSurvivor;
import java.io.PrintWriter;

/**
 *
 * @author Andy
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = FactionSurvivor.getOutFile();
    private static final PrintWriter logFile = FactionSurvivor.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
            "--------------------------------------------------------------"
                    + "\n- ERROR - " + errorMessage
                    + "\n---------------------------------------------------------");
           
    
         // Log Error
        logFile.println(className + " - " + errorMessage);
    
    }
    
}
