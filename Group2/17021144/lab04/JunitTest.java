package junit;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Admin
 */
public class JunitTest {
    
    /**
     * Test of max method, of class Junit.
     */
    @Test
    public void testMax1() {
        System.out.println("--- Test gia tri lon nhat cua 2 so la ---");
        int result = Junit.max(3, 4);
        assertEquals(4, result);     
    }   
     @Test
     public void testMax2(){
        int result = Junit.max(6, 7);
        assertEquals(7, result );
    }
    @Test
     public void testMax3(){
        int result = Junit.max(5, 4);
        assertEquals(5, result );
    }
    @Test
     public void testMax4(){
        int result = Junit.max(1, 9);
        assertEquals(9, result );
    }
    @Test
    public void testMax5() {
       int result = Junit.max(2, 3);
       assertEquals(3, result );
    }

    /**
     * Test of min method, of class Junit.
     */
    @Test
    public void testMin1() {
        System.out.println("--- Test gia tri nho nhat cua mang arr ---");
       
        int[]a = {3,7,9,12,4,6};
        int result = Junit.min(a);      
        assertEquals(3, result);   
    }
    @Test
    public void testMin2() {
        int[]a = {1,2,3,4,5,6};
        int result = Junit.min(a); 
      
        assertEquals(1, result);   
    }
    @Test
    public void testMin3() {
        int[]a = {5,4,5,7,8,9,12};
        int result = Junit.min(a); 
        
        assertEquals(4, result);   
    }
    @Test
    public void testMin4() {
        int[]a = {0,1,2,4,5,6};
        int result = Junit.min(a); 
        assertEquals(0, result);   
    }
    
    @Test
    public void testMin5() {
        int[]a = {4,7,9};
        int result = Junit.min(a); 
        assertEquals(4, result);   
    }
    
    /**
     * Test of MBI method, of class Junit.
    */
    @Test
    public void testMBI1() {
        System.out.println("--- Test gia tri cua mbi ---");  
        String result = Junit.MBI(50, 1.5);
       assertEquals("Binh thuong", result);
    }
     @Test
    public void testMBI2() {
        String result = Junit.MBI(40, 1.55);
       assertEquals("Thieu can", result);
    }
    @Test
    public void testMBI3() {
      
        String result = Junit.MBI(62, 1.6);
       assertEquals("Thua can", result);
    }
    @Test
    public void testMBI4() {
       String result = Junit.MBI(45, 1.4);
        assertEquals("Binh thuong", result);
    }
    @Test
    public void testMBI5() {
       String result = Junit.MBI(90, 1.6);
        assertEquals("Beo phi", result);
    }
}
