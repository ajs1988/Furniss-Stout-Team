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
public class GrowItControlTest {
    
    public GrowItControlTest() {
    }

    @Test
    public void testSomeMethod() {
        int seed = 1;
        int sunlight = 1;
        int water = 1;
        int soil = 1;
        boolean expResult = true;
        GrowItControl instance = new GrowItControl();
        boolean resultGro = instance.groIt(seed, sunlight, water, soil);
        asserttrue(resultGro);
        



// TODO review the generated test code and remove the default call to fail.
        
    }

    private void asserttrue(boolean resultGro) {
        
    }
    
}
