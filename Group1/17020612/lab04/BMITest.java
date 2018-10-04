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
public class BMITest {
    @Test
    public void testBMI()
    {
        String a=BMI.tinhchiso(54.4,1.6);
        assertEquals(a,"Thieu can");
    }
    
    @Test
    public void testBMI1()
    {
        String a=BMI.tinhchiso(68,1.7);
        assertEquals(a,"Bình thường");
    }
    
    @Test
    public void testBMI2()
    {
        String a=BMI.tinhchiso(84,1.75);
        assertEquals(a,"Thừa cân");
    }
    
    @Test
    public void testBMI3()
    {
        String a=BMI.tinhchiso(90,1.72);
        assertEquals(a,"Béo phì");
    }
    
    @Test
    public void testBMI4()
    {
        String a=BMI.tinhchiso(85,1.61);
        assertEquals(a,"Béo phì");
    }
    
}
