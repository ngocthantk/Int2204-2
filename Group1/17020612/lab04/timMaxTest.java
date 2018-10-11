/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class timMaxTest {
    @Test
    public void testFind() {
        int i2 = timMax.tim(9,10);
        assertEquals(10,i2);
    }
    
     @Test
    public void testFind1() {
        int i2 = timMax.tim(6,5);
        assertEquals(6,i2);
    }
    
     @Test
    public void testFind2() {
        int i2 = timMax.tim(-10,10);
        assertEquals(10,i2);
    }
    
     @Test
    public void testFind3() {
        int i2 = timMax.tim(10,10);
        assertEquals(10,i2);
    }
    
     @Test
    public void testFind4() {
        int i2 = timMax.tim(-22,-10);
        assertEquals(-10,i2);
    }

  
    
}
