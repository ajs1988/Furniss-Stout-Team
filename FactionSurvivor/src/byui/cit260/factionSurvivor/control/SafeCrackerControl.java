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
public class SafeCrackerControl {
    public int calc1(int length, int width, int height) {
        if (length < 0) {
            return -1;
        }
        if (width < 0) {
            return -1;
        }
        if (height < 0) {
            return -1;
        }
        int totalV = length * width * height;
        return totalV;
    }
    
    boolean clac2(double playCalc2){
                return playCalc2 == 40.5; }
    
    double clac3(double celsius) {
        // F = 9/5 (C + 32)
        // 10 degrees Cesius to Farenheit?
        if (celsius != 10) {
            return -1;
        }
        else {
        double farenheit = 9/5 * (celsius + 32);  
        return 10;
        }

        
}
}
