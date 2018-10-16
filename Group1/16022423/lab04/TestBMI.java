import static org.junit.Assert.*;
import lab04.Lab04;
import org.junit.Test;

public class TestBMI {
    
    public TestBMI() {
    }
    @Test
    public void TestBMI_1(){
        assertEquals("Beo Phi", Lab04.BMI(100, 1.5));
    }
    @Test
    public void TestBMI_2(){
        assertEquals("Thua Can", Lab04.BMI(47,1.4));
    }
    @Test
    public void TestBMI_3(){
        assertEquals("Thieu Can", Lab04.BMI(42,1.75));
    }
    @Test
    public void TesTBMI_4(){
        assertEquals("Thieu Can", Lab04.BMI(90,1));
    }
    @Test
    public void TestBMI_5(){
        assertEquals("Binh Thuong", Lab04.BMI(55, 1.63));
    }
}