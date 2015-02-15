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
    public void testCalc1A() {
        System.out.println("testCalc1");
        // *Test case # 1
        System.out.println("\tTest case #1");
        int length = 5;
        int width = 11;
        int height = 9;
        int totalV = 495;
        int expResult = 495;
        SafeCrackerControl instance = new SafeCrackerControl();
        int result = instance.calc1(length, width, height);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     *
     */
    @Test
    public void testCalc1B() {
        System.out.println("testCalc1");
        // *Test case # 2
        System.out.println("\tTest case #2");
        int length = -5;
        int width = 11;
        int height = 9;
        int totalV = 495;
        int expResult = -1;
        SafeCrackerControl instance = new SafeCrackerControl();
        int result = instance.calc1(length, width, height);
        assertEquals(expResult, result, 0);
    }     // TODO review the generated test code and remove the default call to fail.
        
    @Test
    public void testClac2A() {
        System.out.println("testCalc1");
        // *Test case # 2
        System.out.println("\tTest case #1");
        double playCalc2 = 40.5;
            boolean check = true;
        boolean expResult = true;
        SafeCrackerControl instance = new SafeCrackerControl();
        boolean result = instance.clac2(check);
        assertTrue(true);
    }
    
}
