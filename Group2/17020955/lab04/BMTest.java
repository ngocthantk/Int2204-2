package javaapplication1;

import org.junit.Test;
import static org.junit.Assert.*;


public class BMTest {
    
    
    @Test
    public void testBM() {
        
        String expResult = "Thiếu cân";
        String result = BM.BM(1.73, 52);
        assertEquals(expResult, result);
        
    }
    public void testBM2() {
 
        String expResult = "Bình thường";
        String result = BM.BM(1.65,60);
        assertEquals(expResult, result);
    }
    public void testBM3() {
     String expResult = "Thừa cân";
     String result = BM.BM(1.6, 61);
     assertEquals(expResult, result);
    }
    public void testBM4() {
     String expResult = "Béo phì";
     String result = BM.BM(1.55, 62);
     assertEquals(expResult, result);
    }
    public void testBM5() {
     String expResult = "Thiếu cân";
     String result = BM.BM(1.75, 50);
     assertEquals(expResult, result);
    }
}

