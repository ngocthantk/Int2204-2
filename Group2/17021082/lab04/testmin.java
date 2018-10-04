import junit.framework.TestCase;
public class testmin extends TestCase {
//dua vao 5 phan tu, phan tu nho nhat la 1
    public void testmin1()  {
        int[]a = {1,2,3,4,5};
        int i = Minnum.find(a);
        assertEquals(1, i);
    }
//dua vao 6 phan tu, phan tu nho nhat la 2
    public void testmin2()  {
        int[]a = {2,3,4,5,7,10};
        int i = Minnum.find(a);
        assertEquals(2, i);
    }
//dua vao 7 phan tu, phan tu nho nhat la 3
    public void testmin3()  {
        int[]a = {6,7,8,9,3,4,5};
        int i = Minnum.find(a);
        assertEquals(3, i);
    }
//dua vao 8 phan tu, phan tu nho nhat la 4
    public void testmin4()  {
        int[]a = {10,11,12,14,13,15,4,5};
        int i = Minnum.find(a);
        assertEquals(4, i);
    }
//dua vao 3 phan tu, phan tu nho nhat la 5
    public void testmin5()  {
        int[]a = {10,15,5};
        int i = Minnum.find(a);
        assertEquals(5, i);
    }
}
