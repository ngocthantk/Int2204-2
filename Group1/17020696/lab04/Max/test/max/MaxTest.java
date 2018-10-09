/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen Ba Duc
 */
public class MaxTest {
    
    public MaxTest() {
    }

    /**
     * Test of max2 method, of class Max.
     */
    @Test
    public void testMax1() {
        assertEquals(15,Max.max2(15,5));
    }
    
    @Test
    public void testMax2() {
        assertEquals(30,Max.max2(15,25));
    }
    
    @Test
    public void testMax3() {
        assertEquals(26,Max.max2(26,4));
    }
    
    @Test
    public void testMax4() {
        assertEquals(55,Max.max2(55,35));
    }
    
    @Test
    public void testMax5() {
        assertEquals(100,Max.max2(100,52));
    }

}
