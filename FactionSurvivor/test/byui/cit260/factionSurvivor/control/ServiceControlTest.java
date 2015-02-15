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
public class ServiceControlTest {
    
    public ServiceControlTest() {
    }

    @Test
    public void testSomeMethod() {
        int per1 = 0;
        int per2 = 0;
        int per3 = 0;
        int daunt = 0;
        int factLess = 0;
        boolean expResult = false;
        ServiceControl instance = new ServiceControl();
        boolean resultSer = instance.serviceFood(per1, per2, per3, daunt, factLess);
        asserttrue(resultSer);


// TODO review the generated test code and remove the default call to fail.
        
    }

    private void asserttrue(boolean resultSer) {
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
