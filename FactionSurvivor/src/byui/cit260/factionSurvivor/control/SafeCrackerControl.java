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
    private boolean calc1(int length, int width, int height) {
        double totalV = length * width * height;
        return totalV == 495;
    }
    
    private boolean clac2(double playCalc2){
            return playCalc2 == 40.5;
    }
    
    private boolean clac3(int playCalc3) {
        return playCalc3 == 50;
        
    }
}
