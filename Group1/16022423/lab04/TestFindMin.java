import static org.junit.Assert.*;
import lab04.Lab04;
import org.junit.Test;

public class TestFindMin {
    
    public TestFindMin() {
    }
    @Test
    public void testFindMin_1(){
        long a1[] = {-69, -20, -60, -1, -5, -10};
        assertEquals(-69, Lab04.findMin(a1));
    }
    @Test
    public void testFindMin_2(){
        long a2[] = {10, 15, 6, 84, 19};
        assertEquals(6, Lab04.findMin(a2));
    }
    @Test
    public void testFindMin_3(){
        long a3[] = {-80, -5 , 10, 23, -1, 19, -50, 20};
        assertEquals(-80, Lab04.findMin(a3));
    }
    @Test
    public void testFindMin_4(){
        long a4[] = {1560, 2125, 3226, 42284, 5156, 1266};
        assertEquals(1266, Lab04.findMin(a4));
    }
    @Test
    public void testFindMin_5(){
        long a5[] = {-80, -5 , 10, 23, -1, 19, -50, 20};
        assertEquals(-50, Lab04.findMin(a5));
    }
}