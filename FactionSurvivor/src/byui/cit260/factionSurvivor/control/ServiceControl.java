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
    int per1 = 0;
    int per2 = 0;
    public static boolean serviceFood(int per1, int per2, int daunt, int factLess) throws ServiceException {

        if (daunt < 224 || daunt > 224) {
            throw new ServiceException("The number of Dauntless is incorrect.");
        }
        if (factLess < 1344 || factLess > 1344) {
            throw new ServiceException("The number of factionless is incorrect.");
        }

        if (per1 == 1 && per2 == 1) {
            int da1 = 7 * 32;
            int fa1 = da1 * 6;

            return daunt == da1 && factLess == fa1;

        } 
        throw new ServiceException("Please enter a valid answer");

    }
}
