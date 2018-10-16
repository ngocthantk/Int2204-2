
package bmi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class BMITest {
    
    @Test
    public void test1Bm() {
        System.out.println("bm");
        double can = 40.0;
        double cao = 1.65;
        String expResult = "Thiếu cân";
        String result = BMI.bm(can, cao);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void test2Bm() {
        System.out.println("bm");
        double can = 54.0;
        double cao = 1.65;
        String expResult = "Bình thường";
        String result = BMI.bm(can, cao);
        assertEquals(expResult, result);
        
    }
    @Test
    public void test3Bm() {
        System.out.println("bm");
        double can = 60.0;
        double cao = 1.65;
        String expResult = "Thừa cân";
        String result = BMI.bm(can, cao);
        assertEquals(expResult, result);
        
    }
    @Test
    public void test4Bm() {
        System.out.println("bm");
        double can = 80.0;
        double cao = 1.6;
        String expResult = "Béo phì";
        String result = BMI.bm(can, cao);
        assertEquals(expResult, result);
        
    }
    @Test
    public void test5Bm() {
        System.out.println("bm");
        double can = 100;
        double cao = 1.85;
        String expResult = "Thừa cân";
        String result = BMI.bm(can, cao);
        assertEquals(expResult, result);   
    } 
}
