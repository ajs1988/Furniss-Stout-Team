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
 * @author Andy
 */
public class SafeCrackerControlTest {
    
    public SafeCrackerControlTest() {
    }

    @Test
    public void testCalc1() {
        System.out.println("testCalc1");
        int length = 5;
        int width = 11;
        int height = 9;
        int totalV = 495;
        int expResult = 495;
        SafeCrackerControl instance = new SafeCrackerControl();
        int result = instance.calc1(length, width, height);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
