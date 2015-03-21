/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.control;

import byui.cit260.factionSurvivor.exceptions.SafeCrackerException;

/**
 *
 * @author Andy
 */
public class SafeCrackerControl {
    public static int calc1(int length, int width, int height) throws SafeCrackerException{
        if (length < 0) {
            throw new SafeCrackerException("Length must be greater than 0");
        }
        if (width < 0) {
            throw new SafeCrackerException("Width must be greater than 0");
        }
        if (height < 0) {
            throw new SafeCrackerException("Height must be greater than 0");
        }
        int totalV = length * width * height;
        return totalV;
    }
    
    public static boolean clac2(double playCalc2) throws SafeCrackerException{
        if (playCalc2 != 40.5) {
            throw new SafeCrackerException("Wrong Answer. Try again.");
        }
                return playCalc2 == 40.5; }
    
    public static double clac3(double celsius) throws SafeCrackerException {
        // F = 9/5 (C + 32)
        // 10 degrees Cesius to Farenheit?
        if (celsius != 10) {
            throw new SafeCrackerException("Wrong Answer. Try again.");
        }
        else {
        double farenheit = 9/5 * (celsius + 32);  
        return 10;
        }
        
}
}
