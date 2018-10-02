

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
public class maxTest {
    
    public maxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of max method, of class max.
     */
    @Test
    public void testMax1() {
        System.out.println("max");
        int a = 7;
        int b = 8;
        int expResult = 8;
        int result = max.max(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testMax2() {
        System.out.println("max");
        int a = 7;
        int b = -88;
        int expResult = 7;
        int result = max.max(a, b);
        assertEquals(expResult, result);
        
    }
}
