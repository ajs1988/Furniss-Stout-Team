/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.control;

/**
 *
 * @author Andy
 */
public class ServiceControl {
    int ans = 6;
    
    public boolean serviceFood(int per1, int per2, int per3, int daunt, int factLess){
        if (per1 == 1 && per2 == 1 && per3 == 1){
            int da1 = 7 * 32;
            int fa1 = da1 * 6;
            
            return daunt == da1 && factLess == fa1;
            
            
        }
        else {
            return false;}
                
               
    }
}
