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
    
    private boolean clac2(int playCalc2){
            if (playCalc2 == 40.5) {
                boolean check = true;
                return check; }
    
    private boolean clac3(int playCalc3) {
        return playCalc3 == 75.6;
        
    }
}
