package maxnum;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;

public class Test extends TestCase {
   
	public void testmax1() {
		int i = Maxnum.Findmax(18, 8);
		assertEquals(18, i);
	}

	public void testmax2() {
		int i = Maxnum.Findmax(4, 10);
		assertEquals(10, i);
	}

	public void testmax3() {
		int i = Maxnum.Findmax(14, 27);
		assertEquals(27, i);
	}

	public void testmax4() {
		int i = Maxnum.Findmax(13, 39);
		assertEquals(39, i);
	}

	public void testmax5() {
		int i = Maxnum.Findmax(2, 36);
		assertEquals(36, i);
	}
        
//dua vao 1 mang co 5 phan tu, phan tu nho nhat la 0
	public void testmin1() {
		int [] x = {0, 1, 2, 3, 4};
                int i = Maxnum.findmin(x);
                assertEquals(0, i);
        }
		
//dua vao 1 mang co 6 phan tu, phan tu nho nhat la 1	
	public void testmin2() {
		int [] x = {1, 4, 3, 4, 10, 6};
                int i = Maxnum.findmin(x);
		assertEquals(1, i);
	}
//dua vao 1 mang co 7 phan tu, phan tu nho nhat la -8
	public void testmin3() {
		int [] x = {2, 43, 74, 55, 6, 7, -8};
		int i = Maxnum.findmin(x); 
		assertEquals(-8, i);
	}
//dua vao 1 mang co 8 phan tu, phan tu nho nhat la 5	
	public void testmin4() {
		int [] x = {13, 54, 5, 6, 27, 8, 9, 10};
                int i =Maxnum.findmin(x);
                assertEquals(5, i);
		
	}
//dua vao 1 mang co 9 phan tu, phan tu nho nhat la -7	
	public void testmin5() {
		int [] x = {4, 5, 6, -7, 8, 9, 10, 11, 12};
                int i = Maxnum.findmin(x);
		assertEquals(-7, i);
	}
//test voi chieu cao 1.65m, can nang 53kg
	public void testBMI1() {
		String s =Maxnum.findBMI(1.65, 53);
		assertEquals("Binh thuong", s);
	}
//test voi chieu cao 1.50m, can nang 72kg	
	public void testBMI2() {
		String s = Maxnum.findBMI(1.50, 72);
		assertEquals("Beo phi", s);
	}
//test voi chieu cao 1.75m, can nang 75kg	
	public void testBMI3() {
		String s = Maxnum.findBMI(1.75, 75);
		assertEquals("Thua can", s);
	}
//test voi chieu cao 1.65m, can nang 60kg	
	public void testBMI4() {
		String s = Maxnum.findBMI(1.65, 60);
		assertEquals("Binh thuong", s);
	}
//test voi chieu cao 1.85m, can nang 50kg	
	public void testBMI5() {
		String s = Maxnum.findBMI(1.85, 50);
		assertEquals("Thieu can", s);
	}

}