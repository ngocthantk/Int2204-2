import static org.junit.Assert.*;
import lab04.Lab04;
import org.junit.Test;

public class TestMax {
    
    public TestMax() {
    }
    
    @Test
    public void testMax_1(){
        assertEquals(10, Lab04.Max(8,10));
    }
    @Test
    public void testMax_2(){
        assertEquals(5, Lab04.Max(-3,5));
    }
    @Test
    public void testMax_3(){
        assertEquals(-3, Lab04.Max(-3,-7));
    }
    @Test
    public void testMax_4(){
        assertEquals(57, Lab04.Max(61,57));
    }
    @Test
    public void testMax_5(){
        assertEquals(169, Lab04.Max(100,169));
    }
}