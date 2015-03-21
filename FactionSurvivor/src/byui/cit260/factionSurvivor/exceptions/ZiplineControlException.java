/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.exceptions;

/**
 *
 * @author Landon
 */
public class ZiplineControlException extends Exception{

    public ZiplineControlException() {
    }

    public ZiplineControlException(String string) {
        super(string);
    }

    public ZiplineControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ZiplineControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public ZiplineControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
