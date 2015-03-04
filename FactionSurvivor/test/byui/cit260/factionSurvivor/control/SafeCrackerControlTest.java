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
        System.out.println("\tTest case #1A");
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
    @Test
    public void testCalc1B() {
        System.out.println("testCalc1");
        // *Test case # 2
        System.out.println("\tTest case #1B");
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
        System.out.println("testCalc2");
        // *Test case # 2
        System.out.println("\tTest case #2A");
        double playCalc2 = 40.5;
        boolean expResult = true;
        SafeCrackerControl instance = new SafeCrackerControl();
        boolean resultCalc2 = instance.clac2(playCalc2);
        assertTrue(resultCalc2);
    }
        @Test
        public void testClac2B() {
        System.out.println("testCalc2");
        // *Test case # 2
        System.out.println("\tTest case #2B");
        double playCalc2 = 36.5;
        boolean expResult = false;
        SafeCrackerControl instance = new SafeCrackerControl();
        boolean resultCalc2 = instance.clac2(playCalc2);
        assertFalse(resultCalc2);
    }

       
       @Test
        public void testClac3A() {
        System.out.println("testCalc3");
        // *Test case # 2
        System.out.println("\tTest case #3A");
        double celsius = 10;
        double farenheit = 75.6;
        double expResult = 75.6;
        SafeCrackerControl instance = new SafeCrackerControl();
        double resultClac3 = instance.clac3(farenheit);
        assertEquals(expResult, resultClac3);
    }
        @Test
        public void testClac3B() {
        System.out.println("testCalc3");
        // *Test case # 2
        System.out.println("\tTest case #3B");
        double farenheit = 77.3;
        double expResult = 75.6;
        SafeCrackerControl instance = new SafeCrackerControl();
        double resultClac3 = instance.clac3(farenheit);
        assertEquals(expResult, resultClac3);
    }
        @Test
        public void testClac3C() {
        System.out.println("testCalc3");
        // *Test case # 2
        System.out.println("\tTest case # 3C");
        double celsius = 5;
        double expResult = -1;
        SafeCrackerControl instance = new SafeCrackerControl();
        double resultClac3 = instance.clac3(celsius);
        assertEquals(expResult, resultClac3);
        }
        
    private void asserttrue(boolean resultCalc2) {
    }  
    private void assertfalse(boolean resultCalc2) {
        }
    private void assertEquals(double expResult, double resultClac3) {
    }
    private void assertEquals(int expResult, int result, int i) {
    }

}
