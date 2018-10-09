package lab04;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinArrayTest4 {

	@Test
	public void test() {
		int[] arr = {-1,0,3,0,6,13,-3,20,2,1,0,-3,2,100};
		assertEquals(-3, MyProcess.getMinOfArray(arr));
	}

}
