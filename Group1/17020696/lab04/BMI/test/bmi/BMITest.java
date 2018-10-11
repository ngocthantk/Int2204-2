/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyen Ba Duc
 */
public class BMITest {
    
    public BMITest() {
    }

    /**
     * Test of Check method, of class BMI.
     */
    @Test
    public void testCheck() {
        assertEquals("Thiếu cân",BMI.Check((double) 45,(double) 1.6));
    }
    
    @Test
    public void testCheck1() {
        assertEquals("Thừa cân",BMI.Check((double) 60, (double) 1.6));
    }
    
    @Test
    public void testCheck2() {
        assertEquals("Thiếu cân",BMI.Check((double) 50,(double) 1.7));
    }
    
    @Test
    public void testCheck3() {
        assertEquals("Thiếu cân",BMI.Check((double) 45, (double) 1.5));
    }
    
    @Test
    public void testCheck4() {
        assertEquals("Bình thường",BMI.Check((double) 52,(double) 1.7));
    }
}
