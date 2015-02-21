/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.factionSurvivor.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Landon
 */
public class Cell1ControlTest {
    
    public Cell1ControlTest() {
    }

    /**
     * Test of escapeSequence method, of class Cell1Control.
     */
    @Test
    public void testEscapeSequence() {
        System.out.println("testEscapeSequence");
        System.out.println("Test Case A");
        int keypress = 1;
        int expresult = 1;
        Cell1Control instance = new Cell1Control();
        int result = instance.escapeSequence(keypress);
//        assertFalse(expresult, result, 0);
    }
    
}
