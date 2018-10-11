import org.junit.Test;

import static org.junit.Assert.*;

public class baiTapTest {

    @Test
    public void valueMax() {
    assertEquals(3,baiTap.valueMax(3,2));
    assertEquals(3,baiTap.valueMax(3,1));
    assertEquals(11,baiTap.valueMax(10,0));
    assertEquals(12,baiTap.valueMax(10,12));
    assertEquals(11,baiTap.valueMax(13,0));
    }


    @Test
    public void valueMin() {
        int a[] = {1,2,3,4};
        assertEquals(3,baiTap.valueMin(a,3));
        assertEquals(1,baiTap.valueMin(a,3));
        assertEquals(2,baiTap.valueMin(a,3));
        assertEquals(4,baiTap.valueMin(a,3));
        assertEquals(5,baiTap.valueMin(a,3));
    }

    @Test
    public void chiSoBMI() {
        assertEquals("thieu can",baiTap.chiSoBMI(1.7,60));
        assertEquals("thieu can",baiTap.chiSoBMI(1.7,70));
        assertEquals("thieu can",baiTap.chiSoBMI(1.7,90));
        assertEquals("thua can",baiTap.chiSoBMI(1.7,90));
        assertEquals("binh thuong",baiTap.chiSoBMI(1.7,80));
    }
}