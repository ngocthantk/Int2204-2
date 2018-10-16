import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
public class testmax extends TestCase {
//test1 voi 2 so 2 va 5
	public void testmax1() {
		int i = maxnum.Findmax(2, 5);
		assertEquals(5, i);
        }
//test2 voi 2 so 10 va 7
	public void testmax2() {
		int i = maxnum.Findmax(10, 7);
		assertEquals(10, i);
        }
//tes3 voi 2 so 11 va 18
	public void testmax3() {
		int i = maxnum.Findmax(11, 18);
		assertEquals(18, i);
        }  
//test4 voi 2 so 12 va 20
	public void testmax4() {
		int i = maxnum.Findmax(12, 20);
		assertEquals(20, i);
        }
//test5 voi 2 so 29 va 9
	public void testmax5() {
		int i = maxnum.Findmax(29, 9);
		assertEquals(29, i);
        }
}