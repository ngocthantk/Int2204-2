/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CCNE
 */
public class BmiTest {
    @Test
    public void testBMI1() {
        System.out.println("BMI");
        double ccao = 1.65;
        double cnang = 65.0;
        String expResult = "Thua can";
        String result = Bmi.BMI(ccao, cnang);
        assertEquals(expResult, result);    
    }
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        double ccao = 1.65;
        double cnang = 85.0;
        String expResult = "Beo";
        String result = Bmi.BMI(ccao, cnang);
        assertEquals(expResult, result);    
    }
     @Test
    public void testBMI3() {
        System.out.println("BMI");
        double ccao = 1.65;
        double cnang = 55.0;
        String expResult = "Binh thuong";
        String result = Bmi.BMI(ccao, cnang);
        assertEquals(expResult, result);    
    }
     @Test
    public void testBMI4() {
        System.out.println("BMI");
        double ccao = 1.85;
        double cnang = 50;
        String expResult = "Thieu can";
        String result = Bmi.BMI(ccao, cnang);
        assertEquals(expResult, result);    
    }
     @Test
    public void testBMI5() {
        System.out.println("BMI");
        double ccao = 1.65;
        double cnang = 23.0;
        String expResult = "Thieu can";
        String result = Bmi.BMI(ccao, cnang);
        assertEquals(expResult, result);    
    }
}
