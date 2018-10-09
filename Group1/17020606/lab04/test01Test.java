import org.junit.Assert;
import org.junit.Test;

public class test01Test{

    @Test
    public void testFindMax1()
    {
        Assert.assertEquals(6, test01.GTLN(4, 6));
    }

    @Test
    public void testFindMax2()
    {
        Assert.assertEquals(9,  test01.GTLN(1, 9));
    }

    @Test
    public void testFindMax3()
    {
        Assert.assertEquals(15,  test01.GTLN(4, 15));
    }

    @Test
    public void testFindMax4()
    {
        Assert.assertEquals(20,  test01.GTLN(4, 20));
    }

    @Test
    public void testFindMax5()
    {
        Assert.assertEquals(1,  test01.GTLN(-1, 1));
    }

    @Test
    public void testBMI1()
    {
        Assert.assertEquals("Binh thuong", test01.BMI(1.6, 49));
    }

    @Test
    public void testBMI2()
    {
        Assert.assertEquals("Binh thuong", test01.BMI(1.8, 70));
    }

    @Test
    public void testBMI3()
    {
        Assert.assertEquals("Thieu can", test01.BMI(1.8, 49));
    }

    @Test
    public void testBMI4()
    {
        Assert.assertEquals("Thua can", test01.BMI(1.5, 55));
    }

    @Test
    public void testBMI5()
    {
        Assert.assertEquals("Beo phi", test01.BMI(1.6, 90));
    }

    @Test
    public void testFindMin1()
    {
        int[] a= {10 , 14, 9, 0, 8, 6};
        Assert.assertEquals(0, test01.GTNN(a));
    }

    @Test
    public void testFindMin2()
    {
        int[] a = {0 , 1, 4, 8, 10, 2};
        Assert.assertEquals(0, test01.GTNN(a));
    }

    @Test
    public void testFindMin3()
    {
        int[] a = {-4 , 1, 4, 8, 10, 2};
        Assert.assertEquals(-4, test01.GTNN(a));
    }

    @Test
    public void testFindMin4()
    {
        int[] a = {11 , -2, 6, 8, 2};
        Assert.assertEquals(-2, test01.GTNN(a));
    }

    @Test
    public void testFindMin5()
    {
        int[] a = {50 , 1, 4, 8, 10, 2};
        Assert.assertEquals(1, test01.GTNN(a));
    }
}