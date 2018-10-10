/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticjunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MyPC
 */
public class BMITest {
    
    
    @Test
    public void testIndexBMI1() {
        
        double m = 50;
        double h = 1.7;
        String a = BMI.indexBMI(m, h);
        assertEquals(a, "Thieu can");
        
    }
    @Test
    public void testIndexBMI2() {
        
        double m = 90;
        double h = 1.6;
        String a = BMI.indexBMI(m, h);
        assertEquals(a, "Beo phi");
        
    }
    @Test
    public void testIndexBMI3() {
        
        double m = 70;
        double h = 1.7;
        String a = BMI.indexBMI(m, h);
        assertEquals(a, "Binh thuong");
        
    }
    @Test
    public void testIndexBMI4() {
        
        double m = 100;
        double h = 1.7;
        String a = BMI.indexBMI(m, h);
        assertEquals(a, "Binh thuong");
        
    }
    @Test
    public void testIndexBMI5() {
        
        double m = 30;
        double h = 1.7;
        String a = BMI.indexBMI(m, h);
        assertEquals(a, "Thua can");
        
    }
    
}
