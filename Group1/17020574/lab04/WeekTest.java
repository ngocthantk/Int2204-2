/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;
import org.junit.Test;
import org.junit.Assert;
/**
 *
 * @author Dat Anh
 */   
public class WeekTest {
    @Test
    public void testFindMax1()
    {
        Assert.assertEquals(6, Week4.findMax(4, 6));
    }

    @Test
    public void testFindMax2()
    {
        Assert.assertEquals(9, Week4.findMax(1, 9));
    }

    @Test
    public void testFindMax3()
    {

        Assert.assertEquals(15, Week4.findMax(4, 15));
    }

    @Test
    public void testFindMax4()
    {
        Week4 test = new Week4();
        Assert.assertEquals(20, test.findMax(4, 20));
    }

    @Test
    public void testFindMax5()
    {
        Week4 test = new Week4();
        Assert.assertEquals(1, test.findMax(-1, 1));
    }

    @Test
    public void testBMI1()
    {
        Week4 test = new Week4();
        Assert.assertEquals("Binh thuong", test.BMI(1.6, 49));
    }

    @Test
    public void testBMI2()
    {
        Week4 test = new Week4();
        Assert.assertEquals("Binh thuong", test.BMI(1.8, 70));
    }

    @Test
    public void testBMI3()
    {
        Assert.assertEquals("Thieu can", Week4.BMI(1.8, 49));
    }

    @Test
    public void testBMI4()
    {
        Week4 test = new Week4();
        Assert.assertEquals("Thua can", test.BMI(1.5, 55));
    }

    @Test
    public void testBMI5()
    {
        Week4 test = new Week4();
        Assert.assertEquals("Beo phi", test.BMI(1.6, 90));
    }

    @Test
    public void testFindMin1()
    {
        Week4 test = new Week4();
        int[] test1 = {10 , 14, 9, 0, 8, 6};
        Assert.assertEquals(0, test.findMin(test1));
    }

    @Test
    public void testFindMin2()
    {
        Week4 test = new Week4();
        int[] test1 = {0 , 1, 4, 8, 10, 2};
        Assert.assertEquals(0, test.findMin(test1));
    }

    @Test
    public void testFindMin3()
    {
        Week4 test = new Week4();
        int[] test1 = {-4 , 1, 4, 8, 10, 2};
        Assert.assertEquals(-4, test.findMin(test1));
    }

    @Test
    public void testFindMin4()
    {
        Week4 test = new Week4();
        int[] test1 = {11 , -2, 6, 8, 2};
        Assert.assertEquals(-2, test.findMin(test1));
    }

    @Test
    public void testFindMin5()
    {
        Week4 test = new Week4();
        int[] test1 = {50 , 1, 4, 8, 10, 2};
        Assert.assertEquals(1, test.findMin(test1));
    }
    
}
