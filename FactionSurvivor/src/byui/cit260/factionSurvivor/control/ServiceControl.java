/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.control;

import byui.cit260.factionSurvivor.exceptions.ServiceException;

/**
 *
 * @author Andy
 */
public class ServiceControl {

    int ans = 6;
    public int per1 = 0;
    public int per2 = 0;
    public int daunt = 224;
    
    
    public static boolean serviceFood(int per1, int per2, int daunt, int factLess) throws ServiceException {

        if (daunt < 224 || daunt > 224) {
            throw new ServiceException("The number of Dauntless is incorrect.");
        }
        if (factLess < 1344 || factLess > 1344) {
            throw new ServiceException("The number of Factionless is incorrect.");
        }
        
        if (per1 == 1 && per2 == 1) {
            int da1 = 7 * 32;
            

            return daunt == da1;

        } 
        throw new ServiceException("Please enter a valid answer");

    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public int getPer1() {
        return per1;
    }

    public void setPer1(int per1) {
        this.per1 = per1;
    }

    public int getPer2() {
        return per2;
    }

    public void setPer2(int per2) {
        this.per2 = per2;
    }

    public int getDaunt() {
        return daunt;
    }

    public void setDaunt(int daunt) {
        this.daunt = daunt;
    }

    
    
}
