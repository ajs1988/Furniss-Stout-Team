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
public class ZiplineControlTest {
    
    public ZiplineControlTest() {
    }

    /**
     * Test of zipLine method, of class ZiplineControl.
     */
    @Test
    public void testZipLine() {
        System.out.println("zipLine");
        int harness = 0;
        int rope = 0;
        int brake = 0;
        int anchor = 0;
        ZiplineControl instance = new ZiplineControl();
        boolean expResult = false;
        boolean result = instance.zipLine(harness, rope, brake, anchor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
